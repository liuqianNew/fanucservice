package com.avatech.edi.materialstock.mapper;

import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryBatchItem;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StockDeliveryMapper {

    List<StockDeliveryItem> fetchMaterialStockItem();

    List<StockDeliveryBatchItem> fetchMaterialStockBatchItem(String itemCode);

}
