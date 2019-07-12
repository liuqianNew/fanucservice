package com.avatech.edi.receiptorder.job;

import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.dto.Result;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import com.avatech.edi.receiptorder.service.ReceiptOrderService;
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

import java.util.Date;
import java.util.List;

@Component
public class ReceiptOrderJob {

    private final Logger logger = LoggerFactory.getLogger(ReceiptOrderJob.class);

    private static final String PRODUCTION_URL  = "/InventoryGenEntries";

    @Autowired
    private ReceiptOrderRepository receiptOrderRepository;

    @Autowired
    private ReceiptOrderService receiptOrderService;

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
            List<ReceiptOrder> receiptOrders = receiptOrderRepository.fetchReceiptOrders();
            if (receiptOrders == null || receiptOrders.size() == 0) {
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
            for (ReceiptOrder order : receiptOrders) {
                receiptOrderService.createReceiptOrder(headers,serviceLayerAPI + PRODUCTION_URL,order);
                receiptOrderRepository.updateReceipOrder(order);
            }
        } catch (Exception e) {
            logger.error("同步生产收货发生异常", e);
        }
    }

    private String getSessionId(){
        ResponseEntity<Result> response = restTemplate.getForEntity(sessionUrl + "?comanydb=" + companyDB + "&companyuser=" + companyUser, Result.class);
        return response.getBody().getData();
    }
}
