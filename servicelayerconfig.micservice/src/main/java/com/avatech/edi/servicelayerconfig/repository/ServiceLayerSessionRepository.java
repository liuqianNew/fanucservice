/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-18
 */
package com.avatech.edi.servicelayerconfig.repository;

import com.avatech.edi.servicelayerconfig.model.bo.servicelayersession.ServiceLayerSession;
import org.springframework.stereotype.Component;
import java.util.List;

public interface ServiceLayerSessionRepository{

    void saveServiceLayerSession(ServiceLayerSession ServiceLayerSession);

    List<ServiceLayerSession> fetchServiceLayerSessions(String companyDB,String userName);
}