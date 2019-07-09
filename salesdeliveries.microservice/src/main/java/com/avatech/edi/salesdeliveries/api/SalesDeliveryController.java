/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesdeliveries.api;

import com.avatech.edi.model.dto.Result;
import com.avatech.edi.salesdeliveries.service.SalesDeliveryService;
import com.avatech.edi.salesdeliveries.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDelivery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/edi/sap/v1/*")
public class SalesDeliveryController {

    private final Logger logger = LoggerFactory.getLogger(SalesDeliveryController.class);

    @Autowired
    private SalesDeliveryService salesDeliveryService;

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;


    @GetMapping("salesdelivery")
    public Result getSalesDelivery(){

        Result<SalesDelivery> result = new Result<>();
        try{

          salesDeliveryRepository.fetchSalesDeliverys();

            return result.ok();
        }catch (Exception e){
            logger.error("保存销售订单信息异常：",e);
            return new Result().error("1","内部错误");
        }


    }


    @PostMapping("salesdelivery")
    public @ResponseBody
    Result addSalesDelivery(@RequestBody SalesDelivery salesDelivery){

        Result<SalesDelivery> result = new Result<>();
        try{

            SalesDelivery  sdy=  salesDeliveryRepository.saveSalesDelivery(salesDelivery);

            return result.ok(sdy);
        }catch (Exception e){
            logger.error("保存销售订单信息异常：",e);
            return new Result().error("1","内部错误");
        }


    }



}