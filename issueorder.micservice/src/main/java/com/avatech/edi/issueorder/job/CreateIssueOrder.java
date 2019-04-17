package com.avatech.edi.issueorder.job;

import com.avatech.edi.issueorder.api.HttpClientFactory;
import com.avatech.edi.issueorder.api.IssueOrderController;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Component
public class CreateIssueOrder {

    private final Logger logger = LoggerFactory.getLogger(IssueOrderController.class);

    public @ResponseBody
    String createIssueOrder() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
        try{
            RestTemplate restTemplate = new RestTemplate(HttpClientFactory.getHttpClient());
            String responese = restTemplate.postForObject("https://172.18.19.127:9110/b1s/v1/Login","",String.class);
            ObjectMapper objectMapper = new ObjectMapper();
            String sessionId = objectMapper.readValue(responese.toString(),String.class);
            //查询未同步的发货单
            IssueOrder order = null;
            HttpPost httpPost = new HttpPost(HttpUrl.ISSUEORDERURL);
            //指定报文头Content-type、User-Agent
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
            String puraseOrderJson = objectMapper.writeValueAsString(order);
            StringEntity entity =new StringEntity(puraseOrderJson.toString(), "utf-8");
            //把sessionId放入url调接口

        }catch (Exception e){
            logger.error("发货单生成失败"+e.getMessage());
        }
        return null;
    }
}
