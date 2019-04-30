/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-18
 */
package com.avatech.edi.servicelayerconfig.repository.imp;

import com.avatech.edi.servicelayerconfig.model.bo.servicelayersession.ServiceLayerSession;
import com.avatech.edi.servicelayerconfig.mapper.ServiceLayerSessionMapper;
import com.avatech.edi.servicelayerconfig.repository.ServiceLayerSessionRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class ServiceLayerSessionRepositoryImp implements ServiceLayerSessionRepository{
    @Autowired
    private ServiceLayerSessionMapper serviceLayerSessionMapper;


    public void saveServiceLayerSession(ServiceLayerSession serviceLayerSession){
        serviceLayerSessionMapper.insertServiceLayerSession(serviceLayerSession);

    }

    public List<ServiceLayerSession> fetchServiceLayerSessions(String companyDB,String userName){
        List<ServiceLayerSession> serviceLayerSessions = new ArrayList();
        HashMap<String,String> paramMap = new HashMap<>();
        paramMap.put("companyDB",companyDB);
        paramMap.put("userName",userName);
        serviceLayerSessions = serviceLayerSessionMapper.searchServiceLayerSessions(paramMap);
        return serviceLayerSessions;
    }
}