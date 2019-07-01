/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesdeliveries.mapper;


import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDeliveryLine;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface SalesDeliveryMapper{

    void insertSalesDelivery(SalesDelivery SalesDelivery);

    List<SalesDelivery> searchSalesDeliverys();

    void insertSalesDeliveryLine(SalesDeliveryLine SalesDeliveryLine);

    List<SalesDeliveryLine> searchSalesDeliveryLines();
}