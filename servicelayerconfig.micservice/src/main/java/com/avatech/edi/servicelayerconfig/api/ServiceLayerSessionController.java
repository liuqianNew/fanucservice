/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-04-18
 */
package com.avatech.edi.servicelayerconfig.api;

import com.avatech.edi.servicelayerconfig.common.DateUtil;
import com.avatech.edi.servicelayerconfig.model.dto.Result;
import com.avatech.edi.servicelayerconfig.service.ServiceLayerSessionService;
import com.avatech.edi.servicelayerconfig.repository.ServiceLayerSessionRepository;
import com.avatech.edi.servicelayerconfig.model.bo.servicelayersession.ServiceLayerSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("v1/*")
public class ServiceLayerSessionController {

    private final Logger logger = LoggerFactory.getLogger(ServiceLayerSessionController.class);

    @Autowired
    private ServiceLayerSessionService serviceLayerSessionService;

    @Autowired
    private ServiceLayerSessionRepository serviceLayerSessionRepository;


    @GetMapping("servicelayersession")
    public Result getServiceLayerSession(@RequestParam("comanydb") String companyDB,@RequestParam("companyuser") String userName){
         if(StringUtils.isEmpty(companyDB) || StringUtils.isEmpty(userName)){
            return new Result().error("无效的数据库名称或用户名");
        }
        try{
//            List<ServiceLayerSession> serviceLayerSessions = serviceLayerSessionRepository.fetchServiceLayerSessions(companyDB,userName);
//            if(serviceLayerSessions == null || serviceLayerSessions.size() == 0 ||
//                    (serviceLayerSessions.get(0).getSessionTimeOut() != 0 &&
//                            DateUtil.getLongTime() >= serviceLayerSessions.get(0).getSessionTimeOut())){
//               String session =  serviceLayerSessionService.ServiceLayerLogin(companyDB,userName);
//               return new Result().ok(session);
//            }
//            return new Result().ok(serviceLayerSessions.get(0).getSessionId());
            String session =  serviceLayerSessionService.ServiceLayerLogin(companyDB,userName);
            return new Result().ok(session);
        }catch (Exception e){
            logger.error("获取公司sessionid异常",e);
            return new Result().error("内部异常");
        }
    }

}