/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.model.bo.materialinventory;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class MaterialInventory{


    /**
     * 物料编码
     */
    private String itemCode;


    /**
     * 物料描述
     */
    private String itemName;


    /**
     * 物料组编码
     */
    private String groupCode;


    /**
     * 物料组描述
     */
    private String groupName;


    /**
     * 销售计量单位
     */
    @JsonProperty
    private String packUnit;


    /**
     * 库存数量
     */
    @JsonIgnore
    private BigDecimal onHand;


    /**
     * 单价
     */
    @JsonIgnore
    private BigDecimal price;



     /**
     * 获取物料编码
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编码
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取物料描述
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置物料描述
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
     /**
     * 获取物料组编码
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置物料组编码
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
     /**
     * 获取物料组描述
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置物料组描述
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
     /**
     * 获取销售计量单位
     */
    public String getPackUnit() {
        return packUnit;
    }

    /**
     * 设置销售计量单位
     */
    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }
     /**
     * 获取库存数量
     */
    public BigDecimal getOnHand() {
        return onHand;
    }

    /**
     * 设置库存数量
     */
    public void setOnHand(BigDecimal onHand) {
        this.onHand = onHand;
    }
     /**
     * 获取单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
