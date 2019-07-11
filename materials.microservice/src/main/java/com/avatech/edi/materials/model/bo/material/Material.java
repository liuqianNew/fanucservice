/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.materials.model.bo.material;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Material {


    /**
     * 物料编号
     */
    @JsonProperty("itemcode")
    private String itemCode;


    /**
     * 物料描述
     */
    @JsonProperty("itemname")
    private String itemName;


    /**
     * 外文描述
     */
    @JsonIgnore
    private String frgnName;


    /**
     * 物料规格说明
     */
    @JsonIgnore
    private String spec;


    /**
     * 物料组（中文描述）
     */
<<<<<<< HEAD
    @JsonProperty("groupnam")
    private String itmsGrpNam;
=======
@JsonIgnore
    private String itmsGrpName;
>>>>>>> ce203390017a27df23cee7f142e8b1cf562dc463


    /**
     * 物料组
     */
    @JsonProperty("groupcode")
    private String itmsGrpCod;


    /**
     * 采购物料
     */
    @JsonIgnore
    private String prchseItem;


    /**
     * 销售物料
     */
    @JsonIgnore
    private String sellItem;


    /**
     * 库存物料
     */
    @JsonIgnore
    private String invntItem;


    /**
     * 默认仓库
     */
    @JsonIgnore
    private String dfltWH;


    /**
     * 首选供应商
     */
    @JsonIgnore
    private String cardCode;


    /**
     * 采购计量单位
     */
@JsonIgnore
    private String buyUnitMsr;


    /**
     * 销售计量单位
     */
    @JsonProperty("packunit")
    private String salUnitMsr;


    /**
     * 序列号管理[是:Y/否:N]
     */
    @JsonIgnore
    private String manSerNum;


    /**
     * 管理批号 [是:Y/否:N]
     */
    @JsonIgnore
    private String manBtchNum;


    /**
     * 活跃
     */
    @JsonIgnore
    private String validFor;


    /**
     * 库存计量单位条目
     */

    @JsonIgnore
    private String inuoMEntry;


    /**
     * 补给方式
     */
    @JsonIgnore
    private String prcrmntMtd;


    /**
     * 预留字段1
     */
    @JsonIgnore
    private String udf1;


    /**
     * 预留字段2
     */
    @JsonIgnore
    private String udf2;


    /**
     * 预留字段3
     */
    @JsonIgnore
    private String udf3;


    /**
     * 预留字段4
     */
    @JsonIgnore
    private String udf4;


    /**
     * 预留字段5
     */
    @JsonIgnore
    private String udf5;



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
     * 获取外文描述
     */
    public String getFrgnName() {
        return frgnName;
    }

    /**
     * 设置外文描述
     */
    public void setFrgnName(String frgnName) {
        this.frgnName = frgnName;
    }
     /**
     * 获取物料规格说明
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置物料规格说明
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }
     /**
     * 获取物料组（中文描述）
     */
    public String getItmsGrpNam() {
        return itmsGrpNam;
    }

    /**
     * 设置物料组（中文描述）
     */
    public void setItmsGrpNam(String itmsGrpNam) {
        this.itmsGrpNam = itmsGrpNam;
    }
     /**
     * 获取物料组
     */
    public String getItmsGrpCod() {
        return itmsGrpCod;
    }

    /**
     * 设置物料组
     */
    public void setItmsGrpCod(String itmsGrpCod) {
        this.itmsGrpCod = itmsGrpCod;
    }
     /**
     * 获取采购物料
     */
    public String getPrchseItem() {
        return prchseItem;
    }

    /**
     * 设置采购物料
     */
    public void setPrchseItem(String prchseItem) {
        this.prchseItem = prchseItem;
    }
     /**
     * 获取销售物料
     */
    public String getSellItem() {
        return sellItem;
    }

    /**
     * 设置销售物料
     */
    public void setSellItem(String sellItem) {
        this.sellItem = sellItem;
    }
     /**
     * 获取库存物料
     */
    public String getInvntItem() {
        return invntItem;
    }

    /**
     * 设置库存物料
     */
    public void setInvntItem(String invntItem) {
        this.invntItem = invntItem;
    }
     /**
     * 获取默认仓库
     */
    public String getDfltWH() {
        return dfltWH;
    }

    /**
     * 设置默认仓库
     */
    public void setDfltWH(String dfltWH) {
        this.dfltWH = dfltWH;
    }
     /**
     * 获取首选供应商
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置首选供应商
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
     /**
     * 获取采购计量单位
     */
    public String getBuyUnitMsr() {
        return buyUnitMsr;
    }

    /**
     * 设置采购计量单位
     */
    public void setBuyUnitMsr(String buyUnitMsr) {
        this.buyUnitMsr = buyUnitMsr;
    }
     /**
     * 获取销售计量单位
     */
    public String getSalUnitMsr() {
        return salUnitMsr;
    }

    /**
     * 设置销售计量单位
     */
    public void setSalUnitMsr(String salUnitMsr) {
        this.salUnitMsr = salUnitMsr;
    }
     /**
     * 获取序列号管理[是:Y/否:N]
     */
    public String getManSerNum() {
        return manSerNum;
    }

    /**
     * 设置序列号管理[是:Y/否:N]
     */
    public void setManSerNum(String manSerNum) {
        this.manSerNum = manSerNum;
    }
     /**
     * 获取管理批号 [是:Y/否:N]
     */
    public String getManBtchNum() {
        return manBtchNum;
    }

    /**
     * 设置管理批号 [是:Y/否:N]
     */
    public void setManBtchNum(String manBtchNum) {
        this.manBtchNum = manBtchNum;
    }
     /**
     * 获取活跃
     */
    public String getValidFor() {
        return validFor;
    }

    /**
     * 设置活跃
     */
    public void setValidFor(String validFor) {
        this.validFor = validFor;
    }
     /**
     * 获取库存计量单位条目
     */
    public String getinuoMEntry() {
        return inuoMEntry;
    }

    /**
     * 设置库存计量单位条目
     */
    public void setinuoMEntry(String iNUoMEntry) {
        this.inuoMEntry = inuoMEntry;
    }
     /**
     * 获取补给方式
     */
    public String getPrcrmntMtd() {
        return prcrmntMtd;
    }

    /**
     * 设置补给方式
     */
    public void setPrcrmntMtd(String prcrmntMtd) {
        this.prcrmntMtd = prcrmntMtd;
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
}
