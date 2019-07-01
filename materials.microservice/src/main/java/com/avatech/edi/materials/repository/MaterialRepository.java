/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.repository;

import com.avatech.edi.materials.model.bo.material.Material;

import java.util.List;

public interface MaterialRepository{

    void saveMaterialItem(Material Material);

    List<Material> fetchMaterialItems();
}