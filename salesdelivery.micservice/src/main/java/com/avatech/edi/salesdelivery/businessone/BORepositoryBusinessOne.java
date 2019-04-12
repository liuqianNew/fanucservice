package com.avatech.edi.salesdelivery.businessone;

import com.avatech.edi.salesdelivery.model.config.B1Connection;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.SBOCOMConstants;
import com.sap.smb.sbo.api.SBOCOMUtil;
import com.sap.smb.sbo.api.SBOErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class BORepositoryBusinessOne {
    private final Logger logger = LoggerFactory.getLogger(BORepositoryBusinessOne.class);
    private String server;
    private String companyDB;
    private String userName;
    private String password;
    private Integer laguage;
    private String licenseServer;
    private String sldServer;
    private Integer dbServerType;
    private String dbUsername;
    private String dbPassword;
    private Boolean useTrusted;

    private volatile static BORepositoryBusinessOne boRepositoryBusinessOne = null;

    private volatile static ICompany company = null;

    public final static BORepositoryBusinessOne getInstance(B1Connection ib1Connection) {
        synchronized (BORepositoryBusinessOne.class) {
            if (null == boRepositoryBusinessOne) {
                boRepositoryBusinessOne = new BORepositoryBusinessOne(ib1Connection);
            }else if( boRepositoryBusinessOne != null && !boRepositoryBusinessOne.companyDB.equals(ib1Connection.getCompanyDB())){
                boRepositoryBusinessOne.server = ib1Connection.getServer();
                boRepositoryBusinessOne.companyDB = ib1Connection.getCompanyDB();
                boRepositoryBusinessOne.userName = ib1Connection.getUserName();
                boRepositoryBusinessOne.password = ib1Connection.getPassword();
                boRepositoryBusinessOne.laguage = ib1Connection.getLanguage();
                boRepositoryBusinessOne.licenseServer = ib1Connection.getLicenseServer();
                boRepositoryBusinessOne.dbServerType = ib1Connection.getDBServerType();
                boRepositoryBusinessOne.dbUsername = ib1Connection.getDBUserName();
                boRepositoryBusinessOne.dbPassword = ib1Connection.getDBPassword();
                boRepositoryBusinessOne.useTrusted = ib1Connection.getIsUserTrusted();
                boRepositoryBusinessOne.sldServer = ib1Connection.getSLDServer();
            }
        }
        return boRepositoryBusinessOne;
    }


    private BORepositoryBusinessOne(B1Connection connection){
        this.server = connection.getServer();
        this.companyDB = connection.getCompanyDB();
        this.userName = connection.getUserName();
        this.password = connection.getPassword();
        this.laguage = connection.getLanguage();
        this.licenseServer = connection.getLicenseServer();
        this.dbServerType = connection.getDBServerType();
        this.dbUsername = connection.getDBUserName();
        this.dbPassword = connection.getDBPassword();
        this.useTrusted = connection.getIsUserTrusted();
        this.sldServer = connection.getSLDServer();
    }

    public final ICompany getCompany() throws B1Exception {
        synchronized (BORepositoryBusinessOne.class) {
            if (null == company) {
                return this.connect();
            } else {
                if(!companyDB.equals(company.getCompanyDB())){
                    company.disconnect();
                    return this.connect();
                }
                if(!company.isConnected())
                    return  this.connect();
                return company;
            }
        }
    }

    public void dispose(){
        if(company!=null ){
            if(company.isConnected()){
                company.disconnect();
                company.release();
            }
        }
    }

    private ICompany connect()throws B1Exception {
        company = SBOCOMUtil.newCompany();
        company.setServer(this.server);
        company.setCompanyDB(this.companyDB);
        company.setUserName(this.userName);
        company.setPassword(this.password);
        company.setDbServerType(9);
        company.setUseTrusted(false);
        company.setLanguage(SBOCOMConstants.BoSuppLangs_ln_Chinese);
        company.setDbUserName(this.dbUsername);
        company.setDbPassword(this.dbPassword);
        company.setLicenseServer(this.licenseServer);
        company.setSLDServer(this.sldServer);
        log.info("begin to connect " + this.companyDB);
        int connectionResult = company.connect();
        if (connectionResult == 0) {
            log.info("Successfully connected to " + company.getCompanyName());
        } else {
            SBOErrorMessage errMsg = company.getLastError();
            throw new B1Exception("Cannot connect to server: "
                    + errMsg.getErrorMessage()
                    + " "
                    + errMsg.getErrorCode());
        }
        return company;
    }
}

