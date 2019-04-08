/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-26
 */
package com.avatech.edi.issueorder.repository.imp;

import com.avatech.edi.issueorder.common.SnowflakeIdWorker;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderItem;
import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrderBatchItem;
import com.avatech.edi.issueorder.mapper.IssueOrderMapper;
import com.avatech.edi.issueorder.repository.IssueOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class IssueOrderRepositoryImp implements IssueOrderRepository{

    @Autowired
    private IssueOrderMapper issueOrderMapper;

    @Override
    public void saveIssueOrder(IssueOrder issueOrder) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long ediId;
        ediId = idWorker.nextId();
        issueOrder.setEDIDocEntry(ediId);
        for (int index = 0;index<issueOrder.getIssueOrderItems().size();index++) {
            issueOrder.getIssueOrderItems().get(index).setEDIDocEntry(ediId);
            issueOrder.getIssueOrderItems().get(index).setEDILineId(index);
            for (int batchIndex = 0 ;batchIndex < issueOrder.getIssueOrderItems().get(index).getIssueOrderBatchItems().size();batchIndex++){
                issueOrder.getIssueOrderItems().get(index).getIssueOrderBatchItems().get(batchIndex).setEDIDocEntry(ediId);
                issueOrder.getIssueOrderItems().get(index).getIssueOrderBatchItems().get(batchIndex).setEDILineId(batchIndex);
                issueOrder.getIssueOrderItems().get(index).getIssueOrderBatchItems().get(batchIndex).setEDIItemLineId(index);
            }
        }

        issueOrderMapper.insertIssueOrder(issueOrder);
        for (IssueOrderItem issueOrderItem:issueOrder.getIssueOrderItems()) {
            issueOrderMapper.insertIssueOrderItem(issueOrderItem);
            for (IssueOrderBatchItem issueOrderBatchItem:issueOrderItem.getIssueOrderBatchItems()) {
                issueOrderMapper.insertIssueOrderBatchItem(issueOrderBatchItem);
            }
        }
    }

    @Override
    public List<IssueOrder> fetchIssueOrders() {
        List<IssueOrder> issueOrders = issueOrderMapper.searchIssueOrders();
        for (IssueOrder issueOrder:issueOrders) {

        }
        return issueOrders;
    }
}