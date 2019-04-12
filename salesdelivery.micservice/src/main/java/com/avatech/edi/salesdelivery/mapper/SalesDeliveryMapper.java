/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.mapper;


import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryBatchItem;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface SalesDeliveryMapper{

    void insertSalesDelivery(SalesDelivery SalesDelivery);

    List<SalesDelivery> searchSalesDeliverys();

    void insertSalesDeliveryItem(SalesDeliveryItem SalesDeliveryItem);

    List<SalesDeliveryItem> searchSalesDeliveryItems(Long ediDocEntry);

    void insertSalesDeliveryBatchItem(SalesDeliveryBatchItem SalesDeliveryBatchItem);

    List<SalesDeliveryBatchItem> searchSalesDeliveryBatchItems(HashMap hashMap);
    
    void updateSalesDelivery(SalesDelivery salesDelivery);
}