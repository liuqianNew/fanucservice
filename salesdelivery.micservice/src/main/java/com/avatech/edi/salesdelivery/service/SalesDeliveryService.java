package com.avatech.edi.salesdelivery.service;

import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalesDeliveryService{

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;

    @Transactional
    public void saveSalesDelivery(SalesDelivery order){
        salesDeliveryRepository.saveSalesDelivery(order);
    }

    @Transactional
    public List<SalesDelivery> fetchSalesDelivery(){
        return salesDeliveryRepository.fetchSalesDeliverys();
    }
}