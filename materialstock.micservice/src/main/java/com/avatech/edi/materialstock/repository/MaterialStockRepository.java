/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.repository;

import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface MaterialStockRepository{

    void saveMaterialStock(MaterialStock MaterialStock);

    List<MaterialStock> fetchMaterialStocks();

    void deleteAllMaterialStock();

    void updateMaterialStock(MaterialStock materialStock);
}