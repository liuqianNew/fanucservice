/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesdeliveries.api;

import com.avatech.edi.salesdeliveries.model.vo.Result;
import com.avatech.edi.salesdeliveries.service.SalesDeliveryService;
import com.avatech.edi.salesdeliveries.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDeliveryLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class SalesDeliveryController {

    private final Logger logger = LoggerFactory.getLogger(SalesDeliveryController.class);

    @Autowired
    private SalesDeliveryService salesDeliveryService;

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;


    @GetMapping("salesdelivery")
    public SalesDelivery getSalesDelivery(){
        return  null;
    }


    @PostMapping("salesdelivery")
    public @ResponseBody
    Result addSalesDelivery(@RequestBody SalesDelivery salesDelivery){
        return null;
    }


}