/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.mapper;


import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface IssueOrderMapper{

    void insertIssueOrder(IssueOrder IssueOrder);

    List<IssueOrder> searchIssueOrders();

    void insertIssueOrderItem(IssueOrderItem IssueOrderItem);

    List<IssueOrderItem> searchIssueOrderItems(Long ediDocEntry);

    void insertIssueOrderBatchItem(IssueOrderBatchItem IssueOrderBatchItem);

    List<IssueOrderBatchItem> searchIssueOrderBatchItems(HashMap hashMap);

    void updateIssueOrder(IssueOrder issueOrder);
}