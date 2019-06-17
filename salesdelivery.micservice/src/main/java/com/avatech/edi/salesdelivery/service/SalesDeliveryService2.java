package com.avatech.edi.salesdelivery.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryBatchItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;

@Service
@Slf4j
public class SalesDeliveryService2{

    private final Logger logger = LoggerFactory.getLogger(SalesDeliveryService.class);

    @Autowired
    private SalesDeliveryService salesDeliveryRepository;

    @Transactional
    public void saveSalesDelivery(SalesDelivery order){
        salesDeliveryRepository.saveSalesDelivery(order);
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

    public void createSalesDelivery(HttpHeaders headers,String postUrl,SalesDelivery salesDelivery) throws Exception {
        logger.info("同步銷售發貨信息:%s", salesDelivery.toString());
        try {
            //3、添加销售发货表
            HttpEntity<String> orderEntry = new HttpEntity<String>(getOrderString(salesDelivery), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("銷售外向交貨单 据同步成功");
                salesDelivery.setIsSync("Y");
                salesDelivery.setSyncDate(new Date());
                salesDelivery.setSyncMessage("Sync successful");
            } else {
                logger.info("单据同步失败");
                salesDelivery.setIsSync("E");
                salesDelivery.setErrorTime(salesDelivery.getErrorTime() + 1);
            }
        }catch (HttpClientErrorException e){
            logger.error(e.getResponseBodyAsString());
        }catch (HttpServerErrorException e){
            logger.error(e.getResponseBodyAsString());
        }catch (Exception e) {
            logger.info("单据同步失败",e);
            throw new Exception("同步銷售發貨异常");
        }
    }

    public void deleteDraft(HttpHeaders headers,String postUrl,Integer docEntry) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        try{
            HttpEntity<String> entity = new HttpEntity<String>("", headers);
            ResponseEntity<String> resp = getRestTemplate().exchange(postUrl + "("+docEntry+")", HttpMethod.DELETE,entity, String.class);
        }catch (Exception e){
            logger.error("删除采购收货草稿异常：",e);
        }
    }

    private String getOrderString(SalesDelivery salesDelivery){
        JSONArray DocumentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONArray BatchNumbers = new JSONArray();
        JSONObject objLine = null;
        JSONObject BatchNumber ;
        requestJson.put("CardCode",salesDelivery.getCardCode());//供应商编号
        requestJson.put("DocDate",salesDelivery.getDocDate());//过账日期(YYYY-MM-DD)
        requestJson.put("Comments",salesDelivery.getComments());//备份
        //明细
        for(SalesDeliveryItem item:salesDelivery.getsalesDeliveryItems()){
            objLine = new JSONObject();
            objLine.put("ItemCode",item.getItemCode());//物料编号
            objLine.put("Quantity",item.getQuantity());//数量
            objLine.put("WhsCode",item.getWhsCode());//仓库
            objLine.put("BaseType","17");//基于类型
            objLine.put("BaseEntry",item.getBaseEntry());//销售订单号
            objLine.put("BaseLine",item.getBaseLine());//销售订单行号
            objLine.put("unitMsr",item.getUnitMsr());//单位
            //批次
            for(SalesDeliveryBatchItem purItem:item.getSalesDeliveryBatchItems()){
                BatchNumber = new JSONObject();
                BatchNumber.put("BatchNumber",purItem.getBatchNum());
                BatchNumber.put("Quantity",purItem.getQuantity());
                BatchNumbers.add(BatchNumber);
            }
            objLine.put("BatchNumbers",BatchNumbers);//销售订单行号
        }
        DocumentLines.add(objLine);
        requestJson.put("DocumentLines",DocumentLines);
        return requestJson.toString();
        //return "1";
    }
}
