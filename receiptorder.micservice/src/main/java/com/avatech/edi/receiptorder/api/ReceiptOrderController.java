/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-29
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


@RestController
@RequestMapping("v1/*")
public class ReceiptOrderController {

    @Autowired
    private ReceiptOrderService receiptOrderService;

    @Autowired
    private ReceiptOrderRepository receiptOrderRepository;


    @GetMapping("receiptorder")
    public ReceiptOrder getReceiptOrder(){
        return  null;
    }


    @PostMapping("receiptorder")
    public @ResponseBody
    Result addReceiptOrder(@RequestBody ReceiptOrder receiptOrder){
        return null;
    }


}