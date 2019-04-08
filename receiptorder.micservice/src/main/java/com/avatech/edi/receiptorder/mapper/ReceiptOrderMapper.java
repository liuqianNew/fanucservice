/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.mapper;


import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderItem;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderBatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface ReceiptOrderMapper{

    void insertReceiptOrder(ReceiptOrder ReceiptOrder);

    List<ReceiptOrder> searchReceiptOrders();

    void insertReceiptOrderItem(ReceiptOrderItem ReceiptOrderItem);

    List<ReceiptOrderItem> searchReceiptOrderItems();

    void insertReceiptOrderBatchItem(ReceiptOrderBatchItem ReceiptOrderBatchItem);

    List<ReceiptOrderBatchItem> searchReceiptOrderBatchItems();
}