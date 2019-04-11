package com.avatech.edi.salesdelivery.service;

import com.avatech.edi.salesdelivery.businessone.SalesDeliveryB1Service;
import com.avatech.edi.salesdelivery.common.BaseException;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.config.B1Connection;
import com.avatech.edi.salesdelivery.model.vo.SyncResult;
import com.avatech.edi.salesdelivery.repository.SalesDeliveryRepository;
import com.avatech.edi.salesdelivery.service.config.B1Manager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class SalesDeliveryService{

    @Autowired
    private SalesDeliveryRepository salesDeliveryRepository;

    @Autowired
    private SalesDeliveryB1Service salesDeliveryB1Service;

    @Autowired
    private B1Manager b1Manager;

    @Transactional
    public void saveSalesDelivery(SalesDelivery order){
        salesDeliveryRepository.saveSalesDelivery(order);
    }

    @Transactional
    public List<SalesDelivery> fetchSalesDelivery(){
        return salesDeliveryRepository.fetchSalesDeliverys();
    }

    /**
     * 同步交货单到SAP
     * @param salesDelivery
     * @return
     */
    public SyncResult createSalesDelivery(SalesDelivery salesDelivery){
        try {
            B1Connection b1Connection = b1Manager.getB1ConnInstance();
            return salesDeliveryB1Service.syncSalesDelivery(salesDelivery,b1Connection);
        }catch (BaseException e) {
            throw e;
        } catch (Exception e) {
            log.error("处理发货单异常",e);
            throw new BaseException("20001","内部错误");
        }
    }
}