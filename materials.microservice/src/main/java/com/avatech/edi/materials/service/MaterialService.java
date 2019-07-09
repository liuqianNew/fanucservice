package com.avatech.edi.materials.service;

import com.avatech.edi.materials.model.bo.material.Material;
import com.avatech.edi.materials.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaterialService{

    @Autowired
    private MaterialRepository materialRepository;

    public void updateMaterialStatus(List<Material> materials){
        if(materials == null){
            return;
        }
        for (Material material:materials){
            materialRepository.updateMaterialItem(material.getItemCode());
        }
    }
}