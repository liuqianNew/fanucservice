/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.draftorder.repository.imp;

import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrderItem;
import com.avatech.edi.draftorder.model.bo.draftorder.BatchItem;
import com.avatech.edi.draftorder.mapper.DraftOrderMapper;
import com.avatech.edi.draftorder.model.vo.SyncResult;
import com.avatech.edi.draftorder.repository.DraftOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class DraftOrderRepositoryImp implements DraftOrderRepository{
    @Autowired
    private DraftOrderMapper draftOrderMapper;

    public List<DraftOrder> fetchDraftOrders(){
        List<DraftOrder> draftOrders = new ArrayList();
        draftOrders = draftOrderMapper.searchDraftOrders();
        List<DraftOrderItem> draftOrderItems;
        List<BatchItem> batchItems;
        HashMap<String,Integer> hashMap;
        for (DraftOrder draftOrder:draftOrders) {
            draftOrder.setDocDate(draftOrder.getDocDate().substring(0,11));
            String docTime = draftOrder.getDocTime();
            if(docTime.length()==3){
                draftOrder.setDocTime(docTime.substring(0,1)+":"+docTime.substring(1)+":00");
            }else{
                draftOrder.setDocTime(docTime.substring(0,2)+":"+docTime.substring(2)+":00");
            }
            draftOrderItems = draftOrderMapper.searchDraftOrderItems(draftOrder.getDocEntry().toString());
            draftOrder.getdraftOrderItems().addAll(draftOrderItems);
//            for (DraftOrderItem draftOrderItem:draftOrderItems) {
//                hashMap = new HashMap();
//                hashMap.put("docEntry",draftOrderItem.getDocEntry());
//                hashMap.put("lineId",draftOrderItem.getLineId());
//                batchItems = draftOrderMapper.searchBatchItems(hashMap);
//                draftOrderItem.getbatchItems().addAll(batchItems);
//            }
        }
        return draftOrders;
    }

    public void updateDraftOrderUserField(SyncResult syncResult){
        draftOrderMapper.updateDraftOrder(syncResult);
    }
}