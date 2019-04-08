package com.avatech.edi.draftorder.model.vo;

public class SyncResult {

    public SyncResult(String uniqueKey){
        this.syncUniqueKey = uniqueKey;
    }

    public SyncResult ok(){
        this.setSyncResult("Y");
        this.setSyncMessage("同步MES成功");
        return this;
    }

    public SyncResult error(String message){
        this.setSyncMessage(message);
        this.setSyncResult("E");
        return this;
    }

    /**
     * Y:同步成功；N：同步失败
     */
    private String syncResult;

    private String syncMessage;

    private String syncUniqueKey;

    private String callbackUniqueKey;

    public String getSyncResult() {
        return syncResult;
    }

    public void setSyncResult(String syncResult) {
        this.syncResult = syncResult;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }

    public String getSyncUniqueKey() {
        return syncUniqueKey;
    }

    public void setSyncUniqueKey(String syncUniqueKey) {
        this.syncUniqueKey = syncUniqueKey;
    }

    public String getCallbackUniqueKey() {
        return callbackUniqueKey;
    }

    public void setCallbackUniqueKey(String callbackUniqueKey) {
        this.callbackUniqueKey = callbackUniqueKey;
    }

    @Override
    public String toString() {
        return "{" +
                "\"syncResult\":\"" + syncResult +
                "\",\"syncMessage\":\"" + syncMessage +
                "\",\"syncUniqueKey\":\"" + syncUniqueKey +
                "\",\"callbackUniqueKey\":\"" + callbackUniqueKey +
                "\"}";
    }
}
