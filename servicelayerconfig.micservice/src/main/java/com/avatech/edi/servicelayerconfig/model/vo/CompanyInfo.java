package com.avatech.edi.servicelayerconfig.model.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyInfo {

    @JsonProperty("CompanyDB")
    private String companyDB;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("Password")
    private String password;

    public String getCompanyDB() {
        return companyDB;
    }

    public void setCompanyDB(String companyDB) {
        this.companyDB = companyDB;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
