package com.avatech.edi.purchasereceipt.service;

import com.avatech.edi.purchasereceipt.job.PurchaseReceiptJob;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseReceiptService{

    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptService.class);

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Transactional
    public void savePurchaseReceipt(PurchaseReceipt order){
        purchaseReceiptRepository.savePurchaseReceipt(order);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public void createPurchaseReceipt(HttpHeaders headers,String postUrl,PurchaseReceipt order){
        logger.info("同步采购收货信息:%s", order.toString());
        HttpEntity<String> orderEntry = new HttpEntity<String>(order.toString(), headers);
        ResponseEntity<String> response = restTemplate.exchange(postUrl,
                HttpMethod.POST, orderEntry, String.class);
        // 4.update status of mid database order
        if (response.getStatusCode().equals(HttpStatus.OK) ||
                response.getStatusCode().equals(HttpStatus.CREATED)) {
            logger.info("采购收货单据同步成功");
            order.setIsSync("Y");
            order.setSyncDate(new Date());
            order.setSyncMessage("Sync successful");
        } else {
            logger.info("单据同步失败");
            order.setIsSync("E");
            order.setErrorTime(order.getErrorTime() + 1);
        }
        //purchaseReceiptRepository.updatePurchaseReceipt(order);
    }

    public void deleteDraft(HttpHeaders headers,String postUrl,Integer docEntry){

    }
}
