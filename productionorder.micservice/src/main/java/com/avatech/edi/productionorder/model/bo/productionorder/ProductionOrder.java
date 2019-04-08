/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.productionorder.model.bo.productionorder;
import com.avatech.edi.productionorder.common.DataHandle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ProductionOrder{


    /**
     * 单据编号
     */
    private Integer docEntry;


    /**
     * 产品编号
     */
    private String itemCode;


    /**
     * 生产订单状态
     */
    private String status;


    /**
     * 生产订单类型(常规/返工)
     */
    private String type;


    /**
     * 计划数量-抬头
     */
    private BigDecimal plannedQty;


    /**
     * 备注
     */
    private String comments;


    /**
     * 审批日期(格式：YYYY-MM-DD)
     */
    private Date rlsDate;


    /**
     * 仓库
     */
    private String warehouse;


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
     * 生产订单原始编号
     */
    private Integer originNum;


    /**
     * 客户代码
     */
    private String cardcode;


    /**
     * 用户签名
     */
    private String userSign;


    /**
     * 开始日期(格式：YYYY-MM-DD)
     */
    private Date startDate;


    /**
     * 到期日(格式：YYYY-MM-DD)
     */
    private Date dueDate;


    /**
     * 创建时间(10点02分01秒：100201)
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



    private List<ProductionOrderItem> productionOrderItems;


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
     * 获取产品编号
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置产品编号
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
     /**
     * 获取生产订单状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置生产订单状态
     */
    public void setStatus(String status) {
        this.status = status;
    }
     /**
     * 获取生产订单类型(常规/返工)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置生产订单类型(常规/返工)
     */
    public void setType(String type) {
        this.type = type;
    }
     /**
     * 获取计划数量-抬头
     */
    public BigDecimal getPlannedQty() {
        return plannedQty;
    }

    /**
     * 设置计划数量-抬头
     */
    public void setPlannedQty(BigDecimal plannedQty) {
        this.plannedQty = plannedQty;
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
     * 获取审批日期(格式：YYYY-MM-DD)
     */
    public Date getRlsDate() {
        return rlsDate;
    }

    /**
     * 设置审批日期(格式：YYYY-MM-DD)
     */
    public void setRlsDate(Date rlsDate) {
        this.rlsDate = rlsDate;
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
     /**
     * 获取项目代码
     */
    public String getProject() {
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
    public String getOcrCode() {
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
    public String getOcrCode2() {
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
    public String getOcrCode3() {
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
    public String getOcrCode4() {
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
    public String getOcrCode5() {
        return ocrCode5;
    }

    /**
     * 设置分配规则5
     */
    public void setOcrCode5(String ocrCode5) {
        this.ocrCode5 = ocrCode5;
    }
     /**
     * 获取生产订单原始编号
     */
    public Integer getOriginNum() {
        return originNum;
    }

    /**
     * 设置生产订单原始编号
     */
    public void setOriginNum(Integer originNum) {
        this.originNum = originNum;
    }
     /**
     * 获取客户代码
     */
    public String getCardcode() {
        return cardcode;
    }

    /**
     * 设置客户代码
     */
    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }
     /**
     * 获取用户签名
     */
    public String getUserSign() {
        return userSign;
    }

    /**
     * 设置用户签名
     */
    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }
     /**
     * 获取开始日期(格式：YYYY-MM-DD)
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始日期(格式：YYYY-MM-DD)
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
     /**
     * 获取到期日(格式：YYYY-MM-DD)
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * 设置到期日(格式：YYYY-MM-DD)
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
     /**
     * 获取创建时间(10点02分01秒：100201)
     */
    public Integer getDocTime() {
        return docTime;
    }

    /**
     * 设置创建时间(10点02分01秒：100201)
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
    public String getUdf5() {
        return udf5;
    }

    /**
     * 设置预留字段5
     */
    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    public List<ProductionOrderItem> getproductionOrderItems() {
        if(productionOrderItems == null){
            productionOrderItems = new ArrayList<>();
        }
        return productionOrderItems;
    }

    public void setProductionOrderItems(List<ProductionOrderItem> productionOrderItems) {
        this.productionOrderItems = productionOrderItems;
    }


    @Override
    public String toString() {
        return "[{" +
                "\"DocEntry\":" + "\""+docEntry +
                "\",\"ItemCode\":" + "\""+ itemCode  +
                "\",\"Status\":" + "\""+ status  +
                "\",\"Type\":" + "\""+ type +
                "\",\"PlannedQty\":" + "\""+ plannedQty +
                "\",\"Comments\":" + "\""+ DataHandle.getValue(comments) +
                "\",\"RlsDate\":" + "\""+ DataHandle.getDateValue(rlsDate)+
                "\",\"Warehouse\":" + "\""+ warehouse +
                "\",\"Project\":" + "\""+ DataHandle.getValue(project) +
                "\",\"OcrCode\":" + "\""+ DataHandle.getValue(ocrCode)  +
                "\",\"OcrCode2\":" + "\""+ DataHandle.getValue(ocrCode2)  +
                "\",\"OcrCode3\":" + "\""+ DataHandle.getValue(ocrCode3)  +
                "\",\"OcrCode4\":" + "\""+ DataHandle.getValue(ocrCode4)  +
                "\",\"OcrCode5\":" + "\"" + DataHandle.getValue(ocrCode5)  +
                "\",\"OriginNum\":" + "\""+ DataHandle.getDefaultValue(originNum)  +
                "\",\"Cardcode\":" + "\""+ DataHandle.getValue(cardcode) +
                "\",\"UserSign\":" +"\""+ userSign +
                "\",\"StartDate\":" + "\""+ DataHandle.getDateValue(startDate) +
                "\",\"DueDate\":" + "\""+ DataHandle.getDateValue(dueDate) +
                "\",\"DocTime\":" +"\""+ docTime +
                "\",\"Udf1\":" + "\""+ udf1 +
                "\",\"Udf2\":" + "\""+ udf2 +
                "\",\"Udf3\":" + "\""+ udf3 +
                "\",\"Udf4\":" + "\""+ udf4 +
                "\",\"Udf5\":" + "\""+ udf5 +
                "\"}]";
    }
}
