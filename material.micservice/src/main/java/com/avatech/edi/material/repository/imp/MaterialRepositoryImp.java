/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.material.repository.imp;

import com.avatech.edi.material.model.bo.material.MaterialItem;
import com.avatech.edi.material.mapper.MaterialMapper;
import com.avatech.edi.material.model.vo.SyncResult;
import com.avatech.edi.material.repository.MaterialRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class MaterialRepositoryImp implements MaterialRepository{
    @Autowired
    private MaterialMapper materialMapper;

    public List<MaterialItem> fetchMaterialItems(){
        List<MaterialItem> materialItems = new ArrayList();
        materialItems = materialMapper.searchMaterialItems();
        return materialItems;
    }

    @Override
    public void updateMaterialItemsUserField(SyncResult syncResult) {
        materialMapper.updateMaterialUserField(syncResult);
    }
}