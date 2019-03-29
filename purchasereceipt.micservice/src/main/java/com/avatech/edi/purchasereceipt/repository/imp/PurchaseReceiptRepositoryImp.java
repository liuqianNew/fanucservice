/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.repository.imp;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import com.avatech.edi.purchasereceipt.mapper.PurchaseReceiptMapper;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class PurchaseReceiptRepositoryImp implements PurchaseReceiptRepository{
    @Autowired
    private PurchaseReceiptMapper purchaseReceiptMapper;


    public void savePurchaseReceipt(PurchaseReceipt purchaseReceipt){
        purchaseReceiptMapper.insertPurchaseReceipt(purchaseReceipt);

    }

    public List<PurchaseReceipt> fetchPurchaseReceipts(){
        List<PurchaseReceipt> purchaseReceipts = new ArrayList();
        purchaseReceipts = purchaseReceiptMapper.searchPurchaseReceipts();
        return purchaseReceipts;
    }

    public void savePurchaseReceiptItem(PurchaseReceiptItem purchaseReceiptItem){
        purchaseReceiptMapper.insertPurchaseReceiptItem(purchaseReceiptItem);

    }

    public List<PurchaseReceiptItem> fetchPurchaseReceiptItems(){
        List<PurchaseReceiptItem> purchaseReceiptItems = new ArrayList();
        purchaseReceiptItems = purchaseReceiptMapper.searchPurchaseReceiptItems();
        return purchaseReceiptItems;
    }

    public void savePurchaseReceiptBatchItem(PurchaseReceiptBatchItem purchaseReceiptBatchItem){
        purchaseReceiptMapper.insertPurchaseReceiptBatchItem(purchaseReceiptBatchItem);

    }

    public List<PurchaseReceiptBatchItem> fetchPurchaseReceiptBatchItems(){
        List<PurchaseReceiptBatchItem> purchaseReceiptBatchItems = new ArrayList();
        purchaseReceiptBatchItems = purchaseReceiptMapper.searchPurchaseReceiptBatchItems();
        return purchaseReceiptBatchItems;
    }
}