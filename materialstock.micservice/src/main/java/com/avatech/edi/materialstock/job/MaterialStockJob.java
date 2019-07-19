package com.avatech.edi.materialstock.job;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
import com.avatech.edi.materialstock.model.bo.stocks.StockDelivery;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import com.avatech.edi.materialstock.service.GoodsIssueService;
import com.avatech.edi.materialstock.service.GoodsReceiptService;
import com.avatech.edi.materialstock.service.MaterialStockService;
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
public class MaterialStockJob {
    private final Logger logger = LoggerFactory.getLogger(MaterialStockJob.class);

    //库存收货
    private static final String GOODS_RECEIPT_URL  = "/InventoryGenEntries";

    //库存发货
    private static final String GOODS_ISSUE_URL  = "/InventoryGenExits";

    @Autowired
    private MaterialStockService materialStockService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GoodsIssueService goodsIssueService;

    @Autowired
    private GoodsReceiptService goodsReceiptService;

    @Value("${company.sessionurl}")
    private String sessionUrl;

    @Value("${company.companydb}")
    private String companyDB;

    @Value("${company.companyuser}")
    private String companyUser;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            // 1.get unsync order from mid database
            List<MaterialStock> materialStocks = materialStockService.fetchMaterialStocks();
//            if (materialStocks == null || materialStocks.size() == 0) {
//                return;
//            }
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
            StockDelivery stockDelivery = goodsIssueService.fetchMaterialStock();
            if(stockDelivery == null || StringUtils.isEmpty(stockDelivery)){
                for(MaterialStock materialStock : materialStocks){
                    //库存收货
                    goodsReceiptService.createGoodsReceipt(headers,sessionUrl+GOODS_RECEIPT_URL,materialStock);
                    materialStockService.updateMaterialStock(materialStock);
                }
            }else{
                //库存发货
                goodsIssueService.createGoodsIssue(headers,sessionUrl+GOODS_ISSUE_URL,stockDelivery);
                logger.info("库存发货同步成功+++++++++");
                for(MaterialStock materialStock : materialStocks){
                    //库存收货
                    goodsReceiptService.createGoodsReceipt(headers,sessionUrl+GOODS_RECEIPT_URL,materialStock);
                    materialStockService.updateMaterialStock(materialStock);
                }
            }
        } catch (Exception e) {
            logger.error("同步生产发货发生异常", e);
        }
    }

    private String getSessionId(){
        String response = restTemplate.getForObject(sessionUrl+"?comanydb="+companyDB+"&companyuser"+companyUser, String.class);
        return response;
    }
}
