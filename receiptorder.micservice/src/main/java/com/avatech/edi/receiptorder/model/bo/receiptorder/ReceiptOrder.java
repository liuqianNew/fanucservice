/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-29
 */
package com.avatech.edi.receiptorder.model.bo.receiptorder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ReceiptOrder{


    /**
     * 过账日期(YYYY-MM-DD)
     */
    private String docDate;


    /**
     * 单据编号
     */
    private Integer docEntry;


    /**
     * 备注
     */
    private String comments;


    /**
     * 生产订单关闭
     */
    private String status;


    /**
     * 创建人
     */
    private String userSign;


    /**
     * 生成时间(HHmmss)
     */
    private Integer docTime;


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


    private List<ReceiptOrderItem> receiptOrderItems;


     /**
     * 获取过账日期(YYYY-MM-DD)
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * 设置过账日期(YYYY-MM-DD)
     */
    public void setDocDate(String docDate) {
        this.docDate = docDate;
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
     * 获取生产订单关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置生产订单关闭
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取生成时间(HHmmss)
     */
    public Integer getDocTime() {
        return docTime;
    }

    /**
     * 设置生成时间(HHmmss)
     */
    public void setDocTime(Integer docTime) {
        this.docTime = docTime;
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

    public List<ReceiptOrderItem> getreceiptOrderItems() {
        if(receiptOrderItems == null){
            receiptOrderItems = new ArrayList<>();
        }
        return receiptOrderItems;
    }

    public void setReceiptOrderItems(List<ReceiptOrderItem> receiptOrderItems) {
        this.receiptOrderItems = receiptOrderItems;
    }


}
