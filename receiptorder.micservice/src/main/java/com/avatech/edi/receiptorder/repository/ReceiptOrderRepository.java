/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.repository;

import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderItem;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderBatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

public interface ReceiptOrderRepository{

    void saveReceiptOrder(ReceiptOrder ReceiptOrder);

    List<ReceiptOrder> fetchReceiptOrders();


}