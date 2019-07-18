package com.avatech.edi.materialstock.service;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class MaterialStockService{

    @Autowired
    private MaterialStockRepository materialStockRepository;

    @Transactional
    public void saveMaterialStocks(MaterialStock materialStock){
        if(materialStock == null || StringUtils.isEmpty(materialStock)){
            return;
        }
        materialStockRepository.saveMaterialStock(materialStock);
    }

    public List<MaterialStock> fetchMaterialStocks(){
        return materialStockRepository.fetchMaterialStocks();
    }

    public void updateMaterialStock(MaterialStock materialStock){
        materialStockRepository.updateMaterialStock(materialStock);
    }
}

