package com.avatech.edi.receiptorder.service;

import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReceiptOrderService{

    @Autowired
    private ReceiptOrderRepository receiptOrderRepository;

    @Transactional
    public void saveReceiptOrder(ReceiptOrder order){
        receiptOrderRepository.saveReceiptOrder(order);
    }

    @Transactional
    public List<ReceiptOrder> fetchReceiptOrder(){
        return receiptOrderRepository.fetchReceiptOrders();
    }
}
