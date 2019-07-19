/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.repository.imp;

import com.avatech.edi.receiptorder.common.SnowflakeIdWorker;
import com.avatech.edi.receiptorder.model.bo.receiptorder.*;
import com.avatech.edi.receiptorder.mapper.ReceiptOrderMapper;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class ReceiptOrderRepositoryImp implements ReceiptOrderRepository{
    @Autowired
    private ReceiptOrderMapper receiptOrderMapper;


    public void saveReceiptOrder(ReceiptOrder receiptOrder){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long ediId;
        ediId = idWorker.nextId();
        receiptOrder.setEDIDocEntry(ediId);
        for (int index = 0;index<receiptOrder.getreceiptOrderItems().size();index++) {
            receiptOrder.getreceiptOrderItems().get(index).setEDIDocEntry(ediId);
            receiptOrder.getreceiptOrderItems().get(index).setEDILineId(index);
            for (int batchIndex = 0 ;batchIndex < receiptOrder.getreceiptOrderItems().get(index).getreceiptOrderBatchItems().size();batchIndex++){
                receiptOrder.getreceiptOrderItems().get(index).getreceiptOrderBatchItems().get(batchIndex).setEDIDocEntry(ediId);
                receiptOrder.getreceiptOrderItems().get(index).getreceiptOrderBatchItems().get(batchIndex).setEDILineId(batchIndex);
                receiptOrder.getreceiptOrderItems().get(index).getreceiptOrderBatchItems().get(batchIndex).setEDIItemLineId(index);
            }
        }

        receiptOrderMapper.insertReceiptOrder(receiptOrder);
        for (ReceiptOrderItem receiptOrderItem:receiptOrder.getreceiptOrderItems()) {
            receiptOrderMapper.insertReceiptOrderItem(receiptOrderItem);
            for (ReceiptOrderBatchItem receiptOrderBatchItem:receiptOrderItem.getreceiptOrderBatchItems()) {
                receiptOrderMapper.insertReceiptOrderBatchItem(receiptOrderBatchItem);
            }
        }

    }

    public List<ReceiptOrder> fetchReceiptOrders(){
        List<ReceiptOrder> receiptOrders = new ArrayList();
        List<ReceiptOrderItem> receiptOrderItems;
        HashMap<String,Object> paramMap;
        receiptOrders = receiptOrderMapper.searchReceiptOrders();
        for (ReceiptOrder receiptOrder:receiptOrders) {
            receiptOrderItems = receiptOrderMapper.searchReceiptOrderItems(receiptOrder.getEDIDocEntry());
            for (ReceiptOrderItem receiptOrderItem:receiptOrderItems) {
                paramMap = new HashMap<>();
                paramMap.put("EDIDocEntry",receiptOrderItem.getEDIDocEntry());
                paramMap.put("EDIItemLineId",receiptOrderItem.getEDILineId());
                receiptOrderItem.getreceiptOrderBatchItems().addAll(receiptOrderMapper.searchReceiptOrderBatchItems(paramMap));
            }
            receiptOrder.getreceiptOrderItems().addAll(receiptOrderItems);
        }
        return receiptOrders;
    }

    @Override
    public void updateReceipOrder(ReceiptOrder receiptOrder) {
        receiptOrderMapper.updateReceiptOrder(receiptOrder);
    }

    @Override
    public ProductionOrder fetchProductionOrder(Integer docEntry) {
       ProductionOrder productionOrder = receiptOrderMapper.fetchProductionOrder(docEntry);
       productionOrder.getProductionItemOrders().addAll(receiptOrderMapper.fetchProductionItemOrder(docEntry));
       return productionOrder;
    }


}