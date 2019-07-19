package com.avatech.edi.receiptorder.model.bo.receiptorder;

import java.math.BigDecimal;

public class ProductionItemOrder {

    private Integer docEntry;

    private String itemNo;

    private Integer lineNum;

    private BigDecimal baseQuantity;

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public BigDecimal getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(BigDecimal baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return "ProductionItemOrder{" +
                "docEntry=" + docEntry +
                ", itemNo='" + itemNo + '\'' +
                ", lineNum=" + lineNum +
                ", baseQuantity=" + baseQuantity +
                '}';
    }
}
