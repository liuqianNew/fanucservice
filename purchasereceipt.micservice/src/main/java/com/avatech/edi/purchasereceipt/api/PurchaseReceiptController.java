/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.api;

import com.avatech.edi.purchasereceipt.service.PurchaseReceiptService;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class PurchaseReceiptController {

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;


    @GetMapping("purchasereceipt")
    public PurchaseReceipt getPurchaseReceipt(){
        return  null;
    }


    @PostMapping("purchasereceipt")
    public @ResponseBody String addPurchaseReceipt(@RequestBody PurchaseReceipt purchaseReceipt){
        return null;
    }


}