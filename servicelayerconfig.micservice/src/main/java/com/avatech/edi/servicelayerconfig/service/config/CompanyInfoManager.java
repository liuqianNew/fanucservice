package com.avatech.edi.servicelayerconfig.service.config;

import com.avatech.edi.servicelayerconfig.model.vo.CompanyInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class CompanyInfoManager {
    private final Logger log = LoggerFactory.getLogger(CompanyInfoManager.class);

    private static final String COMPANY_INFO_CONFIG_PATH = "/Users/fanxing/dev/CompanyInfo.json";

    private static List<CompanyInfo> companInfos;

    private List<CompanyInfo> getCompanyInfos() throws Exception {
        File file = new File(COMPANY_INFO_CONFIG_PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file); // 建立一个输入流对象fileReader
            bufferedReader = new BufferedReader(fileReader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine().trim();
            while (line != null) {
                stringBuffer.append(line);
                line = bufferedReader.readLine(); // 一次读入一行数据
            }
            ObjectMapper mapper = new ObjectMapper();
            List<CompanyInfo> companyInfos = mapper.readValue(stringBuffer.toString(),new TypeReference<List<CompanyInfo>>(){});
            return companyInfos;
        } catch (IOException e) {
            log.info("读取配置文件出错", e);
            throw new Exception("50002,读取配置文件出错");
        } finally {
            if (null != bufferedReader) bufferedReader.close();
            if(null != fileReader) fileReader.close();
        }
    }

    public CompanyInfo getCompanInfoInstance(String companyDB,String userName) throws Exception {
        try{
            if(companInfos == null || companInfos.size() == 0){
                companInfos = getCompanyInfos();
            }
            for (CompanyInfo companyInfo:companInfos){
                if(companyInfo.getCompanyDB().equals(companyDB)
                        && companyInfo.getUserName().equals(userName)){
                    return companyInfo;
                }
            }
            throw new Exception("50004,未找到匹配的公司信息");
        }catch (Exception e){
            throw new Exception("50003,公司信息配置信息匹配异常");
        }
    }
}
