/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.material.repository;

import com.avatech.edi.material.model.bo.material.MaterialItem;
import com.avatech.edi.material.model.vo.SyncResult;
import org.springframework.stereotype.Component;
import java.util.List;

public interface MaterialRepository{

    List<MaterialItem> fetchMaterialItems();

    void updateMaterialItemsUserField(SyncResult syncResult);
}