/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.repository.imp;

import com.avatech.edi.common.data.ArrayList;
import com.avatech.edi.salesorders.mapper.SalesOrderMapper;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import com.avatech.edi.salesorders.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesOrderRepositoryImp implements SalesOrderRepository{
    @Autowired
    private SalesOrderMapper salesOrderMapper;


    /**
     * 保存销售订单
     * @param salesOrder
     */
    public SalesOrder saveSalesOrder(SalesOrder salesOrder){
        SnowflakeIdWorker worker = new SnowflakeIdWorker(0,0);
        long docEntry = worker.nextId();
        salesOrder.setDocEntry(docEntry);
        salesOrderMapper.insertSalesOrder(salesOrder);
        int index = 0;
        for (SalesOrderLine salesOrderLine:salesOrder.getsalesOrderLines()) {
            salesOrderLine.setDocEntry(docEntry);
            salesOrderLine.setLineId(index);
            index ++;
            salesOrderMapper.insertSalesOrderLine(salesOrderLine);
        }
        return salesOrder;
    }

    /**
     * 查询销售订单
     * @return
     */
    public List<SalesOrder> fetchSalesOrders(){
        List<SalesOrder> salesOrders = new ArrayList();

        salesOrders = salesOrderMapper.searchSalesOrders();
        return salesOrders;
    }
    /**
     * 修改销售订单
     *
     */
    @Override
    public SalesOrder updateSalesOrder(String docEntry) {

         salesOrderMapper.updateSalesOrder(docEntry);
        return null;
    }
}