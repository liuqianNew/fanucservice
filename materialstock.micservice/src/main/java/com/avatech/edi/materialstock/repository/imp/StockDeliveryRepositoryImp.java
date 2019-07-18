package com.avatech.edi.materialstock.repository.imp;

import com.avatech.edi.materialstock.mapper.StockDeliveryMapper;
import com.avatech.edi.materialstock.model.bo.stocks.StockDelivery;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryBatchItem;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryItem;
import com.avatech.edi.materialstock.repository.StockDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class StockDeliveryRepositoryImp implements StockDeliveryRepository {

    @Autowired
    private StockDeliveryMapper stockDeliveryMapper;

    @Override
    public StockDelivery fetchMaterialStock(){
        StockDelivery stockDelivery = new StockDelivery();
        stockDelivery.setDocDate(new Date());
        stockDelivery.setDocDueDate(new Date());
        stockDelivery.getStockDeliveryItem().addAll(stockDeliveryMapper.fetchMaterialStockItem());
        for(StockDeliveryItem item : stockDelivery.getStockDeliveryItem()){
            item.getStockDeliveryBatchItem().addAll(stockDeliveryMapper.fetchMaterialStockBatchItem(item.getItemCode()));
        }
        return stockDelivery;
    }
}
