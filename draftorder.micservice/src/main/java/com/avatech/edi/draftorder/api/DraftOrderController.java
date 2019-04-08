/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.draftorder.api;

import com.avatech.edi.draftorder.service.DraftOrderService;
import com.avatech.edi.draftorder.repository.DraftOrderRepository;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrderItem;
import com.avatech.edi.draftorder.model.bo.draftorder.BatchItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("mes/v1/*")
public class DraftOrderController {

    @Autowired
    private DraftOrderService draftOrderService;

    @Autowired
    private DraftOrderRepository draftOrderRepository;


    @GetMapping("draftorder")
    public DraftOrder getDraftOrder(){
        return  null;
    }


    @PostMapping("draftorder")
    public @ResponseBody String addDraftOrder(@RequestBody DraftOrder draftOrder){
        return null;
    }


}