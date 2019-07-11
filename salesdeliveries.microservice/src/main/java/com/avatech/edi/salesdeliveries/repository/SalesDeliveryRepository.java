/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesdeliveries.repository;

import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDeliveryLine;

import java.util.List;

public interface SalesDeliveryRepository{

    List<SalesDelivery> fetchSalesDeliverys();

}