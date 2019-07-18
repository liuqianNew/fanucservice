/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.mapper;


import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStock;
import com.avatech.edi.materialstock.model.bo.materialstock.MaterialStockItem;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MaterialStockMapper{

    void insertMaterialStock(MaterialStock MaterialStock);

    List<MaterialStock> searchMaterialStocks();

    void insertMaterialStockItem(MaterialStockItem MaterialStockItem);

    List<MaterialStockItem> searchMaterialStockItems(Long eDIDocEntry);

    void updateMaterialStock(MaterialStock materialStock);
}