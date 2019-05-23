package com.avatech.edi.purchasereceipt.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
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
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Objects;

@Service
public class PurchaseReceiptService{

    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptService.class);

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Transactional
    public void savePurchaseReceipt(PurchaseReceipt order){
        purchaseReceiptRepository.savePurchaseReceipt(order);
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

    public void createPurchaseReceipt(HttpHeaders headers,String postUrl,PurchaseReceipt purchaseReceipt) throws Exception {
        logger.info("同步采购收货信息:%s", purchaseReceipt.toString());
        try {
           //3、添加采购收货表
            HttpEntity<String> orderEntry = new HttpEntity<String>(getOrderString(purchaseReceipt), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
            HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("采购收货单 据同步成功");
                purchaseReceipt.setIsSync("Y");
                purchaseReceipt.setSyncDate(new Date());
                purchaseReceipt.setSyncMessage("Sync successful");
            } else {
                logger.info("单据同步失败");
                purchaseReceipt.setIsSync("E");
                purchaseReceipt.setErrorTime(purchaseReceipt.getErrorTime() + 1);
            }
        } catch (Exception e) {
            logger.info("单据同步失败",e);
            throw new Exception("同步采购收货异常");
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

    private String getOrderString(PurchaseReceipt purchaseReceipt){
        JSONArray DocumentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONArray BatchNumbers = new JSONArray();
        JSONObject objLine = null;
        JSONObject BatchNumber ;
        requestJson.put("CardCode",purchaseReceipt.getCardCode());//供应商编号
        requestJson.put("DocDate",purchaseReceipt.getDocDate());//过账日期(YYYY-MM-DD)
        requestJson.put("Comments",purchaseReceipt.getComments());//备份
        //明细
        for(PurchaseReceiptItem item:purchaseReceipt.getpurchaseReceiptItems()){
            objLine = new JSONObject();
            objLine.put("ItemCode",item.getItemCode());//物料编号
            objLine.put("Quantity",item.getQuantity());//数量
            objLine.put("WhsCode",item.getWhsCode());//仓库
            objLine.put("BaseType","22");//基于类型
            objLine.put("BaseEntry",item.getBaseEntry());//采购订单号
            objLine.put("BaseLine",item.getBaseLine());//采购订单行号
            objLine.put("unitMsr",item.getUnitMsr());//计量单位
            //批次
            for(PurchaseReceiptBatchItem purItem:item.getpurchaseReceiptBatchItems()){
                BatchNumber = new JSONObject();
                BatchNumber.put("BatchNumber",purItem.getBatchNum());
                BatchNumber.put("Quantity",purItem.getQuantity());
                BatchNumbers.add(BatchNumber);
            }
            objLine.put("BatchNumbers",BatchNumbers);//采购订单行号
        }
        DocumentLines.add(objLine);
        requestJson.put("DocumentLines",DocumentLines);
        return requestJson.toString();
    }
}
