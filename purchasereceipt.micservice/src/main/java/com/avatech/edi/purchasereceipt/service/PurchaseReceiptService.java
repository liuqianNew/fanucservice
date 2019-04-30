package com.avatech.edi.purchasereceipt.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import com.avatech.edi.purchasereceipt.repository.PurchaseReceiptRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class PurchaseReceiptService{

    private final Logger logger = LoggerFactory.getLogger(PurchaseReceiptService.class);

    @Autowired
    private PurchaseReceiptRepository purchaseReceiptRepository;

    @Transactional
    public void savePurchaseReceipt(PurchaseReceipt order){
        purchaseReceiptRepository.savePurchaseReceipt(order);
    }

    @Autowired
    private RestTemplate restTemplate;
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public void createPurchaseReceipt(HttpHeaders headers,String postUrl,PurchaseReceipt purchaseReceipt){
        logger.info("同步采购收货信息:%s", purchaseReceipt.toString());
        if(purchaseReceipt==null||purchaseReceipt.equals("")){
            return;
        }
        try {
            //3、添加采购收货表
            JSONArray DocumentLines = new JSONArray();
            JSONObject requestJson = new JSONObject();
            JSONArray BatchNumbers = new JSONArray();
            JSONObject objLine = null;
            JSONObject BatchNumber ;
            requestJson.put("CardCode",purchaseReceipt.getCardCode());//供应商编号
            requestJson.put("DocDate",purchaseReceipt.getDocDate());//过账日期(YYYY-MM-DD)
            requestJson.put("Comments",purchaseReceipt.getComments());//备份
            requestJson.put("DocTime",purchaseReceipt.getDocTime());//创建时间（HHmmss）
            //明细
            for(PurchaseReceiptItem item:purchaseReceipt.getpurchaseReceiptItems()){
                objLine = new JSONObject();
                objLine.put("ItemCode",item.getItemCode());//物料编号
                objLine.put("Quantity",item.getQuantity());//数量
                objLine.put("WhsCode",item.getWhsCode());//仓库
                objLine.put("BaseEntry",item.getDocEntry());//采购订单号
                objLine.put("BaseLine",item.getBaseLine());//采购订单行号
                objLine.put("unitMsr",item.getUnitMsr());//计量单位
                 //批次
                for(PurchaseReceiptBatchItem purItem:item.getpurchaseReceiptBatchItems()){
                    BatchNumber = new JSONObject();
                    BatchNumber.put("BatchNumber",purItem.getBatchNum());
                    BatchNumber.put("Quantity",purItem.getQuantity());
                    BatchNumbers.add(BatchNumber);
                }
                objLine.put("BatchLines",BatchNumbers);//采购订单行号
            }
            DocumentLines.add(objLine);
            requestJson.put("DocumentLines",DocumentLines);
            String order= requestJson.toString();
            HttpEntity<String> orderEntry = new HttpEntity<String>(order, headers);
            ResponseEntity<String> response = restTemplate.exchange(postUrl,
            HttpMethod.POST, orderEntry, String.class);
            // 4.update status of mid database order
            if (response.getStatusCode().equals(HttpStatus.OK) ||
                    response.getStatusCode().equals(HttpStatus.CREATED)) {
                logger.info("采购收货单据同步成功");
                purchaseReceipt.setIsSync("Y");
                purchaseReceipt.setSyncDate(new Date());
                purchaseReceipt.setSyncMessage("Sync successful");
            } else {
                logger.info("单据同步失败");
                purchaseReceipt.setIsSync("E");
                purchaseReceipt.setErrorTime(purchaseReceipt.getErrorTime() + 1);
            }
        } catch (RestClientException e) {
            logger.info("单据同步失败",e);
        }
        //purchaseReceiptRepository.updatePurchaseReceipt(purchaseReceipt);
    }
    public void deleteDraft(HttpHeaders headers,String postUrl,Integer docEntry){

    }
}
