/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.materialstock.model.bo.materialstock;
import com.avatech.edi.materialstock.model.dto.Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class MaterialStock{

    private Long eDIDocEntry;

    private String isSync;

    private String syncMessage;

    private Date syncDate;

    private Integer errorTime;

    private List<MaterialStockItem> materialStockItems;

    public Long geteDIDocEntry() {
        return eDIDocEntry;
    }

    public void seteDIDocEntry(Long eDIDocEntry) {
        this.eDIDocEntry = eDIDocEntry;
    }

    public String getIsSync() {
        return isSync;
    }

    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }

    public Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public Integer getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Integer errorTime) {
        this.errorTime = errorTime;
    }

    public List<MaterialStockItem> getMaterialStockItems() {
        return materialStockItems;
    }

    public void setMaterialStockItems(List<MaterialStockItem> materialStockItems) {
        this.materialStockItems = materialStockItems;
    }

    @Override
    public String toString() {
        return "MaterialStock{" +
                "eDIDocEntry=" + eDIDocEntry +
                ", isSync='" + isSync + '\'' +
                ", syncMessage='" + syncMessage + '\'' +
                ", syncDate=" + syncDate +
                ", errorTime=" + errorTime +
                ", materialStockItems=" + materialStockItems +
                '}';
    }
}
