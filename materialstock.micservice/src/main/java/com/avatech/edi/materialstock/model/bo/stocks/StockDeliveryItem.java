package com.avatech.edi.materialstock.model.bo.stocks;

import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryBatchItem;

import java.math.BigDecimal;
import java.util.List;

public class StockDeliveryItem {

    private String itemCode;

    private BigDecimal quantity;

    private String whsCode;

    private List<StockDeliveryBatchItem> stockDeliveryBatchItem;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getWhsCode() {
        return whsCode;
    }

    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public List<StockDeliveryBatchItem> getStockDeliveryBatchItem() {
        return stockDeliveryBatchItem;
    }

    public void setStockDeliveryBatchItem(List<StockDeliveryBatchItem> stockDeliveryBatchItem) {
        this.stockDeliveryBatchItem = stockDeliveryBatchItem;
    }

    @Override
    public String toString() {
        return "StockDeliveryItem{" +
                "itemCode='" + itemCode + '\'' +
                ", quantity=" + quantity +
                ", whsCode='" + whsCode + '\'' +
                ", stockDeliveryBatchItem=" + stockDeliveryBatchItem +
                '}';
    }
}
