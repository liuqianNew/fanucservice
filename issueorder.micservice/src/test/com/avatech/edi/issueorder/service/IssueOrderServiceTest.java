package com.avatech.edi.issueorder.service;

import com.avatech.edi.issueorder.IssueorderApplication;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=IssueorderApplication.class)
@EnableAutoConfiguration
public class IssueOrderServiceTest {

    @Autowired
    IssueOrderService issueOrderService;

    @Test
    public void saveIssueOrder() {
        IssueOrder order = new IssueOrder();
        order.setDocDate("2019-03-28");
        order.setDocTime(122323);
        order.setDocEntry("310000004");
        order.setComments("this is test");
        IssueOrderItem issueOrderItem = new IssueOrderItem();
        issueOrderItem.setBaseEntry("300003");
        issueOrderItem.setBaseLine(0);
        issueOrderItem.setLineId(1);
        issueOrderItem.setDocEntry("310000004");
        issueOrderItem.setItemCode("12212");
        issueOrderItem.setItemName("itemname test");
        issueOrderItem.setQuantity(new BigDecimal(12));
        IssueOrderBatchItem issueOrderBatchItem = new IssueOrderBatchItem();
        //IssueOrderBatchItem.setDocEntry("310000004");
        issueOrderBatchItem.setBatchNum("20190328001");
        issueOrderBatchItem.setItemCode("12212");
        issueOrderBatchItem.setQuantity(new BigDecimal(232));
        issueOrderBatchItem.setItemLineId(1);
        issueOrderItem.getIssueOrderBatchItems().add(issueOrderBatchItem);
        order.getIssueOrderItems().add(issueOrderItem);
        issueOrderService.saveIssueOrder(order);
    }
}