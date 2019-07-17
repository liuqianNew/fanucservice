package com.avatech.edi.salesorders.model.bo.salesorder;


import com.avatech.edi.salesorders.utils.DateUtils;

public class SyncResult {

    private Long docEntry;

    private String sapDocEntry;

    private String isSync;

    //private String errorMsg;

    private String syncDate;

    //private Integer syncTime;

   // private Integer errorTimes;

    public  SyncResult(Long docEntry, String sapDocEntry, String isSync,  String syncDate) {
        this.docEntry = docEntry;
        this.sapDocEntry = sapDocEntry;
        this.isSync = isSync;
      //  this.errorMsg = errorMsg;
        this.syncDate = syncDate;
       // this.syncTime = syncTime;
      //  this.errorTimes = errorTimes;
    }

    public static SyncResult ok(Long docEntry, String sapDocEntry){
        return new SyncResult(docEntry,sapDocEntry,"Y", DateUtils.newDate());
    }

    public static SyncResult error(Long docEntry){
        return new SyncResult(docEntry,"","E",DateUtils.newDate());
    }

//    public static SyncResult error(String errorMsg,Long docEntry,Integer errorTimes){
//        return new SyncResult(docEntry,"","N",errorMsg,DateUtils.newDate(),DateUtils.newTime(),errorTimes+1);
//    }

//    public SyncResult(Long docEntry,String sapDocEntry,String isSync,String errorMsg,String syncDate,Integer syncTime){
//        this.docEntry = docEntry;
//        this.sapDocEntry = sapDocEntry;
//        this.isSync = isSync;
//        this.errorMsg = errorMsg;
//        this.syncDate = syncDate;
//        this.syncTime = syncTime;
//    }



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

//    public String getErrorMsg() {
//        return errorMsg;
//    }
//
//    public void setErrorMsg(String errorMsg) {
//        this.errorMsg = errorMsg;
//    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

//    public Integer getSyncTime() {
//        return syncTime;
//    }
//
//    public void setSyncTime(Integer syncTime) {
//        this.syncTime = syncTime;
//    }
}
