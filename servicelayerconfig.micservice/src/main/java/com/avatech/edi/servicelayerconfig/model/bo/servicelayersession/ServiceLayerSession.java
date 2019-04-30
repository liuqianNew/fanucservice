/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-18
 */
package com.avatech.edi.servicelayerconfig.model.bo.servicelayersession;
public class ServiceLayerSession{


    /**
     * 数据库名称
     */
    private String companyDB;


    /**
     * B1用户名
     */
    private String userName;


    /**
     * sessionID
     */
    private String sessionId;


    /**
     * 是否停用
     */
    private String isDelete;


    /**
     * session失效时间
     */
    private Long sessionTimeOut;



     /**
     * 获取数据库名称
     */
    public String getCompanyDB() {
        return companyDB;
    }

    /**
     * 设置数据库名称
     */
    public void setCompanyDB(String companyDB) {
        this.companyDB = companyDB;
    }
     /**
     * 获取B1用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置B1用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
     /**
     * 获取sessionID
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 设置sessionID
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
     /**
     * 获取是否停用
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否停用
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
     /**
     * 获取session失效时间
     */
    public Long getSessionTimeOut() {
        return sessionTimeOut;
    }

    /**
     * 设置session失效时间
     */
    public void setSessionTimeOut(Long sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }
}
