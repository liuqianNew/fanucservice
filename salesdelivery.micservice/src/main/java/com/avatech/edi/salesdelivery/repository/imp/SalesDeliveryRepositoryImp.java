/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.repository.imp;

import com.avatech.edi.salesdelivery.common.SnowflakeIdWorker;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryBatchItem;
import com.avatech.edi.salesdelivery.mapper.SalesDeliveryMapper;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class SalesDeliveryRepositoryImp implements SalesDeliveryRepository{

    @Autowired
    private SalesDeliveryMapper salesDeliveryMapper;

    public void saveSalesDelivery(SalesDelivery salesDelivery){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long ediId;
        ediId = idWorker.nextId();
        salesDelivery.setEDIDocEntry(ediId);
        for (int index = 0;index<salesDelivery.getsalesDeliveryItems().size();index++) {
            salesDelivery.getsalesDeliveryItems().get(index).setEDIDocEntry(ediId);
            salesDelivery.getsalesDeliveryItems().get(index).setEDILineId(index);
            for (int batchIndex = 0 ;batchIndex < salesDelivery.getsalesDeliveryItems().get(index).getSalesDeliveryBatchItems().size();batchIndex++){
                salesDelivery.getsalesDeliveryItems().get(index).getSalesDeliveryBatchItems().get(batchIndex).setEDIDocEntry(ediId);
                salesDelivery.getsalesDeliveryItems().get(index).getSalesDeliveryBatchItems().get(batchIndex).setEDILineId(batchIndex);
                salesDelivery.getsalesDeliveryItems().get(index).getSalesDeliveryBatchItems().get(batchIndex).setEDIItemLineId(index);
            }
        }
        salesDeliveryMapper.insertSalesDelivery(salesDelivery);
        for (SalesDeliveryItem salesDeliveryItem:salesDelivery.getsalesDeliveryItems()) {
            salesDeliveryMapper.insertSalesDeliveryItem(salesDeliveryItem);
            for (SalesDeliveryBatchItem salesDeliveryBatchItem:salesDeliveryItem.getSalesDeliveryBatchItems()) {
                salesDeliveryMapper.insertSalesDeliveryBatchItem(salesDeliveryBatchItem);
            }
        }
    }

    public List<SalesDelivery> fetchSalesDeliverys(){
        List<SalesDelivery> salesDeliverys = new ArrayList();
        List<SalesDeliveryItem> salesDeliveryItems;
        HashMap<String,Object> paramMap;
        salesDeliverys = salesDeliveryMapper.searchSalesDeliverys();
        for (SalesDelivery salesDelivery:salesDeliverys) {
            salesDeliveryItems = salesDeliveryMapper.searchSalesDeliveryItems(salesDelivery.getEDIDocEntry());
            for (SalesDeliveryItem salesDeliveryItem:salesDeliveryItems) {
                paramMap = new HashMap<>();
                paramMap.put("EDIDocEntry",salesDeliveryItem.getEDIDocEntry());
                paramMap.put("EDIItemLineId",salesDeliveryItem.getEDILineId());
                salesDeliveryItem.getSalesDeliveryBatchItems().addAll(salesDeliveryMapper.searchSalesDeliveryBatchItems(paramMap));
            }
            salesDelivery.getsalesDeliveryItems().addAll(salesDeliveryItems);
        }
        return salesDeliverys;
    }

    @Override
    public void updateSalesDelivery(SalesDelivery salesDelivery) {
        salesDeliveryMapper.updateSalesDelivery(salesDelivery);
    }


}