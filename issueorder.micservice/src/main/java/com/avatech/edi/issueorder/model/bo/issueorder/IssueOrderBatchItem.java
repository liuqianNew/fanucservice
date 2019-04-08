/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.model.bo.issueorder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class IssueOrderBatchItem{

    /**
     * 单据编号
     */
    private Long eDIDocEntry;

    /**
     * 行号
     */
    private Integer eDILineId;

    /**
     * 行号
     */
    private Integer eDIItemLineId;

    /**
     * 单据编号
     */
    @JsonProperty("DocEntry")
    private Integer docEntry;


    /**
     * 物料行号
     */
    @JsonProperty("ItemLineId")
    private Integer itemLineId;


    /**
     * 行号
     */
    @JsonProperty("LineNum")
    private Integer lineNum;


    /**
     * 物料编号
     */
    @JsonProperty("ItemCode")
    private String itemCode;


    /**
     * 数量
     */
    @JsonProperty("Quantity")
    private BigDecimal quantity;


    /**
     * 批次号
     */
    @JsonProperty("BatchNum")
    private String batchNum;


    /**
     * 预留字段1
     */
    @JsonProperty("Udf1")
    private String udf1;


    /**
     * 预留字段2
     */
    @JsonProperty("Udf2")
    private String udf2;


    /**
     * 预留字段3
     */
    @JsonProperty("Udf3")
    private String udf3;


    /**
     * 预留字段4
     */
    @JsonProperty("Udf4")
    private String udf4;


    /**
     * 预留字段5
     */
    @JsonProperty("Udf5")
    private String udf5;

    /**
     * 获取单据编号
     */
    public Long getEDIDocEntry() {
        return eDIDocEntry;
    }

    /**
     * 设置单据编号
     */
    public void setEDIDocEntry(Long eDIDocEntry) {
        this.eDIDocEntry = eDIDocEntry;
    }
    /**
     * 获取行号
     */
    public Integer getEDILineId() {
        return eDILineId;
    }

    /**
     * 设置行号
     */
    public void setEDILineId(Integer eDILineId) {
        this.eDILineId = eDILineId;
    }
    /**
     * 获取行号
     */
    public Integer getEDIItemLineId() {
        return eDIItemLineId;
    }

    /**
     * 设置行号
     */
    public void setEDIItemLineId(Integer eDIItemLineId) {
        this.eDIItemLineId = eDIItemLineId;
    }

     /**
     * 获取单据编号
     */
    public Integer getDocEntry() {
        return docEntry;
    }

    /**
     * 设置单据编号
     */
    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }
     /**
     * 获取物料行号
     */
    public Integer getItemLineId() {
        return itemLineId;
    }

    /**
     * 设置物料行号
     */
    public void setItemLineId(Integer itemLineId) {
        this.itemLineId = itemLineId;
    }
     /**
     * 获取行号
     */
    public Integer getLineNum() {
        return lineNum;
    }

    /**
     * 设置行号
     */
    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }
     /**
     * 获取物料编号
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编号
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
     /**
     * 获取批次号
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批次号
     */
    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }
     /**
     * 获取预留字段1
     */
    public String getUdf1() {
        return udf1;
    }

    /**
     * 设置预留字段1
     */
    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }
     /**
     * 获取预留字段2
     */
    public String getUdf2() {
        return udf2;
    }

    /**
     * 设置预留字段2
     */
    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }
     /**
     * 获取预留字段3
     */
    public String getUdf3() {
        return udf3;
    }

    /**
     * 设置预留字段3
     */
    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }
     /**
     * 获取预留字段4
     */
    public String getUdf4() {
        return udf4;
    }

    /**
     * 设置预留字段4
     */
    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }
     /**
     * 获取预留字段5
     */
    public String getUdf5() {
        return udf5;
    }

    /**
     * 设置预留字段5
     */
    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    @Override
    public String toString() {
        return "{" +
                //"docEntry\":\"" + docEntry +
                //"\",\"itemLineId\":\"" + itemLineId +
                //"\",\"lineNum\":\"" + lineNum +
                "\",\"itemCode\":\"" + itemCode +
                "\",\"quantity\":\"" + quantity +
                "\",\"batchNum\":\"" + batchNum +
                "\",\"udf1\":\"" + udf1 +
                "\",\"udf2\":\"" + udf2 +
                "\",\"udf3\":\"" + udf3 +
                "\",\"udf4\":\"" + udf4 +
                "\",\"udf5\":\"" + udf5 +
                '}';
    }
}
