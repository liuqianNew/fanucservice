import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;<<<<<<< HEAD
/**
 * FileName: PurchaseReceiptJob
 * Date:     2019/4/18 16:26
 * Description: 采购收货定时任务
 */
package com.avatech.edi.purchasereceipt.job;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import com.avatech.edi.purchasereceipt.service.PurchaseReceiptService;
import com.avatech.edi.purchasereceipt.service.PurchaseServiceLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.security.util.Password;

=======
package com.avatech.edi.purchasereceipt.job;

import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import com.avatech.edi.purchasereceipt.service.PurchaseReceiptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
>>>>>>> 1b4c9b7e63c6f660d41b1f89d2e2d041c987b27f
import java.util.List;

@Component
public class PurchaseReceiptJob {
<<<<<<< HEAD

    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptJob.class);

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;
    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;
    @Autowired
    PurchaseServiceLayer purchaseServiceLayer;
    @Scheduled(cron = "0 */1 * * * ?")
    private void process(){
        //1、登录cookie
        String cookie = null;
        try{
            List<PurchaseReceipt> purchaseReceipts = purchaseReceiptRepository.fetchPurchaseReceipts();
            if(purchaseReceipts == null || purchaseReceipts.size() ==0){
                //return;
            }
            //临时调用登录接口返回cooke
            cookie = purchaseServiceLayer.login();
            //回传jsonlist
            JSONArray DocumentLines = new JSONArray();
            JSONObject requestJson = new JSONObject();
            for (PurchaseReceipt purchaseReceipt:purchaseReceipts){
                     //2、删除草稿表
                    if(purchaseReceipt.getDocEntry()==null||purchaseReceipt.getDocEntry().equals("")){
                        String s = purchaseServiceLayer.DraftsDelete(purchaseReceipt.getDocEntry(), cookie);
                    }
                    //3、添加采购收货表
                JSONObject obj = new JSONObject();
                obj.put("DocDate",purchaseReceipt.getDocDate());//过账日期(YYYY-MM-DD)
                obj.put("Comments",purchaseReceipt.getComments());//备份
                obj.put("DocTime",purchaseReceipt.getDocTime());//创建时间（HHmmss）
                obj.put("ItemCode",null);//物料编号
                obj.put("Quantity",0);//数量
                obj.put("WhsCode",0);//仓库
                obj.put("BaseEntry",purchaseReceipt.getDocEntry());//采购订单号
                obj.put("BaseLine",null);//采购订单行号
                obj.put("unitMsr",null);//计量单位
                obj.put("BaseLine",null);//采购订单行号
                JSONArray BatchNumbers = new JSONArray();
                JSONObject BatchNumber = new JSONObject();
                BatchNumber.put("BatchNumber","20190422");
                BatchNumber.put("Quantity","1");
                BatchNumbers.add(BatchNumber);
                obj.put("BatchNumbers",BatchNumbers);
                DocumentLines.add(obj);
            }
            requestJson.put("CardCode","S000002");//供应商编号
            requestJson.put("DocumentLines",DocumentLines);
            String s = requestJson.toString();
            purchaseServiceLayer.AddPurchaseDeliveryNotes(s,cookie);
            }catch (Exception e){
            logger.error("处理采购交货中间表异常",e);
        }
    }
=======
    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptJob.class);

    private static final String PURCHASE_NOTES_URL  = "/";

    private static final String DRAFT = "/";

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${company.sessionurl}")
    private String sessionUrl;

    @Value("${company.companydb}")
    private String companyDB;

    @Value("${company.companyuser}")
    private String companyUser;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            // 1.get unsync order from mid database
            List<PurchaseReceipt> purchaseReceipts = purchaseReceiptRepository.fetchPurchaseReceipts();
            if (purchaseReceipts == null || purchaseReceipts.size() == 0) {
                return;
            }
            // 2.get session
            String seesionId = getSessionId();
            if (StringUtils.isEmpty(seesionId)) {
                throw new Exception("获取session为空，请检查session服务");
            }
            HttpHeaders headers = new HttpHeaders();
            MediaType type1 = MediaType.parseMediaType("application/json; charset=UTF-8");
            headers.setContentType(type1);
            headers.add("Cookie", seesionId);

            // 3.call service layer to create production order
            for (PurchaseReceipt order : purchaseReceipts) {
                purchaseReceiptService.deleteDraft(headers,sessionUrl+ DRAFT,0);
                purchaseReceiptService.createPurchaseReceipt(headers,sessionUrl + PURCHASE_NOTES_URL,order);
                purchaseReceiptRepository.updatePurchaseReceipt(order);
            }
        } catch (Exception e) {
            logger.error("同步采购收货发生异常", e);
        }
    }

    private String getSessionId(){
        String response = restTemplate.getForObject(sessionUrl+"?comanydb="+companyDB+"&companyuser"+companyUser, String.class);
        return response;
    }
>>>>>>> 1b4c9b7e63c6f660d41b1f89d2e2d041c987b27f
}
