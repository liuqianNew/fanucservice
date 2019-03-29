/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-25
 */
package com.avatech.edi.productionorder.repository;

import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrderItem;
import com.avatech.edi.productionorder.model.vo.SyncResult;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

public interface ProductionOrderRepository{

    List<ProductionOrder> fetchProductionOrders();

    void updateProductionOrderUserField(SyncResult result);

}