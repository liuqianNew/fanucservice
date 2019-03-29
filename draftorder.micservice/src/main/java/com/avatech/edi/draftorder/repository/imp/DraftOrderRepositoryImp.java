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
import com.avatech.edi.draftorder.repository.DraftOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class DraftOrderRepositoryImp implements DraftOrderRepository{
    @Autowired
    private DraftOrderMapper draftOrderMapper;


    public void saveDraftOrder(DraftOrder draftOrder){
        draftOrderMapper.insertDraftOrder(draftOrder);

    }

    public List<DraftOrder> fetchDraftOrders(){
        List<DraftOrder> draftOrders = new ArrayList();
        draftOrders = draftOrderMapper.searchDraftOrders();
        return draftOrders;
    }

    public void saveDraftOrderItem(DraftOrderItem draftOrderItem){
        draftOrderMapper.insertDraftOrderItem(draftOrderItem);

    }

    public List<DraftOrderItem> fetchDraftOrderItems(){
        List<DraftOrderItem> draftOrderItems = new ArrayList();
        draftOrderItems = draftOrderMapper.searchDraftOrderItems();
        return draftOrderItems;
    }

    public void saveBatchItem(BatchItem batchItem){
        draftOrderMapper.insertBatchItem(batchItem);

    }

    public List<BatchItem> fetchBatchItems(){
        List<BatchItem> batchItems = new ArrayList();
        batchItems = draftOrderMapper.searchBatchItems();
        return batchItems;
    }
}