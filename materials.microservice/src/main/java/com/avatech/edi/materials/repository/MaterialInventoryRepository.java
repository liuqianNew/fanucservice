/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository;

import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import com.avatech.edi.materials.model.dto.MaterialParam;
import org.springframework.stereotype.Component;
import java.util.List;

public interface MaterialInventoryRepository{

    List<MaterialInventory> fetchMaterialInventorys(MaterialParam materialParam);
}