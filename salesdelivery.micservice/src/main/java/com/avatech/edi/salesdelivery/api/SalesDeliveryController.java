/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.api;

import com.avatech.edi.salesdelivery.model.dto.Result;
import com.avatech.edi.salesdelivery.service.SalesDeliveryService;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("mes/v1/*")
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


    @PostMapping("salesdeliverys")
    public @ResponseBody List<Result> addSalesDelivery(@RequestBody List<SalesDelivery> salesDeliveries){
        logger.info("接收销售交货单信息：{}",salesDeliveries.toString());
        List<Result> results = new ArrayList<>();
        Result result;
        for (SalesDelivery salesDelivery:salesDeliveries){
            result = new Result();
            try{
                result = salesDelivery.checkData();
                if(result.getCode().equals("0")){
                    salesDeliveryService.saveSalesDelivery(salesDelivery);
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


}