/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository;

import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import org.springframework.stereotype.Component;
import java.util.List;

public interface MaterialInventoryRepository{

    void saveMaterialInventory(MaterialInventory MaterialInventory);

    List<MaterialInventory> fetchMaterialInventorys();
}