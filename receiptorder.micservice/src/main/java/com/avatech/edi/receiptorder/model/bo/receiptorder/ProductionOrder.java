package com.avatech.edi.receiptorder.model.bo.receiptorder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductionOrder {

    public ProductionOrder(){
        super();
        this.productionItemOrders = new ArrayList<>();
    }

    private BigDecimal planQuantity;

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

    public BigDecimal getPlanQuantity() {
        return planQuantity;
    }

    public void setPlanQuantity(BigDecimal planQuantity) {
        this.planQuantity = planQuantity;
    }

    @Override
    public String toString() {
        return "ProductionOrder{" +
                "planQuantity=" + planQuantity +
                ", docEntry=" + docEntry +
                ", productionItemOrders=" + productionItemOrders +
                '}';
    }
}
