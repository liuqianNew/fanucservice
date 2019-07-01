/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.api;

import com.avatech.edi.salesorders.model.vo.Result;
import com.avatech.edi.salesorders.service.SalesOrderService;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class SalesOrderController {

    private final Logger logger = LoggerFactory.getLogger(SalesOrderController.class);

    @Autowired
    private SalesOrderService salesOrderService;

    @Autowired
    private SalesOrderRepository salesOrderRepository;


    @GetMapping("salesorder")
    public SalesOrder getSalesOrder(){
        return  null;
    }


    @PostMapping("salesorder")
    public @ResponseBody
    Result addSalesOrder(@RequestBody SalesOrder salesOrder){
        return null;
    }


}