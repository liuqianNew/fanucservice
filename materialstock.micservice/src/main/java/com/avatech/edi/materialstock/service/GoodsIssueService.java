package com.avatech.edi.materialstock.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.materialstock.common.BusinessException;
import com.avatech.edi.materialstock.model.bo.stocks.StockDelivery;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryBatchItem;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryItem;
import com.avatech.edi.materialstock.repository.StockDeliveryRepository;
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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Service
public class GoodsIssueService {
    private final Logger logger = LoggerFactory.getLogger(GoodsIssueService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StockDeliveryRepository stockDeliveryRepository;

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

    public StockDelivery fetchMaterialStock(){
        return stockDeliveryRepository.fetchMaterialStock();
    }

    //创建库存发货单
    public void createGoodsIssue(HttpHeaders headers, String postUrl, StockDelivery stockDelivery) {
        try {
            logger.info("同步到SAP的json数据"+getStock(stockDelivery));
            HttpEntity<String> orderEntry = new HttpEntity<String>(getStock(stockDelivery), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("同步库存发货成功");
            } else {
                logger.info("单据同步失败");
            }
        } catch (HttpClientErrorException e){
            logger.error(e.getResponseBodyAsString());
            throw new BusinessException( "单据信息错误：",e.getResponseBodyAsString());
        }catch (HttpServerErrorException e){
            logger.error(e.getResponseBodyAsString());
            throw new BusinessException( "服务器错误：",e.getResponseBodyAsString());
        }catch (Exception e) {
            logger.error("同步库存发货信息异常", e);
        }
    }

    private String getStock(StockDelivery stockDelivery){
        JSONArray documentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONObject objLine = null;
        JSONArray batchNumbers = null;
        JSONObject batchNumber = null;
        requestJson.put("DocDate",stockDelivery.getDocDate());
        requestJson.put("DocDueDate",stockDelivery.getDocDueDate());
        for(StockDeliveryItem item : stockDelivery.getStockDeliveryItem()){
            objLine = new JSONObject();
            objLine.put("ItemCode",item.getItemCode());
            objLine.put("WhsCode",item.getWhsCode());
            objLine.put("Quantity",item.getQuantity());
            batchNumbers = new JSONArray();
            for(StockDeliveryBatchItem batchItem : item.getStockDeliveryBatchItem()){
                batchNumber = new JSONObject();
                batchNumber.put("BatchNumber",batchItem.getBatchNum());
                batchNumber.put("Quantity",batchItem.getQuantity());
                batchNumbers.add(batchNumber);
            }
            if(batchNumbers.size()>0){
                objLine.put("BatchNumbers",batchNumbers);
            }
            documentLines.add(objLine);
        }
        requestJson.put("DocumentLines",documentLines);
        return requestJson.toString();
    }

}
