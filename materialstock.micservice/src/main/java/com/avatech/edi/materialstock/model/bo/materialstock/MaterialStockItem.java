/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.model.bo.materialstock;

import com.avatech.edi.materialstock.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

public class MaterialStockItem{


    private Long eDIDocEntry;

    @JsonProperty("WhsCode")
    private String whsCode;

    /**
     * 创建者
     */
    @JsonProperty("UserSign")
    private String userSign;

    @JsonProperty("DocTime")
    private String docTime;

    @JsonProperty("DocDate")
    private String docDate;

    /**
     * 数量
     */
    @JsonProperty("Quantity")
    private Integer quantity;


    /**
     * 物料编号
     */
    @JsonProperty("ItemCode")
    private String itemCode;

    /**
     * 物料名称
     */
    @JsonProperty("ItemName")
    private String itemName;

    /**
     * 批次号
     */
    @JsonProperty("BatchNum")
    private String batchNum;


    /**
     * 自定义字段
     */
    @JsonProperty("Udf1")
    private String udf1;


    /**
     * 自定义字段
     */
    @JsonProperty("Udf2")
    private String udf2;


    /**
     * 自定义字段
     */
    @JsonProperty("Udf3")
    private String udf3;


    /**
     * 自定义字段
     */
    @JsonProperty("Udf4")
    private String udf4;


    /**
     * 自定义字段
     */
    @JsonProperty("Udf5")
    private String udf5;

    @JsonProperty("Batchs")
    private List MaterialStockBatchItem;

    public Long geteDIDocEntry() {
        return eDIDocEntry;
    }

    public void seteDIDocEntry(Long eDIDocEntry) {
        this.eDIDocEntry = eDIDocEntry;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getDocTime() {
        return docTime;
    }

    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getUdf1() {
        return udf1;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    public String getUdf2() {
        return udf2;
    }

    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    public String getUdf3() {
        return udf3;
    }

    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }

    public String getUdf4() {
        return udf4;
    }

    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }

    public String getUdf5() {
        return udf5;
    }

    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    public List getMaterialStockBatchItem() {
        return MaterialStockBatchItem;
    }

    public void setMaterialStockBatchItem(List materialStockBatchItem) {
        MaterialStockBatchItem = materialStockBatchItem;
    }

    public Result checkData() throws Exception{
        Result result = new Result();
        if(StringUtils.isEmpty(itemCode)){
            return result.error( "itemCode为空");
        }
        if(StringUtils.isEmpty(quantity)){
            return result.error( "数量为空");
        }if(StringUtils.isEmpty(batchNum)){
            return result.error( "batchNum为空");
        }
        return result.ok();
    }

    @Override
    public String toString() {
        return "MaterialStockItem{" +
                "eDIDocEntry=" + eDIDocEntry +
                ", whsCode='" + whsCode + '\'' +
                ", userSign='" + userSign + '\'' +
                ", docTime='" + docTime + '\'' +
                ", docDate='" + docDate + '\'' +
                ", quantity=" + quantity +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", udf1='" + udf1 + '\'' +
                ", udf2='" + udf2 + '\'' +
                ", udf3='" + udf3 + '\'' +
                ", udf4='" + udf4 + '\'' +
                ", udf5='" + udf5 + '\'' +
                ", MaterialStockBatchItem=" + MaterialStockBatchItem +
                '}';
    }
}
