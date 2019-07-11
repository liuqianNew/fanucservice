/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.api;

import com.avatech.edi.model.dto.Result;
import com.avatech.edi.salesorders.service.SalesOrderService;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import org.apache.ibatis.annotations.Param;
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


<<<<<<< HEAD
    @PatchMapping("salesorder/{docentry}")
    public Result cancelSalesOrder(@Param("docentry") String docEntry) {
        Result<SalesOrder> result = new Result<>();
        try {
            salesOrderRepository.updateSalesOrder(docEntry);
            return result.ok();
=======
    @PatchMapping("salesorder/{billno}")
    public @ResponseBody Result cancelSalesOrder(@PathVariable("billno") String billno) {
        Result<SalesOrder> result = new Result<>();
        try {
            SalesOrder salesOrder = salesOrderRepository.updateSalesOrder(billno);
            return result.ok(salesOrder);
>>>>>>> 15b95efb94c566b9b3e75467c4b67a68f3f37a53
        } catch (Exception e) {
            logger.error("撤销销售订单信息异常：", e);
            return new Result().error("1", "内部错误");
        }
    }

    @PostMapping("salesorder")
    public @ResponseBody Result addSalesOrder(@RequestBody SalesOrder salesOrder) {
        Result<SalesOrder> result = new Result<>();
        try {
            salesOrder.check();
            SalesOrder order = salesOrderRepository.saveSalesOrder(salesOrder);
            return result.ok(order);
        } catch (Exception e) {
            logger.error("保存销售订单信息异常：", e);
            return new Result().error("1", "内部错误");
        }
    }
}