/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.material.mapper;


import com.avatech.edi.material.model.bo.material.MaterialItem;
import com.avatech.edi.material.model.vo.SyncResult;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface MaterialMapper{

    List<MaterialItem> searchMaterialItems();

    void updateMaterialUserField(SyncResult result);
}