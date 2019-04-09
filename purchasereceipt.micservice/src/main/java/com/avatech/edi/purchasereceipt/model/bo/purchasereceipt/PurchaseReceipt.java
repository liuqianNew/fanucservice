/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.purchasereceipt.model.bo.purchasereceipt;
import com.avatech.edi.purchasereceipt.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class PurchaseReceipt{


    /**
     * 单据编号
     */
    private Long eDIDocEntry;


    /**
     * 单据编号
     */
    @JsonProperty("DocEntry")
    private String docEntry;


    /**
     * 供应商代码
     */
    @JsonProperty("CardCode")
    private String cardCode;


    /**
     * 供应商名称
     */
    @JsonProperty("CardName")
    private String cardName;


    /**
     * 单据类型
     */
    @JsonProperty("DocType")
    private String docType;


    /**
     * 过账日期
     */
    @JsonProperty("DocDate")
    private Date docDate;


    /**
     * 单据状态
     */
    @JsonProperty("DocStatus")
    private String docStatus;


    /**
     * 创建人
     */
    @JsonProperty("UserSign")
    private String userSign;


    /**
     * 备注
     */
    @JsonProperty("Comments")
    private String comments;


    /**
     * 生成时间
     */
    @JsonProperty("DocTime")
    private Integer docTime;


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


    @JsonProperty("Details")
    private List<PurchaseReceiptItem> purchaseReceiptItems;

    private Integer errorTime;

    public Integer getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Integer errorTime) {
        this.errorTime = errorTime;
    }


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
     * 获取单据编号
     */
    public String getDocEntry() {
        return docEntry;
    }

    /**
     * 设置单据编号
     */
    public void setDocEntry(String docEntry) {
        this.docEntry = docEntry;
    }
     /**
     * 获取供应商代码
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置供应商代码
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
     /**
     * 获取供应商名称
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置供应商名称
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
     /**
     * 获取单据类型
     */
    public String getDocType() {
        return docType;
    }

    /**
     * 设置单据类型
     */
    public void setDocType(String docType) {
        this.docType = docType;
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
     * 获取创建人
     */
    public String getUserSign() {
        return userSign;
    }

    /**
     * 设置创建人
     */
    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }
     /**
     * 获取备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
     /**
     * 获取生成时间
     */
    public Integer getDocTime() {
        return docTime;
    }

    /**
     * 设置生成时间
     */
    public void setDocTime(Integer docTime) {
        this.docTime = docTime;
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

    public List<PurchaseReceiptItem> getpurchaseReceiptItems() {
        if(purchaseReceiptItems == null){
            purchaseReceiptItems = new ArrayList<>();
        }
        return purchaseReceiptItems;
    }

    public void setPurchaseReceiptItems(List<PurchaseReceiptItem> purchaseReceiptItems) {
        this.purchaseReceiptItems = purchaseReceiptItems;
    }

    public Result checkData() throws Exception {
        Result result = new Result();
        if(StringUtils.isEmpty(docDate)){
            return result.error(docEntry.toString(), "docDate为空");
        }
        for (PurchaseReceiptItem item:purchaseReceiptItems) {
            result = item.checkData();
            if(!result.getCode().equals("0")){
                return result;
            }
        }
        return result.ok(docEntry.toString());
    }
}
