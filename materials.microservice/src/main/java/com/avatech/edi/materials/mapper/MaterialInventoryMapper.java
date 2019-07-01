/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.mapper;


import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MaterialInventoryMapper{

    void insertMaterialInventory(MaterialInventory MaterialInventory);

    List<MaterialInventory> searchMaterialInventorys();
}