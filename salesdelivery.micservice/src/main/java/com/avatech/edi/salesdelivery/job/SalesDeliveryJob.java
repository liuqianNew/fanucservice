package com.avatech.edi.salesdelivery.job;

import com.avatech.edi.salesdelivery.common.BaseException;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.vo.SyncResult;
import com.avatech.edi.salesdelivery.service.SalesDeliveryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesDeliveryJob {

    private final Logger log = LoggerFactory.getLogger(SalesDeliveryJob.class);
    @Autowired
    SalesDeliveryService salesDeliveryService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void process(){
        List<SalesDelivery> salesDeliveryList = salesDeliveryService.fetchSalesDelivery();
//        if(salesDeliveryList.size() == 0 ) {
//            return;
//        }
        SyncResult result = salesDeliveryService.createSalesDelivery(null);
        log.info("获取中间表"+salesDeliveryList.size()+"条");
        for(SalesDelivery order : salesDeliveryList){
            try{
                log.info("获取中间表发货过账信息:"+order.toString());
//                SyncResult result = salesDeliveryService.createSalesDelivery(order);
//                if(result.getSyncResult().equals("Y")) {
//
//                }
            }catch (BaseException e){
                log.error("发货过账单"+ order.getDocEntry()+"生成失败:",e);
            }catch (Exception e){
                log.error("发货过账单"+ order.getDocEntry()+"生成失败:",e);
//                order.setIsSync("E");
//                order.setSyncMessage(e.getMessage());
            }
            try {
//                salesDeliveryService.updateSyncDeliveryPost(order);
            } catch (Exception e) {
                log.error("更新发货过账失败："+e);
            }
        }
    }
}
