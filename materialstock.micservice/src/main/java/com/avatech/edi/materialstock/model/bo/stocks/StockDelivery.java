package com.avatech.edi.materialstock.model.bo.stocks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockDelivery {

    private Date DocDate;

    private Date DocDueDate;

    public Date getDocDate() {
        return DocDate;
    }

    private List<StockDeliveryItem> stockDeliveryItem;

    public void setDocDate(Date docDate) {
        DocDate = docDate;
    }

    public Date getDocDueDate() {
        return DocDueDate;
    }

    public void setDocDueDate(Date docDueDate) {
        DocDueDate = docDueDate;
    }

    public List<StockDeliveryItem> getStockDeliveryItem() {
        if(stockDeliveryItem==null){
            stockDeliveryItem = new ArrayList<>();
        }
        return stockDeliveryItem;
    }

    public void setStockDeliveryItem(List<StockDeliveryItem> stockDeliveryItem) {
        this.stockDeliveryItem = stockDeliveryItem;
    }

    @Override
    public String toString() {
        return "StockDelivery{" +
                "DocDate=" + DocDate +
                ", DocDueDate=" + DocDueDate +
                ", stockDeliveryItem=" + stockDeliveryItem +
                '}';
    }
}
