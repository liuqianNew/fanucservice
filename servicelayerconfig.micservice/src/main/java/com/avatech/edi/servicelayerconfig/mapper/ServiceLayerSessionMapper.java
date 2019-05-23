/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-18
 */
package com.avatech.edi.servicelayerconfig.mapper;


import com.avatech.edi.servicelayerconfig.model.bo.servicelayersession.ServiceLayerSession;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface ServiceLayerSessionMapper{

    void insertServiceLayerSession(ServiceLayerSession ServiceLayerSession);

    List<ServiceLayerSession> searchServiceLayerSessions(HashMap map);

    void deleteServiceLayerSession(HashMap map);
}