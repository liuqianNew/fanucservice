/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.mapper;


import com.avatech.edi.receiptorder.model.bo.receiptorder.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface ReceiptOrderMapper{

    void insertReceiptOrder(ReceiptOrder ReceiptOrder);

    List<ReceiptOrder> searchReceiptOrders();

    void insertReceiptOrderItem(ReceiptOrderItem ReceiptOrderItem);

    List<ReceiptOrderItem> searchReceiptOrderItems(Long ediDocEntry);

    void insertReceiptOrderBatchItem(ReceiptOrderBatchItem ReceiptOrderBatchItem);

    List<ReceiptOrderBatchItem> searchReceiptOrderBatchItems(HashMap hashMap);

    void updateReceiptOrder(ReceiptOrder receiptOrder);

    //生产订单
    ProductionOrder fetchProductionOrder(Integer docEntry);

    //生产订单字表
    List<ProductionItemOrder> fetchProductionItemOrder(Integer docEntry);
}