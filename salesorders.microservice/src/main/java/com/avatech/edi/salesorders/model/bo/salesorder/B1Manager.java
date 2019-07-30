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

    //数据库名称
    private String comapnyDB = "SBODemoCN";

    //数据库用户名
    private String dbUserName = "wanghao";

    //数据库密码
    private String dbPassword = "123456";

    //数据库服务
    private String dbServer = "vmwarevic";

    //SAP用户名
    private String userName = "manager";

   //SAP密码
    private String password = "avatech";

   
    private String licenseServer = "vmwarevic:30000";

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
