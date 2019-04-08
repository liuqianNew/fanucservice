/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.model.bo.issueorder;
import com.avatech.edi.issueorder.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class IssueOrderItem{

    /**
     * 单据编号
     */
    private Long eDIDocEntry;


    /**
     * 行号
     */
    private Integer eDILineId;


    /**
     * 单据编号
     */
    @JsonProperty("DocEntry")
    private Integer docEntry;


    /**
     * 行号
     */
    @JsonProperty("LineId")
    private Integer lineId;


    /**
     * 物料编号
     */
    @JsonProperty("ItemCode")
    private String itemCode;


    /**
     * 物料描述
     */
    @JsonProperty("ItemName")
    private String itemName;


    /**
     * 数量
     */
    @JsonProperty("Quantity")
    private BigDecimal quantity;


    /**
     * 仓库
     */
    @JsonProperty("WhsCode")
    private String whsCode;


    /**
     * 基本单据内部标识
     */
    @JsonProperty("BaseEntry")
    private Integer baseEntry;


    /**
     * 基本行
     */
    @JsonProperty("BaseLine")
    private Integer baseLine;


    /**
     * 计量单位
     */
    @JsonProperty("UnitMsr")
    private String unitMsr;


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


    @JsonProperty("Batchs")
    private List<IssueOrderBatchItem> issueOrderBatchItems;

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
     * 获取仓库
     */
    public String getWhsCode() {
        return whsCode;
    }

    /**
     * 设置仓库
     */
    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
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
     * 获取计量单位
     */
    public String getUnitMsr() {
        return unitMsr;
    }

    /**
     * 设置计量单位
     */
    public void setUnitMsr(String unitMsr) {
        this.unitMsr = unitMsr;
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

    public List<IssueOrderBatchItem> getIssueOrderBatchItems() {
        if(issueOrderBatchItems == null){
            issueOrderBatchItems = new ArrayList<>();
        }
        return issueOrderBatchItems;
    }

    public void setIssueOrderBatchItems(List<IssueOrderBatchItem> issueOrderBatchItems) {
        this.issueOrderBatchItems = issueOrderBatchItems;
    }

    public Result checkData() throws Exception {
        Result result = new Result();
        if(StringUtils.isEmpty(itemCode)){
            return result.error(docEntry.toString(),"itemCode为空");
        }
        if(StringUtils.isEmpty(whsCode)){
            return result.error(docEntry.toString(),"whsCode为空");
        }
        return result.ok(docEntry.toString());
    }

    @Override
    public String toString() {
        return "{" +
                //"docEntry\":\"" + docEntry +
                //"\",\"lineId\":\"" + lineId +
                "\",\"itemCode\":\"" + itemCode +
                "\",\"itemName\":\"" + itemName +
                "\",\"quantity\":\"" + quantity +
                "\",\"whsCode\":\"" + whsCode +
                "\",\"baseEntry\":\"" + baseEntry +
                "\",\"baseLine\":\"" + baseLine +
                "\",\"unitMsr\":\"" + unitMsr +
                "\",\"udf1\":\"" + udf1 +
                "\",\"udf2\":\"" + udf2 +
                "\",\"udf3\":\"" + udf3 +
                "\",\"udf4\":\"" + udf4 +
                "\",\"udf5\":\"" + udf5 +
                "\",\"issueOrderBatchItems\":[" + issueOrderBatchItems +
                "]}";
    }


}
