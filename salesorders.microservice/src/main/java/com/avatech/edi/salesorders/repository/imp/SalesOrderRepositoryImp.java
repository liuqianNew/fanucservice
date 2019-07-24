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
import com.avatech.edi.salesorders.model.bo.salesorder.SyncResult;
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
    @Override
    public List<SalesOrder> fetchSalesOrders(){
        List<SalesOrder> salesOrders = new ArrayList();
        salesOrders = salesOrderMapper.searchSalesOrders();
        List<SalesOrderLine> salesOrderLines ;
        for (SalesOrder salesOrder:salesOrders){
            salesOrderLines = salesOrderMapper.searchSalesOrderLines(salesOrder.getDocEntry());
            salesOrder.getsalesOrderLines().addAll(salesOrderLines);
        }
        return salesOrders;
    }

    @Override
    public SalesOrder fetchSalesOrder(String billNo) {
        SalesOrder salesOrder = salesOrderMapper.searchSalesOrder(billNo);
        List<SalesOrderLine> salesOrderLines = salesOrderMapper.searchSalesOrderLines(salesOrder.getDocEntry());
        salesOrder.getsalesOrderLines().addAll(salesOrderLines);
        return salesOrder;
    }

    /**
     * 修改销售订单
     *
     */
    @Override
    public SalesOrder updateSalesOrder(String billNo) {
         salesOrderMapper.updateSalesOrder(billNo);
         // TODO 执行查询接口
         return this.fetchSalesOrder(billNo);
    }

    /**
     * 查询未同步销售订单
     * @return
     */

    @Override
    public List<SalesOrder> fetchIsSyncSalesOrder() {
        List<SalesOrder> salesOrders = new ArrayList();
        salesOrders = salesOrderMapper.searchSyncSalesOrder();
        List<SalesOrderLine> salesOrderLines ;
        for (SalesOrder salesOrder:salesOrders){
            salesOrderLines = salesOrderMapper.searchSalesOrderLines(salesOrder.getDocEntry());
            salesOrder.getsalesOrderLines().addAll(salesOrderLines);
        }
        return salesOrders;
    }

    /**
     * 更新同步状态
     * @param
     * @return
     */
    @Override
    public void updateIsSync(SyncResult syncResult) {
            salesOrderMapper.updateIsSyncByDocEntry(syncResult);
    }

    /**
     * 查询待取消订单
     * @return
     */
    @Override
    public List<SalesOrder> fetchDeletedSalesOrder() {
        List<SalesOrder> salesOrders=salesOrderMapper.searchDeletedSalesOrder();
        return  salesOrders;
    }

    /**
     * 更新待取消订单
     * @param syncResult
     */
    @Override
    public void updateDeteled(SyncResult syncResult) {
        salesOrderMapper.updateDeletedSalesOrder(syncResult);
    }
}