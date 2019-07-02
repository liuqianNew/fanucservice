/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.repository.imp;

import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import com.avatech.edi.salesorders.mapper.SalesOrderMapper;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class SalesOrderRepositoryImp implements SalesOrderRepository{
    @Autowired
    private SalesOrderMapper salesOrderMapper;


    /**
     * 保存销售订单
     * @param salesOrder
     */
    public void saveSalesOrder(SalesOrder salesOrder){
        salesOrderMapper.insertSalesOrder(salesOrder);
        for (SalesOrderLine salesOrderLine:salesOrder.getsalesOrderLines()) {
            salesOrderMapper.insertSalesOrderLine(salesOrderLine);
        }
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
}