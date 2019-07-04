/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-07-01
 */
package com.avatech.edi.salesorders.mapper;


import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface SalesOrderMapper{

    void insertSalesOrder(SalesOrder SalesOrder);

    List<SalesOrder> searchSalesOrders();

    void insertSalesOrderLine(SalesOrderLine SalesOrderLine);

    void updateSalesOrder(String docEntry);

    List<SalesOrderLine> searchSalesOrderLines();
}