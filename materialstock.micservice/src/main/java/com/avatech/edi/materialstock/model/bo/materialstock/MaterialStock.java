/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.model.bo.materialstock;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class MaterialStock{


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
    private BigDecimal quantity;


    /**
     * 仓库
     */
    private String whsCode;


    /**
     * 批号
     */
    private String batchNum;


    /**
     * 创建人
     */
    private String userSign;


    /**
     * 生成时间
     */
    private Integer docTime;


    /**
     * 过账日期(YY-MM-DD)
     */
    private String docDate;


    /**
     * 自定义字段
     */
    private String udf1;


    /**
     * 自定义字段
     */
    private String udf2;


    /**
     * 自定义字段
     */
    private String udf3;


    /**
     * 自定义字段
     */
    private String udf4;


    /**
     * 自定义字段
     */
    private String udf5;


    private List<MaterialStockItem> materialStockItems;


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
     * 获取过账日期(YY-MM-DD)
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * 设置过账日期(YY-MM-DD)
     */
    public void setDocDate(String docDate) {
        this.docDate = docDate;
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

    public List<MaterialStockItem> getmaterialStockItems() {
        if(materialStockItems == null){
            materialStockItems = new ArrayList<>();
        }
        return materialStockItems;
    }

    public void setMaterialStockItems(List<MaterialStockItem> materialStockItems) {
        this.materialStockItems = materialStockItems;
    }


    @Override
    public String toString() {
        return "{" +
                "\"itemCode\":\"" + itemCode +
                "\",\"itemName\":\"" + itemName +
                "\",\"quantity\":\"" + quantity +
                "\",\"whsCode\":\"" + whsCode +
                "\",\"batchNum\":\"" + batchNum +
                "\",\"userSign\":\"" + userSign +
                "\",\"docTime\":\"" + docTime +
                "\",\"docDate\":\"" + docDate +
                "\",\"udf1\":\"" + udf1 +
                "\",\"udf2\":\"" + udf2 +
                "\",\"udf3\":\"" + udf3 +
                "\",\"udf4\":\"" + udf4 +
                "\",\"udf5\":\"" + udf5 +
                "\",\"materialStockItems\":[" + materialStockItems +
                "]}";
    }
}
