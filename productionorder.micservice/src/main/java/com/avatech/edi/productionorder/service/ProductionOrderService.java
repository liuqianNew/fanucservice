package com.avatech.edi.productionorder.service;

import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import com.avatech.edi.productionorder.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductionOrderService{

    @Autowired
    private ProductionOrderRepository productionOrderRepository;

    /**
     * 获取生产订单
     * @return
     */
    public List<ProductionOrder> fetchProdutionOrder(){
        return productionOrderRepository.fetchProductionOrders();
    }



}