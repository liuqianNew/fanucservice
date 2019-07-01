/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.api;

import com.avatech.edi.materials.model.vo.Result;
import com.avatech.edi.materials.service.MaterialInventoryService;
import com.avatech.edi.materials.repository.MaterialInventoryRepository;
import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class MaterialInventoryController {

    private final Logger logger = LoggerFactory.getLogger(MaterialInventoryController.class);

    @Autowired
    private MaterialInventoryService materialInventoryService;

    @Autowired
    private MaterialInventoryRepository materialInventoryRepository;


    @GetMapping("materialinventory")
    public MaterialInventory getMaterialInventory(){
        return  null;
    }


    @PostMapping("materialinventory")
    public @ResponseBody
    Result addMaterialInventory(@RequestBody MaterialInventory materialInventory){
        return null;
    }


}