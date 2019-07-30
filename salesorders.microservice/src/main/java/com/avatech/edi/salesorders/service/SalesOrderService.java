package com.avatech.edi.salesorders.service;

import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SyncResult;
import com.avatech.edi.salesorders.repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    public List<SalesOrder> fetchSalesOrders() {

        List<SalesOrder> SalesOrder = salesOrderRepository.fetchSalesOrders();

        return SalesOrder;
    }

    /**
     * 查询未同步订单
     *
     * @return
     */
    public List<SalesOrder> fetchIsSyncSalesOrder() {
        return salesOrderRepository.fetchIsSyncSalesOrder();
    }

    /**
     * 同步状态 更新
     *
     * @param syncResult
     */
    public void updateIsSync(SyncResult syncResult) {
        salesOrderRepository.updateIsSync(syncResult);
    }

    /**
     * 查询待取消订单
     */
    public List<SalesOrder> fetchDeletedSalesOrder() {
        return salesOrderRepository.fetchDeletedSalesOrder();
    }

    /**
     * 更新待去订单状态
     *
     * @param syncResult
     */
    public void updateCancleSalesOrder(SyncResult syncResult) {
        salesOrderRepository.updateDeteled(syncResult);
    }
}