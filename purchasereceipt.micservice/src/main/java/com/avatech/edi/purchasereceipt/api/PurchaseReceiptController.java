/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.api;

import com.avatech.edi.purchasereceipt.model.dto.Result;
import com.avatech.edi.purchasereceipt.service.PurchaseReceiptService;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("mes/v1/*")
public class PurchaseReceiptController {

    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptController.class);
    
    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;


    @GetMapping("purchasereceipt")
    public PurchaseReceipt getPurchaseReceipt(){
        return  null;
    }


    @PostMapping("purchasereceipts")
    public @ResponseBody List<Result> addPurchaseReceipt(@RequestBody List<PurchaseReceipt> purchaseReceipts){
        logger.info("接收采购收货信息：{}",purchaseReceipts.toString());
        List<Result> results = new ArrayList<>();
        Result result;
        for (PurchaseReceipt purchaseReceipt:purchaseReceipts){
            result = new Result();
            try{
                result = purchaseReceipt.checkData();
                if(result.getCode().equals("0")){
                    purchaseReceiptService.savePurchaseReceipt(purchaseReceipt);
                }
            }catch (Exception e){
                logger.error("保存采购收货信息异常：{}",e);
                result.error(e.getMessage());
            }
            results.add(result);
        }
        logger.info("回传MES采购收货信息,{}",results);
        return results;
    }

    @PostMapping("purchasereceipt")
    public @ResponseBody
    Result addPurchaseReceipt(@RequestBody PurchaseReceipt purchaseReceipt){
        Result result;
        try{
            logger.info("接收采购收货信息：{}",purchaseReceipt.toString());
            result = purchaseReceipt.checkData();
            if(result.getCode().equals("0")){
                purchaseReceiptService.savePurchaseReceipt(purchaseReceipt);
                result = new Result().ok(purchaseReceipt.getDocEntry().toString());
            }
        }catch (Exception e){
            result = new Result().error(purchaseReceipt.getDocEntry().toString(), e.getMessage());
        }
        logger.info("回传MES采购收货信息,{}",result.toString());
        return result;
    }
}