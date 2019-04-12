/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.model.bo.salesdelivery;
import com.avatech.edi.salesdelivery.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class SalesDelivery{

    /**
     * 单据编号
     */
    private Long eDIDocEntry;

    private String isSync;

    private String syncMessage;

    private Date syncDate;

    private Integer syncTime;

    private String sapDocEntry;

    /**
     * 单据编号
     */
    @JsonProperty("DocEntry")
    private String docEntry;


    /**
     * 客户代码
     */
    @JsonProperty("CardCode")
    private String cardCode;


    /**
     * 客户名称
     */
    @JsonProperty("CardName")
    private String cardName;


    /**
     * 收货方
     */
    @JsonProperty("ShiptoCode")
    private String shiptoCode;


    /**
     * 收货地址
     */
    @JsonProperty("Address3")
    private String address3;


    /**
     * 联系电话(Ocrd)
     */
    @JsonProperty("Phone1")
    private String phone1;


    /**
     * 联系人
     */
    @JsonProperty("CntctCode")
    private String cntctCode;


    /**
     * 单据类型
     */
    @JsonProperty("DocType")
    private String docType;


    /**
     * 过账日期(YYYY-MM-DD)
     */
    @JsonProperty("DocDate")
    private Date docDate;


    /**
     * 单据状态
     */
    @JsonProperty("DocStatus")
    private String docStatus;


    /**
     * 备注
     */
    @JsonProperty("Comments")
    private String comments;


    /**
     * 创建人
     */
    @JsonProperty("UserSign")
    private String userSign;


    /**
     * 付款方式
     */
    @JsonProperty("PayType")
    private String payType;


    /**
     * 货运单号
     */
    @JsonProperty("DeliveryNum")
    private String deliveryNum;


    /**
     * 生成时间(hhMMss)
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
    private List<SalesDeliveryItem> salesDeliveryItems;

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


    public String getIsSync() {
        return isSync;
    }

    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }

    public Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public Integer getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Integer syncTime) {
        this.syncTime = syncTime;
    }

    public String getSapDocEntry() {
        return sapDocEntry;
    }

    public void setSapDocEntry(String sapDocEntry) {
        this.sapDocEntry = sapDocEntry;
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
     * 获取客户代码
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置客户代码
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
     /**
     * 获取客户名称
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置客户名称
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
     /**
     * 获取收货方
     */
    public String getShiptoCode() {
        return shiptoCode;
    }

    /**
     * 设置收货方
     */
    public void setShiptoCode(String shiptoCode) {
        this.shiptoCode = shiptoCode;
    }
     /**
     * 获取收货地址
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 设置收货地址
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }
     /**
     * 获取联系电话(Ocrd)
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置联系电话(Ocrd)
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }
     /**
     * 获取联系人
     */
    public String getCntctCode() {
        return cntctCode;
    }

    /**
     * 设置联系人
     */
    public void setCntctCode(String cntctCode) {
        this.cntctCode = cntctCode;
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
     * 获取过账日期(YYYY-MM-DD)
     */
    public Date getDocDate() {
        return docDate;
    }

    /**
     * 设置过账日期(YYYY-MM-DD)
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
     * 获取付款方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置付款方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }
     /**
     * 获取货运单号
     */
    public String getDeliveryNum() {
        return deliveryNum;
    }

    /**
     * 设置货运单号
     */
    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }
     /**
     * 获取生成时间(hhMMss)
     */
    public Integer getDocTime() {
        return docTime;
    }

    /**
     * 设置生成时间(hhMMss)
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

    public List<SalesDeliveryItem> getsalesDeliveryItems() {
        if(salesDeliveryItems == null){
            salesDeliveryItems = new ArrayList<>();
        }
        return salesDeliveryItems;
    }

    public void setSalesDeliveryItems(List<SalesDeliveryItem> salesDeliveryItems) {
        this.salesDeliveryItems = salesDeliveryItems;
    }

    public Result checkData() throws Exception {
        Result result = new Result();
        if(StringUtils.isEmpty(docDate)){
            return result.error(docEntry.toString(), "docDate为空");
        }
        for (SalesDeliveryItem item:salesDeliveryItems) {
            result = item.checkData();
            if(!result.getCode().equals("0")){
                return result;
            }
        }
        return result.ok(docEntry.toString());
    }

    @Override
    public String toString() {
        return "SalesDelivery{" +
                "eDIDocEntry=" + eDIDocEntry +
                ", docEntry='" + docEntry + '\'' +
                ", cardCode='" + cardCode + '\'' +
                ", cardName='" + cardName + '\'' +
                ", shiptoCode='" + shiptoCode + '\'' +
                ", address3='" + address3 + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", cntctCode='" + cntctCode + '\'' +
                ", docType='" + docType + '\'' +
                ", docDate=" + docDate +
                ", docStatus='" + docStatus + '\'' +
                ", comments='" + comments + '\'' +
                ", userSign='" + userSign + '\'' +
                ", payType='" + payType + '\'' +
                ", deliveryNum='" + deliveryNum + '\'' +
                ", docTime=" + docTime +
                ", udf1='" + udf1 + '\'' +
                ", udf2='" + udf2 + '\'' +
                ", udf3='" + udf3 + '\'' +
                ", udf4='" + udf4 + '\'' +
                ", udf5='" + udf5 + '\'' +
                ", salesDeliveryItems=" + salesDeliveryItems +
                ", errorTime=" + errorTime +
                '}';
    }
}
