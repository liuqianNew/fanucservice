package com.avatech.edi.draftorder.job;

import com.avatech.edi.draftorder.commom.MESService;
import com.avatech.edi.draftorder.commom.StringUtils;
import com.avatech.edi.draftorder.messervice.FDIService;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.vo.SyncResult;
import com.avatech.edi.draftorder.repository.DraftOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DraftOrderJob {

    private final Logger logger = LoggerFactory.getLogger(DraftOrderJob.class);

    @Autowired
    private DraftOrderRepository draftOrderRepository;

    @Scheduled(cron = "0 0/1 * * * ?")
    private void process(){
        try{
            List<DraftOrder> draftOrders = draftOrderRepository.fetchDraftOrders();
            if(draftOrders ==null || draftOrders.size() == 0){
                return;
            }
            for (DraftOrder order:draftOrders) {
                SyncResult syncResult = pushDraftOrder(order);
                logger.info("推送MES[{}]号草稿结果：{}",order.getDocEntry(),syncResult.toString());
                draftOrderRepository.updateDraftOrderUserField(syncResult);
            }
        }catch (Exception e){
            logger.error("推送草稿信息异常：",e);
        }
    }

    private SyncResult pushDraftOrder(DraftOrder order){
        FDIService service = MESService.getInstance();
        logger.info("推送MES草稿信息：{}",order.toString());
        logger.info("推送MES草稿明细信息：{}",order.getdraftOrderItems().toString());
        //logger.info("推送MES草稿批次信息：{}",order.toString());
        String result;
        if(order.getDocType().equals("15")){
            result = service.getFDIServiceSoap().getDNOrder(order.toString(),order.getdraftOrderItems().toString());
        }else {
            result = service.getFDIServiceSoap().getRawMaterial(order.toString(),order.getdraftOrderItems().toString());
        }
        logger.info("推送MES草稿结果：{}",result);
        if(result.equals("OK")){
            return new SyncResult(order.getDocEntry().toString()).ok();
        }else {
            return new SyncResult(order.getDocEntry().toString()).error(StringUtils.getSubString(result,60));
        }
    }
}
