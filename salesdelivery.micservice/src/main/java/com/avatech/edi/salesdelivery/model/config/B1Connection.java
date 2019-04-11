package com.avatech.edi.salesdelivery.model.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class B1Connection {
    @JsonProperty(value = "server")
    private String server;
    @JsonProperty(value = "companyDB")
    private String companyDB;
    @JsonProperty(value = "userName")
    private String userName;
    @JsonProperty(value = "password")
    private String password;
    @JsonProperty(value = "laguage")
    private Integer laguage;
    @JsonProperty(value = "licenseServer")
    private String licenseServer;
    @JsonProperty(value = "sldServer")
    private String sldServer;
    @JsonProperty(value = "dbServiceType")
    private Integer dbServiceType;
    @JsonProperty(value = "dbUsername")
    private String dbUsername;
    @JsonProperty(value = "dbPassword")
    private String dbPassword;
    @JsonProperty(value = "useTrusted")
    private Boolean useTrusted;
    @JsonProperty(value = "companyName")
    private String companyName;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public final String getServer() {
        return server;
    }

    public final void setServer(String value){
        this.server = value;
    }

    public final String getCompanyDB() {
        return companyDB;
    }

    public final void setCompanyDB(String value){
        this.companyDB = value;
    }

    public final String getUserName() {
        return userName;
    }

    public final void setUserName(String value){
        this.userName = value;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(String value){
        this.password = value;
    }

    public final Integer getLanguage() {
        return laguage;
    }

    public final void setLanguage(Integer value){
        this.laguage = value;
    }

    public final String getLicenseServer() {
        return licenseServer;
    }

    public final void setLicenseServer(String value){
        this.licenseServer = value;
    }

    public final String getSLDServer() {
        return sldServer;
    }

    public final void setSLDServer(String value){
        this.sldServer = value;
    }

    public final Integer getDBServerType() {
        return dbServiceType;
    }

    public final void setDBServerType(Integer value){
        this.dbServiceType = value;
    }

    public final String getDBUserName() {
        return dbUsername;
    }

    public final void setDBUserName(String value){
        this.dbUsername = value;
    }

    public final String getDBPassword() {
        return dbPassword;
    }

    public final void setDBPassword(String value){
        this.dbPassword = value;
    }

    public final Boolean getIsUserTrusted() {
        return useTrusted;
    }

    public final void setIsUserTrusted(Boolean value){
        this.useTrusted = value;
    }

    public void setIsUserTrusted(String value) {
        this.setIsUserTrusted(Boolean.valueOf(value));
    }

    @Override
    public String toString() {
        return "B1Connection{" +
                "server='" + server + '\'' +
                ", companyDB='" + companyDB + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", laguage=" + laguage +
                ", licenseServer='" + licenseServer + '\'' +
                ", sldServer='" + sldServer + '\'' +
                ", dbServiceType=" + dbServiceType +
                ", dbUsername='" + dbUsername + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                ", useTrusted=" + useTrusted +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
