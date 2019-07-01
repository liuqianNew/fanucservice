/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.api;

import com.avatech.edi.materials.model.vo.Result;
import com.avatech.edi.materials.service.MaterialService;
import com.avatech.edi.materials.repository.MaterialRepository;
import com.avatech.edi.materials.model.bo.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class MaterialController {

    private final Logger logger = LoggerFactory.getLogger(MaterialController.class);

    @Autowired
    private MaterialService materialService;

    @Autowired
    private MaterialRepository materialRepository;


    @GetMapping("material")
    public Material getMaterial(){
        return  null;
    }


    @PostMapping("material")
    public @ResponseBody
    Result addMaterial(@RequestBody Material material){
        return null;
    }


}