/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-29
 */
package com.avatech.edi.receiptorder.model.bo.receiptorder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class ReceiptOrderItem{


    /**
     * 单据内部标识（单据编号）
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
     * 数量
     */
    private BigDecimal qty;


    /**
     * 仓库
     */
    private String wareHouse;


    /**
     * 项目代码
     */
    private String project;


    /**
     * 基本单据参考
     */
    private Integer baseREF;


    /**
     * 基本单据内部标识
     */
    private Integer baseEntry;


    /**
     * 基本行
     */
    private Integer baseLine;


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
     * 订单工时(单位：H)
     */
    private BigDecimal workTime;


    /**
     * 批号
     */
    private String batchNum;


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


    private List<ReceiptOrderBatchItem> receiptOrderBatchItems;


     /**
     * 获取单据内部标识（单据编号）
     */
    public Integer getDocEntry() {
        return docEntry;
    }

    /**
     * 设置单据内部标识（单据编号）
     */
    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
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
     * 获取物料描述
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置物料描述
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
     /**
     * 获取数量
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 设置数量
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
     /**
     * 获取仓库
     */
    public String getWareHouse() {
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
     * 获取基本单据参考
     */
    public Integer getBaseREF() {
        return baseREF;
    }

    /**
     * 设置基本单据参考
     */
    public void setBaseREF(Integer baseREF) {
        this.baseREF = baseREF;
    }
     /**
     * 获取基本单据内部标识
     */
    public Integer getBaseEntry() {
        return baseEntry;
    }

    /**
     * 设置基本单据内部标识
     */
    public void setBaseEntry(Integer baseEntry) {
        this.baseEntry = baseEntry;
    }
     /**
     * 获取基本行
     */
    public Integer getBaseLine() {
        return baseLine;
    }

    /**
     * 设置基本行
     */
    public void setBaseLine(Integer baseLine) {
        this.baseLine = baseLine;
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
     * 获取订单工时(单位：H)
     */
    public BigDecimal getWorkTime() {
        return workTime;
    }

    /**
     * 设置订单工时(单位：H)
     */
    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }
     /**
     * 获取批号
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * 设置批号
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

    public List<ReceiptOrderBatchItem> getreceiptOrderBatchItems() {
        if(receiptOrderBatchItems == null){
            receiptOrderBatchItems = new ArrayList<>();
        }
        return receiptOrderBatchItems;
    }

    public void setReceiptOrderBatchItems(List<ReceiptOrderBatchItem> receiptOrderBatchItems) {
        this.receiptOrderBatchItems = receiptOrderBatchItems;
    }
}
