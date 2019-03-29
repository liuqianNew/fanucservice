/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.repository;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

public interface PurchaseReceiptRepository{

    void savePurchaseReceipt(PurchaseReceipt PurchaseReceipt);

    List<PurchaseReceipt> fetchPurchaseReceipts();

    void savePurchaseReceiptItem(PurchaseReceiptItem PurchaseReceiptItem);

    List<PurchaseReceiptItem> fetchPurchaseReceiptItems();

    void savePurchaseReceiptBatchItem(PurchaseReceiptBatchItem PurchaseReceiptBatchItem);

    List<PurchaseReceiptBatchItem> fetchPurchaseReceiptBatchItems();
}