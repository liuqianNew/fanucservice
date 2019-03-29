/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.mapper;


import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PurchaseReceiptMapper{

    void insertPurchaseReceipt(PurchaseReceipt PurchaseReceipt);

    List<PurchaseReceipt> searchPurchaseReceipts();

    void insertPurchaseReceiptItem(PurchaseReceiptItem PurchaseReceiptItem);

    List<PurchaseReceiptItem> searchPurchaseReceiptItems();

    void insertPurchaseReceiptBatchItem(PurchaseReceiptBatchItem PurchaseReceiptBatchItem);

    List<PurchaseReceiptBatchItem> searchPurchaseReceiptBatchItems();
}