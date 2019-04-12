/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.repository;

import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

public interface IssueOrderRepository{

    void saveIssueOrder(IssueOrder IssueOrder);

    List<IssueOrder> fetchIssueOrders();

    void updateIssueOrder(IssueOrder issueOrder);
}