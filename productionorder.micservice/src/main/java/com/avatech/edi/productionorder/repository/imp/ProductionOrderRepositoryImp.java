/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-25
 */
package com.avatech.edi.productionorder.repository.imp;

import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrder;
import com.avatech.edi.productionorder.model.bo.productionorder.ProductionOrderItem;
import com.avatech.edi.productionorder.mapper.ProductionOrderMapper;
import com.avatech.edi.productionorder.model.vo.SyncResult;
import com.avatech.edi.productionorder.repository.ProductionOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class ProductionOrderRepositoryImp implements ProductionOrderRepository{

    @Autowired
    private ProductionOrderMapper productionOrderMapper;


    public List<ProductionOrder> fetchProductionOrders(){
        List<ProductionOrder> productionOrders = new ArrayList();
        productionOrders = productionOrderMapper.searchProductionOrders();
        for (ProductionOrder order:productionOrders) {
            order.getproductionOrderItems().addAll(productionOrderMapper.searchProductionOrderItems(order.getDocEntry()));
        }
        return productionOrders;
    }

    @Override
    public void updateProductionOrderUserField(SyncResult result) {
        productionOrderMapper.updateProductionOrderUserField(result);
    }

}