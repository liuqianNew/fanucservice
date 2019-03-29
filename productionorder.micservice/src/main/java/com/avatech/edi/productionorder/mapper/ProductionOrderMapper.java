/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-25
 */
package com.avatech.edi.productionorder.mapper;


import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrderItem;
import com.avatech.edi.productionorder.model.vo.SyncResult;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface ProductionOrderMapper {

    List<ProductionOrder> searchProductionOrders();

    List<ProductionOrderItem> searchProductionOrderItems(Integer docEntry);

    void updateProductionOrderUserField(SyncResult result);
}