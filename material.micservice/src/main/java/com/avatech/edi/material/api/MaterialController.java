/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.material.api;

import com.avatech.edi.material.model.dto.Result;
import com.avatech.edi.material.service.MaterialService;
import com.avatech.edi.material.repository.MaterialRepository;
import com.avatech.edi.material.model.bo.material.MaterialItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("mes/v1/*")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @Autowired
    private MaterialRepository materialRepository;


    @GetMapping("material")
    public MaterialItem getMaterial(){
        return  null;
    }


    @PostMapping("material")
    public @ResponseBody
    Result addMaterial(@RequestBody MaterialItem material){
        return null;
    }


}