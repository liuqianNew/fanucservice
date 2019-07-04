/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.api;

import com.avatech.edi.materials.service.MaterialService;
import com.avatech.edi.materials.repository.MaterialRepository;
import com.avatech.edi.materials.model.bo.material.Material;
import com.avatech.edi.model.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/edi/sap/v1/*")
public class MaterialController {

    private final Logger logger = LoggerFactory.getLogger(MaterialController.class);

    @Autowired
    private MaterialService materialService;

    @Autowired
    private MaterialRepository materialRepository;


    @GetMapping("material")
    public Result getMaterial(){
        Result<List<Material>> result = new Result<>();
        try{
            List<Material> materialList = materialRepository.fetchMaterialItems();
            return result.ok(materialList);
        }catch (Exception e){
            logger.error("查询物料信息异常：",e);
            return new Result("1","内部错误");
        }
    }
   @PatchMapping("material/{itemCode}")
    public Result cancelMaterial(String itemCode){

       Result<List<Material>> result = new Result<>();
       try{
           List<Material> material=       materialRepository.updateMaterialItem(itemCode);
           return result.ok(material);
       }catch (Exception e){
           logger.error("查询物料信息异常：",e);
           return new Result("1","内部错误");
       }

    }


    @PostMapping("material")
    public @ResponseBody
    Result addMaterial(@RequestBody Material material){
        return null;
    }


}