package com.avatech.edi.salesorders.model.bo.salesorder;

import com.avatech.edi.common.exception.BusinessException;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.SBOCOMConstants;
import com.sap.smb.sbo.api.SBOCOMUtil;
import com.sap.smb.sbo.api.SBOErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B1Manager {
    private Logger logger = LoggerFactory.getLogger(B1Manager.class);

    //@Value("${sap.companyDB}")
    private String comapnyDB = "SBODemoCN";

    //@Value("${sap.dbUserName}")
    private String dbUserName = "wanghao";

    //@Value("${sap.dbPassword}")
    private String dbPassword = "123456";

    //@Value("${sap.dbServer}")
    private String dbServer = "192.168.88.132:1433";

    // @Value("${sap.userName}")
    private String userName = "manager";

    //@Value("${sap.password}")
    private String password = "avatech";

    //@Value("${sap.licenseServer}")
    private String licenseServer = "192.168.88.132:30000";

    private volatile static ICompany company=null;

    public final ICompany getCompany(){
        synchronized (B1Manager.class) {
            if(company == null || !company.isConnected()){
                company = connect();
            }
            return company;
        }
    }

    private ICompany connect()throws BusinessException {
        try{
            company = SBOCOMUtil.newCompany();
            company.setServer(dbServer);
            company.setCompanyDB(comapnyDB);
            company.setUserName(userName);
            company.setPassword(password);
            company.setDbServerType(SBOCOMConstants.BoDataServerTypes_dst_MSSQL2012);
            company.setUseTrusted(false);
            company.setLanguage(SBOCOMConstants.BoSuppLangs_ln_Chinese);
            company.setDbUserName(dbUserName);
            company.setDbPassword(dbPassword);
            company.setLicenseServer(licenseServer);
            int connectionResult = company.connect();
            if (connectionResult == 0) {
                logger.info("成功连接到 " + company.getCompanyName());
            } else {
                SBOErrorMessage errMsg = company.getLastError();
                throw new BusinessException("code"+errMsg.getErrorCode(),
                        "massage"+errMsg.getErrorMessage());
            }
            return company;
        }catch (Exception e){
            throw new BusinessException(
                    "50003","公司信息配置信息匹配异常");
        }
    }
}
