package com.avatech.edi.materialstock.service;

import com.avatech.edi.materialstock.job.MaterialStockJob;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.stocks.Stock;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class GoodsIssueService {
    private final Logger logger = LoggerFactory.getLogger(GoodsIssueService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MaterialStockService materialStockService;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    public void createGoodsIssue(HttpHeaders headers, String postUrl, List<Stock> stocks) {
        try {
            logger.info("同步库存信息:%s", stocks.toString());
            HttpEntity<String> orderEntry = new HttpEntity<String>(stocks.toString(), headers);
            ResponseEntity<String> response = restTemplate.exchange(postUrl,
                    HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("库存信息同步库存发货成功");
            } else {
                logger.info("单据同步失败");
            }
            //materialStockService.updateMaterislStock(stocks);

        } catch (Exception e) {
            logger.error("同步库存信息发生异常", e);
        }
    }

}
