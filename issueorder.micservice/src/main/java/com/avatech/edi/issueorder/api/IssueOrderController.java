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
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("mes/v1/*")
public class IssueOrderController {

    private final Logger logger = LoggerFactory.getLogger(IssueOrderController.class);

    @Autowired
    private IssueOrderService issueOrderService;

    @Autowired
    private IssueOrderRepository issueOrderRepository;

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


    @GetMapping("issueorder")
    public @ResponseBody IssueOrder getIssueOrder(){
        IssueOrder order = new IssueOrder();
        //order.setDocEntry(1);
        order.setDocDate("2019-03-28");
        order.setDocTime(122323);
        order.setComments("this is test");
        IssueOrderItem issueOrderItem = new IssueOrderItem();
        issueOrderItem.setBaseEntry("300003");
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
        issueOrderItem.getIssueOrderBatchItems().add(issueOrderBatchItem);
        order.getIssueOrderItems().add(issueOrderItem);
        return order;
    }

    @PostMapping("issueorders")
    public @ResponseBody List<Result> addIssueOrders(@RequestBody List<IssueOrder> issueOrders){
        logger.info("接收出库信息：{}",issueOrders.toString());
        List<Result> results = new ArrayList<>();
        Result result;
        for (IssueOrder issueOrder:issueOrders){
            result = new Result();
            try{
                result = issueOrder.checkData();
                if(result.getCode().equals("0")){
                    issueOrderService.saveIssueOrder(issueOrder);
                }
            }catch (Exception e){
                logger.error("保存出库信息异常：{}",e);
                result.error(e.getMessage());
            }
           results.add(result);
        }
        logger.info("回传MES出库信息,{}",results);
        return results;
    }

    @PostMapping("issueorder")
    public @ResponseBody
    Result addIssueOrder(@RequestBody IssueOrder issueOrder){
        Result result;
        try{
            logger.info("接收出库信息：{}",issueOrder.toString());
            result = issueOrder.checkData();
            if(result.getCode().equals("0")){
                issueOrderService.saveIssueOrder(issueOrder);
                result = new Result().ok(issueOrder.getDocEntry().toString());
            }
        }catch (Exception e){
            result = new Result().error(issueOrder.getDocEntry().toString(), e.getMessage());
        }
        logger.info("回传MES出库信息,{}",result.toString());
        return result;
    }

    @PostMapping("createissueorder")
    public @ResponseBody
    Result createIssueOrder(@RequestBody IssueOrder issueOrder) throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        Result result;
        try{
            logger.info("接收出库信息：{}",issueOrder.toString());
            result = issueOrder.checkData();
            if(result.getCode().equals("0")){
                HttpHeaders headers = new HttpHeaders();
                MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
                headers.setContentType(type);
                String requestJson = "{\n" +
                        "    \"CompanyDB\": \"ERP001\",\n" +
                        "    \"UserName\": \"BJ-FANUC\\\\bfm004\",\n" +
                        "    \"Password\": \"Aa123456!\"\n" +
                        "}";
                HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
                String responese = restTemplate.postForObject("https://172.18.19.127:50000/b1s/v1/Login",entity,String.class);
                result = new Result().ok(issueOrder.getDocEntry().toString());
            }
        }catch (Exception e){
            result = new Result().error(issueOrder.getDocEntry().toString(), e.getMessage());
        }
        logger.info("回传MES出库信息,{}",result.toString());
        return result;
    }

}