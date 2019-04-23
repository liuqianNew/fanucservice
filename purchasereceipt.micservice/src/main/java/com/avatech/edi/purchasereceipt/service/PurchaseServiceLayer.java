/**
 * FileName: PurchaseServiceLayer
 * Date:     2019/4/18 17:40
 * Description: 临时登录
 */
package com.avatech.edi.purchasereceipt.service;

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
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Component
public class PurchaseServiceLayer {
    private final Logger logger = LoggerFactory.getLogger(PurchaseServiceLayer.class);

    @Autowired
    private RestTemplate restTemplate;


    @Bean
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

    //登录方法
    public String login(){
        HttpEntity<String> response = null;
        try{
            HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);
            String requestJson = "{\n" +
                    "    \"CompanyDB\": \"ERP001\",\n" +
                    "    \"UserName\": \"BJ-FANUC\\\\bfm004\",\n" +
                    "    \"Password\": \"Aa123456!\"\n" +
                    "}";
            HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
             response = restTemplate.exchange("https://172.18.19.127:50000/b1s/v1/Login"
                    , HttpMethod.POST, entity, String.class);
        }catch (Exception e){
            logger.error("login exception:",e);
        }
        return response.getHeaders().get("set-cookie").get(0)+"ROUTEID=.node0;path=/b1s";
    }

    /**
     * 姓名：姚琛
     * 功能：删除草稿表
     * 2019年4月19日10:36:55
     */
    public String DraftsDelete(String docEntry,String cookie){

        try {
            HttpHeaders headers1 = new HttpHeaders();
            MediaType type1 = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers1.setContentType(type1);
            headers1.add("Cookie",cookie);
            HttpEntity<String> itemEntity= new HttpEntity<String>(headers1);
            //要调用的交货中间表：https://localhost:50000/b1s/v1/PurchaseDeliveryNotes
            HttpEntity<String> response = restTemplate.exchange("https://172.18.19.127:50000/b1s/v1/Drafts"+ "("+docEntry+")"
                    ,HttpMethod.DELETE,null,String.class,227);
            System.out.println("response");
        } catch (RestClientException e) {
            logger.error("删除采购收货草稿出错了",e);
        }
        return null ;
    }
    /**
     * 功能：添加采购收货单
     * 2019年4月22日14:46:12
     * 姓名：姚琛
     */
    public void AddPurchaseDeliveryNotes(String requestJson,String cookie){
        try {
            HttpHeaders headers1 = new HttpHeaders();
            MediaType type1 = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers1.setContentType(type1);
            headers1.add("Cookie",cookie);
            HttpEntity<String> itemEntity= new HttpEntity<String>(requestJson,headers1);
            // String responese1 = restTemplate.getPost("https://172.18.19.127:50000/b1s/v1/Items",entity,String.class);

            HttpEntity<String> response1 = restTemplate.exchange("https://172.18.19.127:50000/b1s/v1/PurchaseDeliveryNotes"
                    , HttpMethod.POST, itemEntity, String.class);
        } catch (RestClientException e) {
            logger.error("添加采购收货单出错",e);
        }

    }

}
