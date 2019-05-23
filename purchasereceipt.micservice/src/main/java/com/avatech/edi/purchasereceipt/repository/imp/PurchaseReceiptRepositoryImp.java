/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.repository.imp;

import com.avatech.edi.purchasereceipt.common.SnowflakeIdWorker;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import com.avatech.edi.purchasereceipt.mapper.PurchaseReceiptMapper;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class PurchaseReceiptRepositoryImp implements PurchaseReceiptRepository{
    @Autowired
    private PurchaseReceiptMapper purchaseReceiptMapper;


    public void savePurchaseReceipt(PurchaseReceipt purchaseReceipt){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long ediId;
        ediId = idWorker.nextId();
        purchaseReceipt.setEDIDocEntry(ediId);
        for (int index = 0;index<purchaseReceipt.getpurchaseReceiptItems().size();index++) {
            purchaseReceipt.getpurchaseReceiptItems().get(index).setEDIDocEntry(ediId);
            purchaseReceipt.getpurchaseReceiptItems().get(index).setEDILineId(index);
            for (int batchIndex = 0 ;batchIndex < purchaseReceipt.getpurchaseReceiptItems().get(index).getpurchaseReceiptBatchItems().size();batchIndex++){
                purchaseReceipt.getpurchaseReceiptItems().get(index).getpurchaseReceiptBatchItems().get(batchIndex).setEDIDocEntry(ediId);
                purchaseReceipt.getpurchaseReceiptItems().get(index).getpurchaseReceiptBatchItems().get(batchIndex).setEDILineId(batchIndex);
                purchaseReceipt.getpurchaseReceiptItems().get(index).getpurchaseReceiptBatchItems().get(batchIndex).setEDIItemLineId(index);
            }
        }
        purchaseReceiptMapper.insertPurchaseReceipt(purchaseReceipt);
        for (PurchaseReceiptItem purchaseReceiptItem:purchaseReceipt.getpurchaseReceiptItems()) {
            purchaseReceiptMapper.insertPurchaseReceiptItem(purchaseReceiptItem);
            for (PurchaseReceiptBatchItem purchaseReceiptBatchItem:purchaseReceiptItem.getpurchaseReceiptBatchItems()) {
                purchaseReceiptMapper.insertPurchaseReceiptBatchItem(purchaseReceiptBatchItem);
            }
        }
    }

    public List<PurchaseReceipt> fetchPurchaseReceipts(){
        List<PurchaseReceipt> purchaseReceipts = new ArrayList();
        List<PurchaseReceiptItem> purchaseReceiptItems;
        HashMap<String,Object> paramMap;
        purchaseReceipts = purchaseReceiptMapper.searchPurchaseReceipts();
        for (PurchaseReceipt purchaseReceipt : purchaseReceipts) {
            purchaseReceiptItems =  purchaseReceiptMapper.searchPurchaseReceiptItems(purchaseReceipt.getEDIDocEntry());
            for (PurchaseReceiptItem purchaseReceiptItem:purchaseReceiptItems) {
                paramMap = new HashMap<>();
                paramMap.put("EDIDocEntry",purchaseReceiptItem.getEDIDocEntry());
                paramMap.put("EDIItemLineId",purchaseReceiptItem.getEDILineId());
                purchaseReceiptItem.getpurchaseReceiptBatchItems().addAll(purchaseReceiptMapper.searchPurchaseReceiptBatchItems(paramMap));
            }
            purchaseReceipt.getpurchaseReceiptItems().addAll(purchaseReceiptItems);
        }
        return purchaseReceipts;
    }

    @Override
    public void updatePurchaseReceipt(PurchaseReceipt purchaseReceipt) {
        purchaseReceiptMapper.updatePurchaseReceipt(purchaseReceipt);
    }


}