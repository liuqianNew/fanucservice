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

public class MaterialStockItem{


    /**
     * 单据编号
     */
    @JsonProperty("ItemCode")
    private Integer itemCode;


    /**
     * 物料行号
     */
    @JsonProperty("ItemName")
    private Integer itemName;


    /**
     * 数量
     */
    @JsonProperty("Quantity")
    private Integer quantity;


    /**
     * 物料编号
     */
    @JsonProperty("WhsCode")
    private String whsCode;


    /**
     * 批次号
     */
    @JsonProperty("BatchNum")
    private BigDecimal batchNum;


    /**
     * 用户
     */
    @JsonProperty("UserSign")
    private String userSign;


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



     /**
     * 获取单据编号
     */
    public Integer getItemCode() {
        return itemCode;
    }

    /**
     * 设置单据编号
     */
    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取物料行号
     */
    public Integer getItemName() {
        return itemName;
    }

    /**
     * 设置物料行号
     */
    public void setItemName(Integer itemName) {
        this.itemName = itemName;
    }
     /**
     * 获取行号
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置行号
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
     /**
     * 获取物料编号
     */
    public String getWhsCode() {
        return whsCode;
    }

    /**
     * 设置物料编号
     */
    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }
     /**
     * 获取数量
     */
    public BigDecimal getBatchNum() {
        return batchNum;
    }

    /**
     * 设置数量
     */
    public void setBatchNum(BigDecimal batchNum) {
        this.batchNum = batchNum;
    }
     /**
     * 获取批次号
     */
    public String getUserSign() {
        return userSign;
    }

    /**
     * 设置批次号
     */
    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }
     /**
     * 获取自定义字段
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * 设置自定义字段
     */
    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }
     /**
     * 获取自定义字段
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * 设置自定义字段
     */
    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }
     /**
     * 获取自定义字段
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * 设置自定义字段
     */
    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }
     /**
     * 获取自定义字段
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * 设置自定义字段
     */
    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }
     /**
     * 获取自定义字段
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * 设置自定义字段
     */
    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    @Override
    public String toString() {
        return "{" +
                "\"itemCode\":\"" + itemCode +
                "\",\"itemName\":\"" + itemName +
                "\",\"quantity\":\"" + quantity +
                "\",\"whsCode\":\"" + whsCode +
                "\",\"batchNum\":\"" + batchNum +
                "\",\"userSign\":\"" + userSign +
                "\",\"udf1\":\"" + udf1 +
                "\",\"udf2\":\"" + udf2 +
                "\",\"udf3\":\"" + udf3 +
                "\",\"udf4\":\"" + udf4 +
                "\",\"udf5\":\"" + udf5 +
                "\"}";
    }

    public Result checkData() {
        Result result = new Result();
        if(StringUtils.isEmpty(itemCode)){
            return result.error( "itemCode为空");
        }
        if(StringUtils.isEmpty(itemName)){
            return result.error( "itemName为空");
        }
        if(StringUtils.isEmpty(whsCode)){
            return result.error( "whsCode为空");
        }if(StringUtils.isEmpty(batchNum)){
            return result.error( "batchNum为空");
        }
        return result.ok();
    }
}
