package com.avatech.edi.receiptorder.model.bo.receiptorder;

import java.util.ArrayList;
import java.util.List;

public class ProductionOrder {

    public ProductionOrder(){
        super();
        this.productionItemOrders = new ArrayList<>();
    }

    private Integer docEntry;

    private List<ProductionItemOrder> productionItemOrders;

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public List<ProductionItemOrder> getProductionItemOrders() {
        if(productionItemOrders==null){
            productionItemOrders = new ArrayList<>();
        }
        return productionItemOrders;
    }

    public void setProductionItemOrders(List<ProductionItemOrder> productionItemOrders) {
        this.productionItemOrders = productionItemOrders;
    }

    @Override
    public String toString() {
        return "ProductionOrder{" +
                "docEntry=" + docEntry +
                ", productionItemOrders=" + productionItemOrders +
                '}';
    }
}
