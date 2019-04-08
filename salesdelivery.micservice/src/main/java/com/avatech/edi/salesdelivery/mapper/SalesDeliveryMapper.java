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
import java.util.List;

@Component
public interface SalesDeliveryMapper{

    void insertSalesDelivery(SalesDelivery SalesDelivery);

    List<SalesDelivery> searchSalesDeliverys();

    void insertSalesDeliveryItem(SalesDeliveryItem SalesDeliveryItem);

    List<SalesDeliveryItem> searchSalesDeliveryItems();

    void insertSalesOrderBatchItem(SalesDeliveryBatchItem SalesDeliveryBatchItem);

    List<SalesDeliveryBatchItem> searchSalesOrderBatchItems();
}