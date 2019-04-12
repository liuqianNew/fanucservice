/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.salesdelivery.repository;

import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryBatchItem;

import java.util.List;

public interface SalesDeliveryRepository{

    void saveSalesDelivery(SalesDelivery SalesDelivery);

    List<SalesDelivery> fetchSalesDeliverys();

    void updateSalesDelivery(SalesDelivery salesDelivery);
}