package com.avatech.edi.materialstock.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.materialstock.common.BusinessException;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
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
import org.springframework.scheduling.annotation.Scheduled;
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
import java.util.Date;
import java.util.List;

@Service
public class GoodsReceiptService {
    private final Logger logger = LoggerFactory.getLogger(GoodsReceiptService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MaterialStockService materialStockService;

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
    //创建库存收货单
    public void createGoodsReceipt(HttpHeaders headers, String postUrl, MaterialStock materialStock) {
        try {
            logger.info("同步到SAP的json数据"+getMaterialStock(materialStock));
            HttpEntity<String> orderEntry = new HttpEntity<String>(getMaterialStock(materialStock), headers);
            ResponseEntity<String> response = getRestTemplate().exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("同步库存收货成功");
                materialStock.setIsSync("Y");
                materialStock.setSyncDate(new Date());
                materialStock.setSyncMessage("Sync successful");
            } else {
                logger.info("单据同步失败");
                materialStock.setSyncDate(new Date());
                materialStock.error("E", response.getBody(), materialStock.getErrorTime() + 1);
            }
        } catch (HttpClientErrorException e){
            logger.error(e.getResponseBodyAsString());
            materialStock.error("E", e.getResponseBodyAsString().substring(0,e.getResponseBodyAsString().length() > 199?199:e.getResponseBodyAsString().length()), materialStock.getErrorTime() + 1);
        }catch (Exception e) {
            logger.error("同步库存收货信息异常", e);
            materialStock.error("E", e.getMessage().substring(0,e.getMessage().length()<199?199:e.getMessage().length()), materialStock.getErrorTime() + 1);
        }
    }

    private String getMaterialStock(MaterialStock materialStock){
        JSONArray documentLines = new JSONArray();
        JSONObject requestJson = new JSONObject();
        JSONObject objLine = null;
        JSONArray batchNumbers = null;
        JSONObject batchNumber = null;
        requestJson.put("DocDate",new Date());
        requestJson.put("DocDueDate",new Date());
        for(MaterialStockItem item : materialStock.getMaterialStockItems()){
            objLine = new JSONObject();
            objLine.put("ItemCode",item.getItemCode());
            objLine.put("WhsCode",item.getWhsCode());
            objLine.put("Quantity",item.getQuantity());
            batchNumbers = new JSONArray();
            batchNumber = new JSONObject();
            batchNumber.put("BatchNumber",item.getBatchNum());
            batchNumber.put("Quantity",item.getQuantity());
            batchNumbers.add(batchNumber);
            if(batchNumbers.size()>0){
                objLine.put("BatchNumbers",batchNumbers);
            }
            documentLines.add(objLine);
        }
        requestJson.put("DocumentLines",documentLines);
        return requestJson.toString();
    }
}
