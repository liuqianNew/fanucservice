package com.avatech.edi.productionorder.job;

import com.avatech.edi.productionorder.common.MESService;
import com.avatech.edi.productionorder.common.StringUtils;
import com.avatech.edi.productionorder.message.FDIService;
import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import com.avatech.edi.productionorder.model.vo.SyncResult;
import com.avatech.edi.productionorder.repository.ProductionOrderRepository;
import com.avatech.edi.productionorder.service.ProductionOrderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductionOrderJob {

    private final Logger logger = LoggerFactory.getLogger(ProductionOrderJob.class);

    @Autowired
    private ProductionOrderService productionOrderService;

    @Autowired
    private ProductionOrderRepository productionOrderRepository;

    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            List<ProductionOrder> productionOrders = productionOrderService.fetchProdutionOrder();
            SyncResult syncResult;
            for (ProductionOrder order : productionOrders) {
                syncResult = pushProductionOrder(order);
                logger.info("推送MES[{}]号生产订单结果：{}",order.getDocEntry(),syncResult.toString());
                productionOrderRepository.updateProductionOrderUserField(syncResult);
            }
        } catch (Exception e) {
            logger.error("推送MES异常：", e);
        }
    }

    private SyncResult pushProductionOrder(ProductionOrder productionOrder){
        FDIService service = MESService.getInstance();
        logger.info("推送MES[{}]号生产订单信息，表头信息：{}",productionOrder.getDocEntry(),productionOrder.toString());
        logger.info("推送MES[{}]号生产订单信息，行信息：{}",productionOrder.getDocEntry(),productionOrder.getproductionOrderItems().toString());
        String result = service.getFDIServiceSoap().getWorkOrder(productionOrder.toString(),productionOrder.getproductionOrderItems().toString());
        if(result.equals("OK")){
            return new SyncResult(productionOrder.getDocEntry().toString()).ok();
        }else {
            return new SyncResult(productionOrder.getDocEntry().toString()).error(StringUtils.getSubString(result,60));
        }
    }
}
