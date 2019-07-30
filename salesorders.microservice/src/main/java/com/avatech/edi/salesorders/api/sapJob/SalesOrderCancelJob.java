package com.avatech.edi.salesorders.api.sapJob;

import com.avatech.edi.common.exception.BusinessException;
import com.avatech.edi.salesorders.model.bo.salesorder.B1Manager;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SyncResult;
import com.avatech.edi.salesorders.service.SalesOrderService;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.IDocuments;
import com.sap.smb.sbo.api.SBOCOMException;
import com.sap.smb.sbo.api.SBOCOMUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
@SuppressWarnings("ALL")
@Component
public class SalesOrderCancelJob {

    private Logger logger = LoggerFactory.getLogger(SalesOrderCancelJob.class);

    @Autowired
    SalesOrderService salesOrderService;

    @Scheduled(fixedRate = 300000)
    public void process() {
        try {
            List<SalesOrder> salesOrders = salesOrderService.fetchDeletedSalesOrder();
            if (salesOrders.size() <= 0) {
                return;
            }
            logger.info(">>>>>>>>>>>>>>获取待取消销售订单{" + salesOrders.size() + "}条");
            B1Manager b1Manager = new B1Manager();
            ICompany company = b1Manager.getCompany();
            SyncResult syncResult = null;
            for (SalesOrder salesOrder : salesOrders) {
                if (salesOrder.getDeleted().equals(salesOrder.getIsSync())) {
                    Long DocEntry = canleldSalesOrder(salesOrder, company);
                    syncResult = SyncResult.cancle(DocEntry);
                    logger.info("销售取消订单成功DocEntry为：{" + salesOrder.getSAPDocEntry() + "}");
                } else {
                    syncResult = SyncResult.cancle(salesOrder.getDocEntry());
                    logger.info("取消销售订单成功");
                }
                salesOrderService.updateCancleSalesOrder(syncResult);
            }
        } catch (Exception e) {
            logger.error("取消销售订单失败", e.getMessage());
        }

    }

    private Long canleldSalesOrder(SalesOrder salesOrder, ICompany company) throws SBOCOMException {
        IDocuments documents = SBOCOMUtil.newDocuments(company, 17);
        int rtCode;
        SyncResult syncResult = null;
        if(documents.getByKey(Integer.parseInt(salesOrder.getSAPDocEntry()))){
            rtCode = documents.cancel();
            if (rtCode == 0) {
                return salesOrder.getDocEntry();
            } else {
                throw new BusinessException(
                        company.getLastErrorCode() + ";", company.getLastErrorDescription());
            }
        }else {
            logger.error("sapDocEntry为空");
            throw new BusinessException("1001","订单不存在");
        }
    }
}
