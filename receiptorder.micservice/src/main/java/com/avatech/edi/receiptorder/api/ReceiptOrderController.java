/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-01
 */
package com.avatech.edi.receiptorder.api;

import com.avatech.edi.receiptorder.model.dto.Result;
import com.avatech.edi.receiptorder.service.ReceiptOrderService;
import com.avatech.edi.receiptorder.repository.ReceiptOrderRepository;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrder;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderItem;
import com.avatech.edi.receiptorder.model.bo.receiptorder.ReceiptOrderBatchItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("mes/v1/*")
public class ReceiptOrderController {

    private final Logger logger = LoggerFactory.getLogger(ReceiptOrderController.class);


    @Autowired
    private ReceiptOrderService receiptOrderService;

    @Autowired
    private ReceiptOrderRepository receiptOrderRepository;


    @GetMapping("receiptorder")
    public ReceiptOrder getReceiptOrder(){
        return  null;
    }

    @PostMapping("receiptorders")
    public @ResponseBody
    List<Result> addReceiptOrder(@RequestBody List<ReceiptOrder> receiptOrders){
        logger.info("接收入库单信息：{}",receiptOrders.toString());
        List<Result> results = new ArrayList<>();
        Result result;
        for (ReceiptOrder receiptOrder:receiptOrders){
            result = new Result();
            try{
                result = receiptOrder.checkData();
                if(result.getCode().equals("0")){
                    receiptOrderService.saveReceiptOrder(receiptOrder);
                }
            }catch (Exception e){
                logger.error("保存入库单异常：{}",e);
                result.error(e.getMessage());
            }
            results.add(result);
        }
        logger.info("回传MES入库信息,{}",results);
        return results;
    }


    @PostMapping("receiptorder")
    public @ResponseBody
    Result addReceiptOrder(@RequestBody ReceiptOrder receiptOrder){
        Result result;
        try{
            logger.info("接收入库信息：{}",receiptOrder.toString());
            result = receiptOrder.checkData();
            if(result.getCode().equals("0")){
                receiptOrderService.saveReceiptOrder(receiptOrder);
                result = new Result().ok(receiptOrder.getDocEntry().toString());
            }
        }catch (Exception e){
            result = new Result().error(receiptOrder.getDocEntry().toString(), e.getMessage());
        }
        logger.info("回传MES入库信息,{}",result.toString());
        return result;
    }


}