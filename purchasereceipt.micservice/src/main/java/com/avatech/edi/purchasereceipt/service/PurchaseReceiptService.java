package com.avatech.edi.purchasereceipt.service;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PurchaseReceiptService{
    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Transactional
    public void savePurchaseReceipt(PurchaseReceipt order){
        purchaseReceiptRepository.savePurchaseReceipt(order);
    }
}