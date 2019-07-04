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

import java.util.List;


@RestController
@RequestMapping("/edi/sap/v1/*")
public class SalesOrderController {

    private final Logger logger = LoggerFactory.getLogger(SalesOrderController.class);

    @Autowired
    private SalesOrderService salesOrderService;

    @Autowired
    private SalesOrderRepository salesOrderRepository;


    @GetMapping("salesorder")
    public SalesOrder getSalesOrder(){

        List<SalesOrder> salesOrder =salesOrderService.fetchSalesOrders();

        return (SalesOrder) salesOrder;
    }

    @PatchMapping("salesorder/{docEntry}")
    public Result cancelSalesOrder(String docEntry){
        Result<SalesOrder> result = new Result<>();
        try{
            //SalesOrder order = salesOrderRepository.saveSalesOrder(salesOrder);

            return result.ok();
        }catch (Exception e){
            logger.error("保存销售订单信息异常：",e);
            return new Result().error("1","内部错误");
        }
    }

    @PostMapping("salesorder")
    public @ResponseBody
    Result addSalesOrder(@RequestBody SalesOrder salesOrder){
        Result<SalesOrder> result = new Result<>();
        try{
            SalesOrder order = salesOrderRepository.saveSalesOrder(salesOrder);

                return result.ok(order);
        }catch (Exception e){
            logger.error("保存销售订单信息异常：",e);
            return new Result().error("1","内部错误");
        }
    }
}