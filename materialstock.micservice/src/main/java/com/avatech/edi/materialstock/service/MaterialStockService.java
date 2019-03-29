package com.avatech.edi.materialstock.service;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.repository.MaterialStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MaterialStockService{

    @Autowired
    private MaterialStockRepository materialStockRepository;

    @Transactional
    public void saveMaterialStocks(List<MaterialStock> materialStocks){
        if(materialStocks == null || materialStocks.size() == 0){
            return;
        }
        for (MaterialStock materialStock : materialStocks) {
            materialStockRepository.saveMaterialStock(materialStock);
        }
    }
}

