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
import com.avatech.edi.salesdeliveries.utils.SnowflakeIdWorker;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component


public class SalesDeliveryRepositoryImp implements SalesDeliveryRepository{
    @Autowired
    private SalesDeliveryMapper salesDeliveryMapper;

    /**
     * 查询销售交货订单
     * @param
     */
    public List<SalesDelivery> fetchSalesDeliverys(){
        List<SalesDelivery> salesDeliverys = new ArrayList();
        salesDeliverys = salesDeliveryMapper.searchSalesDeliverys();
        List<SalesDeliveryLine> salesDeliveryLines = null;
        for (SalesDelivery salesDelivery:salesDeliverys) {
            salesDeliveryLines = salesDeliveryMapper.searchSalesDeliveryLines(salesDelivery.getDocEntry());
            salesDelivery.getsalesDeliveryLines().addAll(salesDeliveryLines);
        }
        return salesDeliverys;
    }

}