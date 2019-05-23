package com.avatech.edi.salesdelivery.service;
 import com.avatech.edi.salesdelivery.SalesdeliveryApplication;
 import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
 import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryBatchItem;
 import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
 import com.avatech.edi.salesdelivery.service.SalesDeliveryService;
import org.junit.Test;
 import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
 import org.springframework.boot.test.context.SpringBootTest;
 import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
 import java.util.Date;
import java.util.List;

/**
 * Created by yuanxingfang on 2019/5/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SalesdeliveryApplication.class)
@EnableAutoConfiguration

public class SalesDeliveryServiceTest {

    @Autowired
    SalesDeliveryService salesDeliveryService;

    @Test
    public void saveSalesDelivery() throws Exception {
        SalesDelivery order = new SalesDelivery();
        order.setCardCode("C000001");
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();//创建一个date对象保存当前时间
        String dateStr = simpleDateFormat.format(date);*/
        order.setDocDate( new Date());

        order.setComments("test");
        order.setDocEntry("26");

        List<SalesDeliveryItem> salesDeliveryItems = order.getsalesDeliveryItems();
        SalesDeliveryItem salesDeliveryItem = new SalesDeliveryItem();
        salesDeliveryItem.setDocEntry("26");//销售订单号
        salesDeliveryItem.setBaseEntry("83");//
        salesDeliveryItem.setBaseLine(0);//销售订单行号
        salesDeliveryItem.setWhsCode("W001");//仓库
        salesDeliveryItem.setQuantity(new BigDecimal(1));//数量
        salesDeliveryItem.setItemCode("M00000001");//物料编号
        salesDeliveryItem.setUnitMsr("");//计量单位
        salesDeliveryItems.add(salesDeliveryItem);
        //批次
        List<SalesDeliveryBatchItem> items = salesDeliveryItem.getSalesDeliveryBatchItems();
        SalesDeliveryBatchItem item = new SalesDeliveryBatchItem();
        item.setItemCode("M00000001");
        item.setBatchNum("11");//序列号
        item.setQuantity(new BigDecimal(1));//数量
        items.add(item);
        salesDeliveryService.saveSalesDelivery(order);

    }

}