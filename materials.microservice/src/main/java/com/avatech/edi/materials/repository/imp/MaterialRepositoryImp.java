/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository.imp;

import com.avatech.edi.materials.model.bo.material.Material;
import com.avatech.edi.materials.mapper.MaterialMapper;
import com.avatech.edi.materials.repository.MaterialRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialRepositoryImp implements MaterialRepository{
    @Autowired
    private MaterialMapper materialMapper;


    public void saveMaterialItem(Material material){
        materialMapper.insertMaterialItem(material);

    }

    @Override
    public List<Material> updateMaterialItem(String itemCode) {

         materialMapper.updateMaterialItem(itemCode);

        return null;
    }

    public List<Material> fetchMaterialItems(){
        List<Material> materials = new ArrayList();
        materials = materialMapper.searchMaterialItems();
        return materials;
    }
}