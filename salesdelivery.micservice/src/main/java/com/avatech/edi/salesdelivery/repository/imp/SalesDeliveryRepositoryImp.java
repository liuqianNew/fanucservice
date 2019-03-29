/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.repository.imp;

import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesOrderBatchItem;
import com.avatech.edi.salesdelivery.mapper.SalesDeliveryMapper;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class SalesDeliveryRepositoryImp implements SalesDeliveryRepository{
    @Autowired
    private SalesDeliveryMapper salesDeliveryMapper;


    public void saveSalesDelivery(SalesDelivery salesDelivery){
        salesDeliveryMapper.insertSalesDelivery(salesDelivery);

    }

    public List<SalesDelivery> fetchSalesDeliverys(){
        List<SalesDelivery> salesDeliverys = new ArrayList();
        salesDeliverys = salesDeliveryMapper.searchSalesDeliverys();
        return salesDeliverys;
    }

    public void saveSalesDeliveryItem(SalesDeliveryItem salesDeliveryItem){
        salesDeliveryMapper.insertSalesDeliveryItem(salesDeliveryItem);

    }

    public List<SalesDeliveryItem> fetchSalesDeliveryItems(){
        List<SalesDeliveryItem> salesDeliveryItems = new ArrayList();
        salesDeliveryItems = salesDeliveryMapper.searchSalesDeliveryItems();
        return salesDeliveryItems;
    }

    public void saveSalesOrderBatchItem(SalesOrderBatchItem salesOrderBatchItem){
        salesDeliveryMapper.insertSalesOrderBatchItem(salesOrderBatchItem);

    }

    public List<SalesOrderBatchItem> fetchSalesOrderBatchItems(){
        List<SalesOrderBatchItem> salesOrderBatchItems = new ArrayList();
        salesOrderBatchItems = salesDeliveryMapper.searchSalesOrderBatchItems();
        return salesOrderBatchItems;
    }
}