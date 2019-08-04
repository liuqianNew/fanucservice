/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.productionorder.api;

import com.avatech.edi.productionorder.service.ProductionOrderService;
import com.avatech.edi.productionorder.repository.ProductionOrderRepository;
import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("mes/v1/*")
public class ProductionOrderController {

    @Autowired
    private ProductionOrderService productionOrderService;

    @Autowired
    private ProductionOrderRepository productionOrderRepository;


    @GetMapping("productionorder")
    public ProductionOrder getProductionOrder(){
        return  null;
    }


    @PostMapping("productionorder")
    public @ResponseBody String addProductionOrder(@RequestBody ProductionOrder productionOrder){
        return null;
    }


}