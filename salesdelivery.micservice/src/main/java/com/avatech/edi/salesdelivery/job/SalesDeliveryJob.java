package com.avatech.edi.salesdelivery.job;

import com.avatech.edi.salesdelivery.common.BaseException;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.dto.Result;
import com.avatech.edi.salesdelivery.model.vo.SyncResult;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdelivery.service.SalesDeliveryService;
import com.avatech.edi.salesdelivery.service.SalesDeliveryService2;
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
public class SalesDeliveryJob {

    private final Logger logger = LoggerFactory.getLogger(SalesDeliveryJob.class);


    private static final String SALEDELIVER_URL  = "/";
    private static final String PRODUCTION_URL  = "/";
    private static final String PURCHASE_NOTES_URL  = "/PurchaseDeliveryNotes";
    private static final String SALEDELIVERY_NOTES_URL  = "/DeliveryNotes";

    private static final String DRAFT = "/Drafts";

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SalesDeliveryService2 salesDeliveryService2;

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
            List<SalesDelivery> salesDeliveries = salesDeliveryRepository.fetchSalesDeliverys();
            if (salesDeliveries == null || salesDeliveries.size() == 0) {
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

            //modify by yuan
            // 3.call service layer to create saledelivery order
            for (SalesDelivery order : salesDeliveries) {
                //处理删除草稿表
                try {
                    Integer docEntry = Integer.valueOf(order.getDocEntry());
                    salesDeliveryService2.createSalesDelivery(headers,serviceLayerAPI + SALEDELIVERY_NOTES_URL,order);
                    salesDeliveryService2.deleteDraft(headers,serviceLayerAPI+ DRAFT,docEntry);
                } catch (Exception e) {
                    logger.error("销售发货单删除草稿发生异常", e);
                    //销售发货单中间表
                    order.setIsSync("E");
                    order.setErrorTime(order.getErrorTime() + 1);
                }
                logger.info("更新订单状态"+order.getIsSync());
                salesDeliveryRepository.updateSalesDelivery(order);
            }
        } catch (Exception e) {
            logger.error("同步生产发货发生异常", e);
        }
    }

    private String getSessionId(){
        ResponseEntity<Result> response1 = restTemplate.getForEntity(sessionUrl + "?comanydb=" + companyDB + "&companyuser=" + companyUser, Result.class);
        return response1.getBody().getData();
    }
}
