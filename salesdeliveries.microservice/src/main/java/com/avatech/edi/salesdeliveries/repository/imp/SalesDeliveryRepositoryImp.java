/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesdeliveries.repository.imp;

import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdeliveries.model.bo.salesdelivery.SalesDeliveryLine;
import com.avatech.edi.salesdeliveries.mapper.SalesDeliveryMapper;
import com.avatech.edi.salesdeliveries.repository.SalesDeliveryRepository;
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

    public void saveSalesDeliveryLine(SalesDeliveryLine salesDeliveryLine){
        salesDeliveryMapper.insertSalesDeliveryLine(salesDeliveryLine);

    }

    public List<SalesDeliveryLine> fetchSalesDeliveryLines(){
        List<SalesDeliveryLine> salesDeliveryLines = new ArrayList();
        salesDeliveryLines = salesDeliveryMapper.searchSalesDeliveryLines();
        return salesDeliveryLines;
    }
}