package com.avatech.edi.issueorder.job;

import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.dto.Result;
import com.avatech.edi.issueorder.repository.IssueOrderRepository;
import com.avatech.edi.issueorder.service.IssueOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Component
public class IssueOrderJob {

    private final Logger logger = LoggerFactory.getLogger(IssueOrderJob.class);

    private static final String PRODUCTION_URL  = "/InventoryGenExits";

    @Autowired
    private IssueOrderRepository issueOrderRepository;

    @Autowired
    private IssueOrderService issueOrderService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${company.sessionurl}")
    private String sessionUrl;

    @Value("${company.companydb}")
    private String companyDB;

    @Value("${company.companyuser}")
    private String companyUser;

    @Value("${company.servicelayerurl}")
    private String serviceLayerAPI;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            // 1.get unsync order from mid database
            List<IssueOrder> issueOrders = issueOrderRepository.fetchIssueOrders();
            if (issueOrders == null || issueOrders.size() == 0) {
                return;
            }
            // 2.get session
            String seesionId = getSessionId();
            if (StringUtils.isEmpty(seesionId)) {
                throw new Exception("获取session为空，请检查session服务");
            }
            HttpHeaders headers = new HttpHeaders();
            MediaType type1 = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type1);
            headers.add("Cookie", seesionId);
            // 3.call service layer to create production order
            for (IssueOrder order : issueOrders) {
                issueOrderService.createIssueOrder(headers,serviceLayerAPI + PRODUCTION_URL,order);
                issueOrderRepository.updateIssueOrder(order);
            }
        } catch (Exception e) {
            logger.error("同步生产发货发生异常", e);
        }
    }

    private String getSessionId() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        ResponseEntity<Result> response = restTemplate.getForEntity(sessionUrl + "?comanydb=" + companyDB + "&companyuser=" + companyUser, Result.class);
        return response.getBody().getData();
    }
}
