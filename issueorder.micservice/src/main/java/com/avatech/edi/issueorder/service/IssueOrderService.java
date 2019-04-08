package com.avatech.edi.issueorder.service;

import com.avatech.edi.issueorder.model.bo.issueorder.IssueOrder;
import com.avatech.edi.issueorder.repository.IssueOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IssueOrderService{

    @Autowired
    private IssueOrderRepository issueOrderRepository;

    @Transactional
    public void saveIssueOrder(IssueOrder order){
        issueOrderRepository.saveIssueOrder(order);
    }

}