package com.avatech.edi.salesorders.model.bo.salesorder;


import com.avatech.edi.salesorders.utils.DateUtils;

public class SyncResult {

    private Long docEntry;

    private String sapDocEntry;

    private String isSync;

    private String syncDate;

    private String deleted;

    public  SyncResult(Long docEntry, String sapDocEntry, String isSync,  String syncDate) {
        this.docEntry = docEntry;
        this.sapDocEntry = sapDocEntry;
        this.isSync = isSync;
        this.syncDate = syncDate;
    }

    public static SyncResult ok(Long docEntry, String sapDocEntry){
        return new SyncResult(docEntry,sapDocEntry,"Y", DateUtils.newDate());
    }

    public static SyncResult error(Long docEntry){
        return new SyncResult(docEntry,"","E",DateUtils.newDate());
    }

    public  SyncResult(Long docEntry,  String deleted) {
        this.docEntry = docEntry;
        this.deleted = deleted;
    }
    public static SyncResult cancle(Long docEntry){
        return new SyncResult(docEntry,"SUCCESS");
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public String getSapDocEntry() {
        return sapDocEntry;
    }

    public void setSapDocEntry(String sapDocEntry) {
        this.sapDocEntry = sapDocEntry;
    }

    public String getIsSync() {
        return isSync;
    }

    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
