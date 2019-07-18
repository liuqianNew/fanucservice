package com.avatech.edi.materialstock.model.bo.stocks;

import java.math.BigDecimal;

public class StockDeliveryBatchItem {

    private String batchNum;

    private BigDecimal quantity;

    private BigDecimal onHand;

    private String itemCode;

    private String whsCode;

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getOnHand() {
        return onHand;
    }

    public void setOnHand(BigDecimal onHand) {
        this.onHand = onHand;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    @Override
    public String toString() {
        return "StockDeliveryBatchItem{" +
                "batchNum='" + batchNum + '\'' +
                ", quantity=" + quantity +
                ", onHand=" + onHand +
                ", itemCode='" + itemCode + '\'' +
                ", whsCode='" + whsCode + '\'' +
                '}';
    }
}
