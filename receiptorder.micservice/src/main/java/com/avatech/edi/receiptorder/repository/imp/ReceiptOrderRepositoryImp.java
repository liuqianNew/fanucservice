/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-29
 */
package com.avatech.edi.receiptorder.repository.imp;

import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderItem;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderBatchItem;
import com.avatech.edi.receiptorder.mapper.ReceiptOrderMapper;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class ReceiptOrderRepositoryImp implements ReceiptOrderRepository{
    @Autowired
    private ReceiptOrderMapper receiptOrderMapper;


    public void saveReceiptOrder(ReceiptOrder receiptOrder){
        receiptOrderMapper.insertReceiptOrder(receiptOrder);

    }

    public List<ReceiptOrder> fetchReceiptOrders(){
        List<ReceiptOrder> receiptOrders = new ArrayList();
        receiptOrders = receiptOrderMapper.searchReceiptOrders();
        return receiptOrders;
    }

    public void saveReceiptOrderItem(ReceiptOrderItem receiptOrderItem){
        receiptOrderMapper.insertReceiptOrderItem(receiptOrderItem);

    }

    public List<ReceiptOrderItem> fetchReceiptOrderItems(){
        List<ReceiptOrderItem> receiptOrderItems = new ArrayList();
        receiptOrderItems = receiptOrderMapper.searchReceiptOrderItems();
        return receiptOrderItems;
    }

    public void saveReceiptOrderBatchItem(ReceiptOrderBatchItem receiptOrderBatchItem){
        receiptOrderMapper.insertReceiptOrderBatchItem(receiptOrderBatchItem);

    }

    public List<ReceiptOrderBatchItem> fetchReceiptOrderBatchItems(){
        List<ReceiptOrderBatchItem> receiptOrderBatchItems = new ArrayList();
        receiptOrderBatchItems = receiptOrderMapper.searchReceiptOrderBatchItems();
        return receiptOrderBatchItems;
    }
}