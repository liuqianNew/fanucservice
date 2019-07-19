/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.repository;

import com.avatech.edi.receiptorder.model.bo.receiptorder.*;
import org.springframework.stereotype.Component;
import java.util.List;

public interface ReceiptOrderRepository{

    void saveReceiptOrder(ReceiptOrder ReceiptOrder);

    List<ReceiptOrder> fetchReceiptOrders();

    void updateReceipOrder(ReceiptOrder receiptOrder);

    ProductionOrder fetchProductionOrder(Integer docEntry);

}