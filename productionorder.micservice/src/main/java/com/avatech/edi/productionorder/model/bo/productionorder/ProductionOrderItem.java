/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.productionorder.model.bo.productionorder;

import com.avatech.edi.productionorder.common.DataHandle;

import java.math.BigDecimal;

public class ProductionOrderItem{


    /**
     * 单据编号
     */
    private Integer docEntry;


    /**
     * 行号
     */
    private Integer lineNum;


    /**
     * 物料编号
     */
    private String itemCode;


    /**
     * 物料描述
     */
    private String itemName;


    /**
     * 基础数量
     */
    private BigDecimal baseQty;


    /**
     * 计划
     */
    private BigDecimal plannedQty;


    /**
     * 仓库
     */
    private String wareHouse;


    /**
     * 项目代码
     */
    private String project;


    /**
     * 分配规则
     */
    private String ocrCode;


    /**
     * 分配规则2
     */
    private String ocrCode2;


    /**
     * 分配规则3
     */
    private String ocrCode3;


    /**
     * 分配规则4
     */
    private String ocrCode4;


    /**
     * 分配规则5
     */
    private String ocrCode5;


    /**
     * 预留字段1
     */
    private String udf1;


    /**
     * 预留字段2
     */
    private String udf2;


    /**
     * 预留字段3
     */
    private String udf3;


    /**
     * 预留字段4
     */
    private String udf4;


    /**
     * 预留字段5
     */
    private String udf5;



     /**
     * 获取单据编号
     */
    public Integer getdocEntry() {
        return docEntry;
    }

    /**
     * 设置单据编号
     */
    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }
     /**
     * 获取行号
     */
    public Integer getlineNum() {
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
    public String getitemCode() {
        return itemCode;
    }

    /**
     * 设置物料编号
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取物料描述
     */
    public String getitemName() {
        return itemName;
    }

    /**
     * 设置物料描述
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
     /**
     * 获取基础数量
     */
    public BigDecimal getbaseQty() {
        return baseQty;
    }

    /**
     * 设置基础数量
     */
    public void setBaseQty(BigDecimal baseQty) {
        this.baseQty = baseQty;
    }
     /**
     * 获取计划
     */
    public BigDecimal getplannedQty() {
        return plannedQty;
    }

    /**
     * 设置计划
     */
    public void setPlannedQty(BigDecimal plannedQty) {
        this.plannedQty = plannedQty;
    }
     /**
     * 获取仓库
     */
    public String getwareHouse() {
        return wareHouse;
    }

    /**
     * 设置仓库
     */
    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }
     /**
     * 获取项目代码
     */
    public String getproject() {
        return project;
    }

    /**
     * 设置项目代码
     */
    public void setProject(String project) {
        this.project = project;
    }
     /**
     * 获取分配规则
     */
    public String getocrCode() {
        return ocrCode;
    }

    /**
     * 设置分配规则
     */
    public void setOcrCode(String ocrCode) {
        this.ocrCode = ocrCode;
    }
     /**
     * 获取分配规则2
     */
    public String getocrCode2() {
        return ocrCode2;
    }

    /**
     * 设置分配规则2
     */
    public void setOcrCode2(String ocrCode2) {
        this.ocrCode2 = ocrCode2;
    }
     /**
     * 获取分配规则3
     */
    public String getocrCode3() {
        return ocrCode3;
    }

    /**
     * 设置分配规则3
     */
    public void setOcrCode3(String ocrCode3) {
        this.ocrCode3 = ocrCode3;
    }
     /**
     * 获取分配规则4
     */
    public String getocrCode4() {
        return ocrCode4;
    }

    /**
     * 设置分配规则4
     */
    public void setOcrCode4(String ocrCode4) {
        this.ocrCode4 = ocrCode4;
    }
     /**
     * 获取分配规则5
     */
    public String getocrCode5() {
        return ocrCode5;
    }

    /**
     * 设置分配规则5
     */
    public void setOcrCode5(String ocrCode5) {
        this.ocrCode5 = ocrCode5;
    }
     /**
     * 获取预留字段1
     */
    public String getudf1() {
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
    public String getudf2() {
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
    public String getudf3() {
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
    public String getudf4() {
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
    public String getudf5() {
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
                "\"DocEntry\":\"" + docEntry +
                "\",\"LineNum\":\"" + lineNum +
                "\",\"ItemCode\":\"" + itemCode +
                "\",\"ItemName\":\"" + itemName +
                "\",\"BaseQty\":\"" + baseQty +
                "\",\"PlannedQty\":\"" + plannedQty +
                "\",\"WareHouse\":\"" + wareHouse +
                "\",\"Project\":\"" + DataHandle.getValue(project) +
                "\",\"OcrCode\":\"" + DataHandle.getValue(ocrCode) +
                "\",\"OcrCode2\":\"" + DataHandle.getValue(ocrCode2) +
                "\",\"OcrCode3\":\"" + DataHandle.getValue(ocrCode3) +
                "\",\"OcrCode4\":\"" + DataHandle.getValue(ocrCode4) +
                "\",\"OcrCode5\":\"" + DataHandle.getValue(ocrCode5) +
                "\",\"Udf1\":\"" + DataHandle.getValue(udf1) +
                "\",\"Udf2\":\"" + DataHandle.getValue(udf2) +
                "\",\"Udf3\":\"" + DataHandle.getValue(udf3) +
                "\",\"Udf4\":\"" + DataHandle.getValue(udf4) +
                "\",\"Udf5\":\"" + DataHandle.getValue(udf5) +
                "\"}";
    }
}
