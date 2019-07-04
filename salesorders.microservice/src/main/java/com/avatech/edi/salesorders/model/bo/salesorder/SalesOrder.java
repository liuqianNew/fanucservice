/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.model.bo.salesorder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
public class SalesOrder{


    /**
     * 单据编码
     */
    private Long docEntry;


    /**
     * 业务伙伴
     */
    @JsonProperty("carcode")
    private String cardCode;


    /**
     * 过账日期
     */
    @JsonProperty("docdate")
    private Date docDate;


    /**
     * 备注
     */
    private String note;


    /**
     * 单据状态
     */
    @JsonIgnore
    private String docStatus;


    /**
     * 删除
     */
    @JsonIgnore
    private String deleted;


    /**
     * 是否同步
     */
    //@JsonProperty("isync")
    @JsonIgnore
    private String isSync;


    /**
     * 同步日期
     */
    @JsonIgnore
    private Date syncDate;


    /**
     * 基于单据号
     */
    @JsonIgnore
    private String baseDocEntry;


    /**
     * 基于单据类型
     */
    @JsonIgnore
    private String baseDocType;


    /**
     * 是否同步
     */
    @JsonIgnore
    private String sapDocEntry;


    /**
     * 平台订单号
     */
    @JsonProperty("billno")
    private String billNo;


    /**
     * 预留字段1
     */
    @JsonIgnore
    private String extend1;


    /**
     * 预留字段2
     */
    private String extend2;


    /**
     * 预留字段3
     */
    private String extend3;


    /**
     * 预留字段4
     */
    private String extend4;


    /**
     * 预留字段5
     */
    private String extend5;


    /**
     * 创建人
     */
    @JsonIgnore
    private String creator;


    /**
     * 创建日期
     */
    @JsonIgnore
    private Date createDate;


    /**
     * 创建时间
     */
    @JsonIgnore
    private Integer createTime;


    @JsonProperty("items")
    private List<SalesOrderLine> salesOrderLines;


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
     * 获取业务伙伴
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置业务伙伴
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
     /**
     * 获取过账日期
     */
    public Date getDocDate() {
        return docDate;
    }

    /**
     * 设置过账日期
     */
    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }
     /**
     * 获取备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     */
    public void setNote(String note) {
        this.note = note;
    }
     /**
     * 获取单据状态
     */
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * 设置单据状态
     */
    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }
     /**
     * 获取删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
     /**
     * 获取是否同步
     */
    public String getIsSync() {
        return isSync;
    }

    /**
     * 设置是否同步
     */
    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }
     /**
     * 获取同步日期
     */
    public Date getSyncDate() {
        return syncDate;
    }

    /**
     * 设置同步日期
     */
    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
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
     * 获取是否同步
     */
    public String getSAPDocEntry() {
        return sapDocEntry;
    }

    /**
     * 设置是否同步
     */
    public void setSAPDocEntry(String sapDocEntry) {
        this.sapDocEntry = sapDocEntry;
    }
     /**
     * 获取平台订单号
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * 设置平台订单号
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
     /**
     * 获取预留字段1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * 设置预留字段1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }
     /**
     * 获取预留字段2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * 设置预留字段2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }
     /**
     * 获取预留字段3
     */
    public String getExtend3() {
        return extend3;
    }

    /**
     * 设置预留字段3
     */
    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }
     /**
     * 获取预留字段4
     */
    public String getExtend4() {
        return extend4;
    }

    /**
     * 设置预留字段4
     */
    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }
     /**
     * 获取预留字段5
     */
    public String getExtend5() {
        return extend5;
    }

    /**
     * 设置预留字段5
     */
    public void setExtend5(String extend5) {
        this.extend5 = extend5;
    }
     /**
     * 获取创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
     /**
     * 获取创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
     /**
     * 获取创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public List<SalesOrderLine> getsalesOrderLines() {
        if(salesOrderLines == null){
            salesOrderLines = new ArrayList<>();
        }
        return salesOrderLines;
    }

    public void setSalesOrderLines(List<SalesOrderLine> salesOrderLines) {
        this.salesOrderLines = salesOrderLines;
    }

    /**
     * 检查订单
     */
    public void check(){


        this.getsalesOrderLines().forEach(c->c.check());
    }
}
