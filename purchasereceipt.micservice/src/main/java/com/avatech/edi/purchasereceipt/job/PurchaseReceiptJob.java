package com.avatech.edi.purchasereceipt.job;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.dto.Result;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import com.avatech.edi.purchasereceipt.service.PurchaseReceiptService;
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

import java.util.List;

@Component
public class PurchaseReceiptJob {
    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptJob.class);

    private static final String PURCHASE_NOTES_URL  = "/PurchaseDeliveryNotes";

    private static final String DRAFT = "/Drafts";

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Value("${company.sessionurl}")
    private String sessionUrl;

    @Value("${company.companydb}")
    private String companyDB;

    @Value("${company.companyuser}")
    private String companyUser;

    @Value("${company.servicelayerurl}")
    private String serviceLayerAPI;


    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            // 1.get unsync order from mid database
            List<PurchaseReceipt> purchaseReceipts = purchaseReceiptRepository.fetchPurchaseReceipts();
            if (purchaseReceipts == null || purchaseReceipts.size() == 0) {
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
            for (PurchaseReceipt order : purchaseReceipts) {
                //处理删除草稿表
                try {
                    Integer docEntry = Integer.valueOf(order.getDocEntry());
                    purchaseReceiptService.createPurchaseReceipt(headers,serviceLayerAPI + PURCHASE_NOTES_URL,order);
                    purchaseReceiptService.deleteDraft(headers,serviceLayerAPI+ DRAFT,docEntry);

                } catch (Exception e) {
                    logger.error("采购收货删除草稿发生异常", e);
                    //采购收货中间表
                    order.setIsSync("E");
                    order.setErrorTime(order.getErrorTime() + 1);
                    order.setSyncMessage(e.getMessage().substring(0,200));
                }
                purchaseReceiptRepository.updatePurchaseReceipt(order);
            }
        } catch (Exception e) {
            logger.error("同步采购收货发生异常", e);
        }
    }
    private String getSessionId(){
        ResponseEntity<Result> response = restTemplate.getForEntity(sessionUrl + "?comanydb=" + companyDB + "&companyuser=" + companyUser, Result.class);
        return response.getBody().getData();
    }
}
