/**
 * FileName: PurchaseReceiptServiceTest
 * Date:     2019/4/30 10:45
 * Description:
 */
package com.avatech.edi.purchasereceipt.service;

import com.alibaba.fastjson.JSONObject;
import com.avatech.edi.purchasereceipt.PurchasereceiptApplication;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceipt;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptBatchItem;
import com.avatech.edi.purchasereceipt.model.bo.purchasereceipt.PurchaseReceiptItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PurchasereceiptApplication.class)
@EnableAutoConfiguration
public class PurchaseReceiptServiceTest {

    @Autowired
    private PurchaseReceiptService purchaseReceiptService;

    @Test
    public void testSavePurchaseReceipt(){
        PurchaseReceipt order = new PurchaseReceipt();
        order.setCardCode("S000002");
        order.setDocDate("2019-4-30");
        order.setComments("test");
        order.setDocEntry("130000022");
        List<PurchaseReceiptItem> purchaseReceiptItems = order.getpurchaseReceiptItems();
        PurchaseReceiptItem purchaseReceiptItem = new PurchaseReceiptItem();
        purchaseReceiptItem.setDocEntry("130000022");//采购订单号
        purchaseReceiptItem.setBaseEntry("49");//
        purchaseReceiptItem.setBaseLine(0);//采购订单行号
        purchaseReceiptItem.setWhsCode("W001");//仓库
        purchaseReceiptItem.setQuantity(new BigDecimal(1));//数量
        purchaseReceiptItem.setItemCode("M000000001");//物料编号
        purchaseReceiptItem.setUnitMsr("");//计量单位
        purchaseReceiptItems.add(purchaseReceiptItem);
        //批次
        List<PurchaseReceiptBatchItem> items = purchaseReceiptItem.getpurchaseReceiptBatchItems();
        PurchaseReceiptBatchItem item = new PurchaseReceiptBatchItem();
        item.setItemCode("M000000001");
        item.setBatchNum("qqqqqqq");//序列号
        item.setQuantity(new BigDecimal(2));//数量
        items.add(item);
        purchaseReceiptService.savePurchaseReceipt(order);
    }
}
