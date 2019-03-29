/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.api;

import com.avatech.edi.materialstock.model.dto.Result;
import com.avatech.edi.materialstock.service.MaterialStockService;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("mes/v1/*")
public class MaterialStockController {

    private final Logger logger = LoggerFactory.getLogger(MaterialStockController.class);

    @Autowired
    private MaterialStockService materialStockService;


    @GetMapping("materialstock")
    public MaterialStock getMaterialStock(){
        return  null;
    }


    @PostMapping("materialstock")
    public @ResponseBody
    Result addMaterialStock(@RequestBody List<MaterialStock> materialStocks){
        Result result = new Result();
        try{
            materialStockService.saveMaterialStocks(materialStocks);
            result.ok();
        }catch (Exception e){
            result.error(e.getMessage());
            logger.error("接收物料库存异常",e);
        }
        return result;
    }


}