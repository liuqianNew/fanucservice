/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.model.bo.salesorder;

import java.math.BigDecimal;

public class SalesOrderLine{


    /**
     * 单据编码
     */
    private Long docEntry;


    /**
     * 行号
     */
    private Integer lineId;


    /**
     * 基于单据号
     */
    private String baseDocEntry;


    /**
     * 基于单据类型
     */
    private String baseDocType;


    /**
     * 基于单据行号
     */
    private Integer baseLineNum;


    /**
     * 物料编号
     */
    private String itemCode;


    /**
     * 条形码
     */
    private String codeBars;


    /**
     * 数量
     */
    private BigDecimal quantity;


    /**
     * 未税单价
     */
    private BigDecimal price;


    /**
     * 仓库
     */
    private String warehouse;



     /**
     * 获取单据编码
     */
    public Long getDocEntry() {
        return docEntry;
    }

    /**
     * 设置单据编码
     */
    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }
     /**
     * 获取行号
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * 设置行号
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }
     /**
     * 获取基于单据号
     */
    public String getBaseDocEntry() {
        return baseDocEntry;
    }

    /**
     * 设置基于单据号
     */
    public void setBaseDocEntry(String baseDocEntry) {
        this.baseDocEntry = baseDocEntry;
    }
     /**
     * 获取基于单据类型
     */
    public String getBaseDocType() {
        return baseDocType;
    }

    /**
     * 设置基于单据类型
     */
    public void setBaseDocType(String baseDocType) {
        this.baseDocType = baseDocType;
    }
     /**
     * 获取基于单据行号
     */
    public Integer getBaseLineNum() {
        return baseLineNum;
    }

    /**
     * 设置基于单据行号
     */
    public void setBaseLineNum(Integer baseLineNum) {
        this.baseLineNum = baseLineNum;
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
     * 获取条形码
     */
    public String getCodeBars() {
        return codeBars;
    }

    /**
     * 设置条形码
     */
    public void setCodeBars(String codeBars) {
        this.codeBars = codeBars;
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
     * 获取未税单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置未税单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
     /**
     * 获取仓库
     */
    public String getWarehouse() {
        return warehouse;
    }

    /**
     * 设置仓库
     */
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
}