/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository.imp;

import com.avatech.edi.materials.model.bo.materialinventory.MaterialInventory;
import com.avatech.edi.materials.mapper.MaterialInventoryMapper;
import com.avatech.edi.materials.repository.MaterialInventoryRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialInventoryRepositoryImp implements MaterialInventoryRepository{
    @Autowired
    private MaterialInventoryMapper materialInventoryMapper;


    public void saveMaterialInventory(MaterialInventory materialInventory){
        materialInventoryMapper.insertMaterialInventory(materialInventory);
    }

    public List<MaterialInventory> fetchMaterialInventorys(){
        List<MaterialInventory> materialInventorys = new ArrayList();
        materialInventorys = materialInventoryMapper.searchMaterialInventorys();
        return materialInventorys;
    }
}