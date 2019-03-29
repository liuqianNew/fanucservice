/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.api;

import com.avatech.edi.issueorder.model.dto.Result;
import com.avatech.edi.issueorder.service.IssueOrderService;
import com.avatech.edi.issueorder.repository.IssueOrderRepository;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/mes/v1/*")
public class IssueOrderController {

    private final Logger logger = LoggerFactory.getLogger(IssueOrderController.class);

    @Autowired
    private IssueOrderService issueOrderService;

    @Autowired
    private IssueOrderRepository issueOrderRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate()
            throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                .loadTrustMaterial(null, acceptingTrustStrategy)
                .build();

        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);


        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(csf)
                .build();


        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory();

        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }


    @GetMapping("issueorder")
    public @ResponseBody IssueOrder getIssueOrder(){
        IssueOrder order = new IssueOrder();
        //order.setDocEntry(1);
        order.setDocDate("2019-03-28");
        order.setDocTime(122323);
        order.setComments("this is test");
        IssueOrderItem issueOrderItem = new IssueOrderItem();
        issueOrderItem.setBaseEntry(300003);
        issueOrderItem.setBaseLine(0);
        issueOrderItem.setLineId(1);
        issueOrderItem.setItemCode("12212");
        issueOrderItem.setItemName("itemname test");
        issueOrderItem.setQuantity(new BigDecimal(12));
        IssueOrderBatchItem issueOrderBatchItem = new IssueOrderBatchItem();
        issueOrderBatchItem.setBatchNum("20190328001");
        issueOrderBatchItem.setItemCode("12212");
        issueOrderBatchItem.setQuantity(new BigDecimal(232));
        issueOrderBatchItem.setItemLineId(1);
        issueOrderItem.getissueOrderBatchItems().add(issueOrderBatchItem);
        order.getissueOrderItems().add(issueOrderItem);
        return order;
    }


    @PostMapping("issueorder")
    public @ResponseBody
    Result addIssueOrder(@RequestBody IssueOrder issueOrder){
        try{
            logger.info("接收生产发料信息：{}",issueOrder.toString());
//            if(issueOrder.checkData()){
//                // TODO 生成生产发货单
//
//
//                return new Result().ok("1");
//            }



            TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

            SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                    .loadTrustMaterial(null, acceptingTrustStrategy)
                    .build();
            HostnameVerifier allowAllHosts = new NoopHostnameVerifier();
            SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext,allowAllHosts);

            CloseableHttpClient httpClient = HttpClients.custom()
                    .setSSLSocketFactory(csf)
                    .build();

            HttpComponentsClientHttpRequestFactory requestFactory =
                    new HttpComponentsClientHttpRequestFactory();

            requestFactory.setHttpClient(httpClient);


            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("Content-Type", "application/json; charset=UTF-8");
            //设置参数
            Map<String, String> hashMap = new LinkedHashMap<String, String>();
            hashMap.put("CompanyDB", "TEST_HARBOUR_SH0325AM");
            hashMap.put("Password", "Hb123456!");
            hashMap.put("UserName","manager");
            HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(hashMap, httpHeaders);

            //执行请求
            RestTemplate restTemplate = new RestTemplate(requestFactory);
            ResponseEntity<String> resp = restTemplate.exchange("https://172.16.30.110:50000/b1s/v1/Login",HttpMethod.POST,requestEntity, String.class);
            logger.info(resp.getBody());
            //获取返回的header
            List<String> val = resp.getHeaders().get("Set-Cookie");
            logger.info(val.toString());

        }catch (Exception e){
            return new Result().error(e.getMessage());
        }
        return null;
    }

}