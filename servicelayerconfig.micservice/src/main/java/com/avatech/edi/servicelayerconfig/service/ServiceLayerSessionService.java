package com.avatech.edi.servicelayerconfig.service;

import com.avatech.edi.servicelayerconfig.common.DateUtil;
import com.avatech.edi.servicelayerconfig.model.bo.servicelayersession.ServiceLayerSession;
import com.avatech.edi.servicelayerconfig.model.vo.CompanyInfo;
import com.avatech.edi.servicelayerconfig.repository.ServiceLayerSessionRepository;
import com.avatech.edi.servicelayerconfig.service.config.CompanyInfoManager;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.time.LocalDateTime;
import java.util.Map;

@Service
public class ServiceLayerSessionService{

    private final Logger logger = LoggerFactory.getLogger(ServiceLayerSessionService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CompanyInfoManager companyInfoManager;

    @Autowired
    private ServiceLayerSessionRepository serviceLayerSessionRepository;

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

    public String ServiceLayerLogin(String companyDB,String userName) throws Exception {
        try {
            CompanyInfo companyInfo = companyInfoManager.getCompanInfoInstance(companyDB, userName);
            HttpHeaders headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type);
            ObjectMapper mapper = new ObjectMapper();
            HttpEntity<String> entity = new HttpEntity<String>(mapper.writeValueAsString(companyInfo), headers);

            ResponseEntity<String> response = restTemplate.exchange(companyInfo.getUrl(),
                     HttpMethod.POST, entity, String.class);
            logger.info("登录结果：{},返回内容:{}", response.getStatusCode(), response.getBody());
            if (response.getStatusCode().equals(HttpStatus.OK)) {
                String sessionId = response.getHeaders().get("set-cookie").get(0);
                String routeId = "ROUTEID=.node0;path=/b1s";
                Map node = new ObjectMapper().readValue(response.getBody(), Map.class);
                ServiceLayerSession serviceLayerSession = new ServiceLayerSession();
                serviceLayerSession.setCompanyDB(companyDB);
                serviceLayerSession.setIsDelete("N");
                serviceLayerSession.setUserName(userName);
                serviceLayerSession.setSessionId(sessionId+routeId);
                serviceLayerSession.setSessionTimeOut(DateUtil.getLongTime(LocalDateTime.now().
                        plusMinutes(Integer.valueOf(node.get("SessionTimeout").toString()) -1 )));
                serviceLayerSessionRepository.saveServiceLayerSession(serviceLayerSession);
                return sessionId + routeId;
            } else {
                throw new Exception(String.format("login error:%s",response.getBody()));
            }
        } catch (Exception e) {
            logger.error("[{}-{}]login B1 exception:", companyDB, userName, e);
            throw new Exception("login exception");
        }
    }
}