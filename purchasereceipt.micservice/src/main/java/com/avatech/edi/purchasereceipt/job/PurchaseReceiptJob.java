package com.avatech.edi.purchasereceipt.job;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
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

import java.util.Date;
import java.util.List;

@Component
public class PurchaseReceiptJob {
    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptJob.class);

    private static final String PURCHASE_NOTES_URL  = "/";

    private static final String DRAFT = "/";

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${company.sessionurl}")
    private String sessionUrl;

    @Value("${company.companydb}")
    private String companyDB;

    @Value("${company.companyuser}")
    private String companyUser;


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
                if(order.getDocEntry()==null||order.getDocEntry().equals("")){
                    break;
                }
                try {
                    Integer docEntry = Integer.valueOf(order.getDocEntry());
                    purchaseReceiptService.deleteDraft(headers,sessionUrl+ DRAFT,docEntry);
                    purchaseReceiptService.createPurchaseReceipt(headers,sessionUrl + PURCHASE_NOTES_URL,order);
                    order.setIsSync("Y");
                    order.setSyncDate(new Date());
                    order.setSyncMessage("Sync successful");
                } catch (NumberFormatException e) {
                    logger.error("采购收货删除草稿发生异常", e);
                    //采购收货中间表
                    order.setIsSync("E");
                    order.setErrorTime(order.getErrorTime() + 1);
                }
                purchaseReceiptRepository.updatePurchaseReceipt(order);
            }
        } catch (Exception e) {
            logger.error("同步采购收货发生异常", e);
        }
    }
    private String getSessionId(){
        String response = restTemplate.getForObject(sessionUrl+"?comanydb="+companyDB+"&companyuser"+companyUser, String.class);
        return response;
    }
}
