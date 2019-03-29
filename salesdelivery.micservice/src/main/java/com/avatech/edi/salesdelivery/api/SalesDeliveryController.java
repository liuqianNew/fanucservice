/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.api;

import com.avatech.edi.salesdelivery.service.SalesDeliveryService;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesOrderBatchItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class SalesDeliveryController {

    @Autowired
    private SalesDeliveryService salesDeliveryService;

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;


    @GetMapping("salesdelivery")
    public SalesDelivery getSalesDelivery(){
        return  null;
    }


    @PostMapping("salesdelivery")
    public @ResponseBody String addSalesDelivery(@RequestBody SalesDelivery salesDelivery){
        return null;
    }


}