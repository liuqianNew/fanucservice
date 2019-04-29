package com.avatech.edi.materialstock.service;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GoodsReceiptService {
    private final Logger logger = LoggerFactory.getLogger(GoodsReceiptService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MaterialStockService materialStockService;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    public void createGoodsReceipt(HttpHeaders headers, String postUrl, List<MaterialStock> materialStock) {
        try {
            logger.info("同步库存信息:%s", materialStock.toString());
            HttpEntity<String> orderEntry = new HttpEntity<String>(materialStock.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("库存信息同步库存收货成功");
            } else {
                logger.info("单据同步失败");
            }
            materialStockService.updateMaterislStock(materialStock);

        } catch (Exception e) {
            logger.error("同步库存信息发生异常", e);
        }
    }

}
