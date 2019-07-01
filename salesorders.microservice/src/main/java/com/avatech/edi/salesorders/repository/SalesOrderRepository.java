/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.repository;

import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import org.springframework.stereotype.Component;
import java.util.List;

public interface SalesOrderRepository{

    void saveSalesOrder(SalesOrder SalesOrder);

    List<SalesOrder> fetchSalesOrders();

    void saveSalesOrderLine(SalesOrderLine SalesOrderLine);

    List<SalesOrderLine> fetchSalesOrderLines();
}