package com.avatech.edi.materialstock.repository;

import com.avatech.edi.materialstock.model.bo.stocks.StockDelivery;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryBatchItem;
import com.avatech.edi.materialstock.model.bo.stocks.StockDeliveryItem;

import java.util.List;

public interface StockDeliveryRepository {

    StockDelivery fetchMaterialStock();

}
