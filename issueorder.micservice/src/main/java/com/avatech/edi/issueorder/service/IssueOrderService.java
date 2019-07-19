package com.avatech.edi.issueorder.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import com.avatech.edi.issueorder.repository.IssueOrderRepository;
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
import java.util.Map;

@Service
public class IssueOrderService{


    private final Logger logger = LoggerFactory.getLogger(IssueOrderService.class);

    @Autowired
    private IssueOrderRepository issueOrderRepository;


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


    @Transactional
    public void saveIssueOrder(IssueOrder order){
        issueOrderRepository.saveIssueOrder(order);
    }



    public void createIssueOrder(HttpHeaders headers, String postUrl, IssueOrder issueOrder) throws Exception {
        logger.info("同步发货信息:{}", issueOrder.toString());
        try {
            //3、添加发货单表
            HttpEntity<String> orderEntry = new HttpEntity<String>(getOrderString(issueOrder), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("发货单据同步成功");
                issueOrder.setIsSync("Y");
                issueOrder.setSyncDate(new Date());
                issueOrder.setSyncMessage("Sync successful");
                Map node = new ObjectMapper().readValue(response.getBody(), Map.class);
                issueOrder.setSapDocEntry(node.get("DocEntry").toString());
            } else {
                logger.info("单据同步失败");
                issueOrder.error("E", response.getBody(), issueOrder.getErrorTime() + 1);
            }
        }catch (HttpClientErrorException e){
            logger.error(e.getResponseBodyAsString());
            issueOrder.error("E", e.getResponseBodyAsString().substring(0,e.getResponseBodyAsString().length() > 199?199:e.getResponseBodyAsString().length()), issueOrder.getErrorTime() + 1);
        }catch (HttpServerErrorException e){
            logger.error(e.getResponseBodyAsString());
            issueOrder.error("E", e.getResponseBodyAsString().substring(0,e.getResponseBodyAsString().length() > 199?199:e.getResponseBodyAsString().length()), issueOrder.getErrorTime() + 1);
        }catch (Exception e) {
            logger.info("单据同步失败",e);
            issueOrder.error("E", e.getMessage().substring(0,e.getMessage().length()<199?199:e.getMessage().length()), issueOrder.getErrorTime() + 1);
        }
    }


    private String getOrderString(IssueOrder issueOrder){
        JSONArray DocumentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONArray BatchNumbers = null;
        JSONObject objLine = null;
        JSONObject BatchNumber ;

        requestJson.put("DocDate",issueOrder.getDocDate());//过账日期(YYYY-MM-DD)
        requestJson.put("Comments",issueOrder.getComments());//备份
        //明细
        for(IssueOrderItem item:issueOrder.getIssueOrderItems()){
            objLine = new JSONObject();
            //objLine.put("ItemCode",item.getItemCode());//物料编号
            objLine.put("Quantity",item.getQuantity());//数量
            objLine.put("InventoryQuantity",item.getQuantity());
            objLine.put("WhsCode",item.getWhsCode());//仓库
            objLine.put("BaseType","0");//基于类型
            objLine.put("BaseEntry",item.getBaseEntry());//
            objLine.put("BaseLine",item.getBaseLine());//销售订单行号
            objLine.put("unitMsr",item.getUnitMsr());//单位
            //批次
            BatchNumbers = new JSONArray();
            for(IssueOrderBatchItem purItem:item.getIssueOrderBatchItems()){
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