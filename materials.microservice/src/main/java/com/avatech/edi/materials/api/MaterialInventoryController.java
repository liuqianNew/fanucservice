/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.api;

import com.avatech.edi.materials.model.bo.material.Material;
import com.avatech.edi.materials.service.MaterialInventoryService;
import com.avatech.edi.materials.repository.MaterialInventoryRepository;
import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import com.avatech.edi.model.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/edi/sap/v1/*")
public class MaterialInventoryController {

    private final Logger logger = LoggerFactory.getLogger(MaterialInventoryController.class);

    @Autowired
    private MaterialInventoryService materialInventoryService;

    @Autowired
    private MaterialInventoryRepository materialInventoryRepository;


    @GetMapping("materialinventory")
    public Result getMaterialInventory(){
        Result<List<MaterialInventory>> result = new Result<>();
        try{
            List<MaterialInventory> materialInventories = materialInventoryRepository.fetchMaterialInventorys();
            return result.ok(materialInventories);
        }catch (Exception e){
            logger.error("查询物料信息异常：",e);
            return new Result("1","内部错误");
        }
    }



}