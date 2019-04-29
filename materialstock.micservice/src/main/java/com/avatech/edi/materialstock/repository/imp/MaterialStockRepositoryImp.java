/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.repository.imp;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
import com.avatech.edi.materialstock.mapper.MaterialStockMapper;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialStockRepositoryImp implements MaterialStockRepository{
    @Autowired
    private MaterialStockMapper materialStockMapper;

    public void saveMaterialStock(MaterialStock materialStock){
        materialStockMapper.insertMaterialStock(materialStock);
        for (MaterialStockItem materialStockItem:materialStock.getmaterialStockItems()) {
            materialStockMapper.insertMaterialStockItem(materialStockItem);
        }
    }

    public List<MaterialStock> fetchMaterialStocks(){
        List<MaterialStock> materialStocks = new ArrayList();
        materialStocks = materialStockMapper.searchMaterialStocks();
        for (MaterialStock materialStock:materialStocks) {
            materialStock.getmaterialStockItems().addAll(materialStockMapper.searchMaterialStockItems());
        }
        return materialStocks;
    }

    @Override
    public void deleteAllMaterialStock() {
        materialStockMapper.deleteAllMaterialStock();
        materialStockMapper.deleteAllMaterialStockItem();
    }

    @Override
    public void updateMaterialStock(MaterialStock materialStock){
        materialStockMapper.updateMaterialStock(materialStock);
    }

}