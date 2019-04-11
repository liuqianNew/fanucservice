package com.avatech.edi.salesdelivery.service.config;

import com.avatech.edi.salesdelivery.common.BusinessException;
import com.avatech.edi.salesdelivery.model.config.B1Connection;
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
public class B1Manager {

    private final Logger log = LoggerFactory.getLogger(B1Manager.class);

    private static final String COMPANY_INFO_CONFIG_PATH = "C:\\ava\\config\\companyinfo.json";

    private static B1Connection b1Connection;

    private B1Connection getB1Connections() throws IOException {
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
            B1Connection companyInfo = mapper.readValue(stringBuffer.toString(),B1Connection.class);
            return companyInfo;
        } catch (IOException e) {
            log.info("读取配置文件出错", e);
            throw new BusinessException("50002", "读取配置文件出错");
        } finally {
            if (null != bufferedReader) bufferedReader.close();
            if(null != fileReader) fileReader.close();
        }
    }

    public B1Connection getB1ConnInstance(){
        try{
            if(b1Connection == null){
                b1Connection = getB1Connections();
            }
        }catch (Exception e){
            throw new BusinessException("50003","公司信息配置信息匹配异常");
        }
        if(b1Connection == null){
            throw new BusinessException("50004","未找到匹配的公司信息");
        }
        return b1Connection;
    }
}
