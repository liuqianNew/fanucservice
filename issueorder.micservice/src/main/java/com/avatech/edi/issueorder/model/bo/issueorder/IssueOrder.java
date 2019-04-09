/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.model.bo.issueorder;
import com.avatech.edi.issueorder.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
public class IssueOrder{


    /**
     * 单据编号
     */
    private Long eDIDocEntry;

    /**
     * 过账日期(YYYY-MM-DD)
     */
    @JsonProperty("DocDate")
    private String docDate;


    /**
     * 单据编号
     */
    @JsonProperty("DocEntry")
    private String docEntry;


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
     * 生成时间(HHmmss)
     */
    @JsonProperty("DocTime")
    private Integer docTime;


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

    private Integer errorTime;

    public Integer getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Integer errorTime) {
        this.errorTime = errorTime;
    }

    @JsonProperty("Details")
    private List<IssueOrderItem> issueOrderItems;

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

    public List<IssueOrderItem> getIssueOrderItems() {
        if(issueOrderItems == null){
            issueOrderItems = new ArrayList<>();
        }
        return issueOrderItems;
    }

    public void setIssueOrderItems(List<IssueOrderItem> issueOrderItems) {
        this.issueOrderItems = issueOrderItems;
    }

    public Result checkData() throws Exception {
        Result result = new Result();
        if(StringUtils.isEmpty(docDate)){
            return result.error(docEntry.toString(), "docDate为空");
        }
        for (IssueOrderItem item:issueOrderItems) {
            result = item.checkData();
            if(!result.getCode().equals("0")){
                return result;
            }
        }
        return result.ok(docEntry.toString());
    }

    @Override
    public String toString() {
        return "{" +
                "\"docDate\":\"" +  docDate +
                //"\",\"docEntry\":\"" + docEntry +
                "\",\"comments\":\"" + comments +
                "\",\"userSign\":\"" + userSign +
                "\",\"docTime\":\"" + docTime +
                "\",\"udf1\":\"" + udf1 +
                "\",\"udf2\":\"" + udf2 +
                "\",\"udf3\":\"" + udf3 +
                "\",\"udf4\":\"" + udf4 +
                "\",\"udf5\":\"" + udf5 +
                "\",\"issueOrderItems\":[" + issueOrderItems +
                "]}";
    }
}
