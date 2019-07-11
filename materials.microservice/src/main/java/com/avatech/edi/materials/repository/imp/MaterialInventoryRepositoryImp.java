/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository.imp;

import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import com.avatech.edi.materials.mapper.MaterialInventoryMapper;
import com.avatech.edi.materials.model.dto.MaterialParam;
import com.avatech.edi.materials.repository.MaterialInventoryRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialInventoryRepositoryImp implements MaterialInventoryRepository{
    @Autowired
    private MaterialInventoryMapper materialInventoryMapper;



    public List<MaterialInventory> fetchMaterialInventorys(MaterialParam materialParam){
        List<MaterialInventory> materialInventorys = new ArrayList();
        materialInventorys = materialInventoryMapper.searchMaterialInventorys(materialParam);
        return materialInventorys;
    }
}