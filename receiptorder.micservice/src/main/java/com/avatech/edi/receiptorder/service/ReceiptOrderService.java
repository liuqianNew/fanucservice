package com.avatech.edi.receiptorder.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderBatchItem;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderItem;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ReceiptOrderService{

    private final Logger logger = LoggerFactory.getLogger(ReceiptOrderService.class);

    @Autowired
    private ReceiptOrderRepository receiptOrderRepository;

    @Transactional
    public void saveReceiptOrder(ReceiptOrder order){
        receiptOrderRepository.saveReceiptOrder(order);
    }

    @Transactional
    public List<ReceiptOrder> fetchReceiptOrder(){
        return receiptOrderRepository.fetchReceiptOrders();
    }

    public RestTemplate getRestTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        TrustStrategy acceptingTrustStrategy = new TrustStrategy() {
            @Override
            public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                return true;
            }
        };
        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext, new NoopHostnameVerifier());
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }

    public void createReceiptOrder(HttpHeaders headers, String postUrl, ReceiptOrder receiptOrder) throws Exception {
        logger.info("同步生产收货信息:{}", receiptOrder.toString());
        try {
            //3、添加发货单表
            HttpEntity<String> orderEntry = new HttpEntity<String>(getOrderString(receiptOrder), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("生产收货同步成功");
                receiptOrder.setIsSync("Y");
                receiptOrder.setSyncDate(new Date());
                receiptOrder.setSyncMessage("Sync successful");
                Map node = new ObjectMapper().readValue(response.getBody(), Map.class);
                receiptOrder.setSapDocEntry(node.get("DocEntry").toString());
            } else {
                logger.info("单据同步失败");
                receiptOrder.error("E", response.getBody(), receiptOrder.getErrorTime() + 1);
            }
        } catch (HttpClientErrorException e) {
            logger.error(e.getResponseBodyAsString());
            receiptOrder.error("E", e.getResponseBodyAsString().substring(0, e.getResponseBodyAsString().length() > 199 ? 199 : e.getResponseBodyAsString().length()), receiptOrder.getErrorTime() + 1);
        } catch (HttpServerErrorException e) {
            logger.error(e.getResponseBodyAsString());
            receiptOrder.error("E", e.getResponseBodyAsString().substring(0, e.getResponseBodyAsString().length() > 199 ? 199 : e.getResponseBodyAsString().length()), receiptOrder.getErrorTime() + 1);
        } catch (Exception e) {
            logger.info("单据同步失败", e);
            receiptOrder.error("E", e.getMessage().substring(0, e.getMessage().length() < 199 ? 199 : e.getMessage().length()), receiptOrder.getErrorTime() + 1);
        }
    }


    private String getOrderString(ReceiptOrder receiptOrder){
        JSONArray DocumentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONArray BatchNumbers = null;
        JSONObject objLine = null;
        JSONObject BatchNumber ;

        requestJson.put("DocDate","2019-07-12");//过账日期(YYYY-MM-DD)
        requestJson.put("Comments",receiptOrder.getComments());//备份
        //明细
        for(ReceiptOrderItem item:receiptOrder.getreceiptOrderItems()){
            objLine = new JSONObject();
            objLine.put("BaseType","202");//基于类型
            objLine.put("BaseEntry",item.getBaseEntry());//
            //批次
            BatchNumbers = new JSONArray();
            for(ReceiptOrderBatchItem purItem:item.getreceiptOrderBatchItems()){
                BatchNumber = new JSONObject();
                BatchNumber.put("BatchNumber",purItem.getBatchNum());
                BatchNumber.put("Quantity",purItem.getQuantity());
                BatchNumbers.add(BatchNumber);
            }
            if(BatchNumbers.size() > 0) {
                objLine.put("BatchNumbers", BatchNumbers);//销售订单行号
            }
            DocumentLines.add(objLine);
        }

        requestJson.put("DocumentLines",DocumentLines);
        return requestJson.toString();
    }

}
