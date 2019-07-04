package com.avatech.edi.salesorders.service;

import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalesOrderService{

    @Autowired
    private SalesOrderRepository salesOrderRepository;

     public List<SalesOrder> fetchSalesOrders(){
         List<SalesOrder>  SalesOrder =  salesOrderRepository.fetchSalesOrders();

         return SalesOrder;
     }


}