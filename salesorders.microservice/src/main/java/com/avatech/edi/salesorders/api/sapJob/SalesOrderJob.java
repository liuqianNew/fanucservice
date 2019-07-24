package com.avatech.edi.salesorders.api.sapJob;

import com.avatech.edi.common.exception.BusinessException;
import com.avatech.edi.salesorders.model.bo.salesorder.B1Manager;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrder;
import com.avatech.edi.salesorders.model.bo.salesorder.SalesOrderLine;
import com.avatech.edi.salesorders.model.bo.salesorder.SyncResult;
import com.avatech.edi.salesorders.service.SalesOrderService;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.IDocuments;
import com.sap.smb.sbo.api.SBOCOMException;
import com.sap.smb.sbo.api.SBOCOMUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesOrderJob {
    private Logger logger = LoggerFactory.getLogger(SalesOrderJob.class);

    @Autowired
    SalesOrderService salesOrderService;

   //@Scheduled(fixedRate = 30000)
    public void process() {
        try {
            List<SalesOrder> salesOrders = salesOrderService.fetchIsSyncSalesOrder();
            if (salesOrders.size() <= 0) {
                return;
            }
            logger.info(">>>>>>>>>>>>>>获取未同步销售订单{" + salesOrders.size() + "}条");
            B1Manager b1Manager = new B1Manager();
            ICompany company = b1Manager.getCompany();
            SyncResult syncResult = null;
            for (SalesOrder salesOrder : salesOrders) {
                try {
                    String sapDocEntry = createrSalesOrder(salesOrder, company);
                    syncResult = SyncResult.ok(salesOrder.getDocEntry(), sapDocEntry);
                    logger.info("同步销售订单成功DocEntry为：{"+ sapDocEntry+"}");
                } catch (Exception e) {
                    logger.error("同步销售订单失败：", e);
                    syncResult = SyncResult.error(salesOrder.getDocEntry());
                }
                salesOrderService.updateIsSync(syncResult);
            }
        } catch (Exception e) {
            logger.error("同步销售订单失败：", e);
        }

    }

    private String createrSalesOrder(SalesOrder salesOrder, ICompany company) throws SBOCOMException {
        IDocuments documents = SBOCOMUtil.newDocuments(company, 17);
        int rtCode;
        documents.setCardCode(salesOrder.getCardCode());//客户编号
        documents.setDocDate(salesOrder.getDocDate());//过账日期
        documents.setDocDueDate(salesOrder.getDocDate());//交货日期
        documents.setComments(salesOrder.getNote());//备注
        documents.getUserFields().getFields().item("U_BillNo").setValue(salesOrder.getBillNo());//平台订单号
        for (SalesOrderLine salesOrderLine : salesOrder.getsalesOrderLines()) {
            documents.getLines().setItemCode(salesOrderLine.getItemCode());//物料编码
            documents.getLines().setQuantity(salesOrderLine.getQuantity().doubleValue());//数量
            documents.getLines().setPrice(salesOrderLine.getPrice().doubleValue());//价格
            documents.getLines().setWarehouseCode(salesOrderLine.getWarehouse());//仓库
        }
        rtCode = documents.add();
        if (rtCode == 0) {
            return company.getNewObjectKey();
        } else {
            throw new BusinessException(
                    company.getLastErrorCode() + ";", company.getLastErrorDescription()
            );
        }
    }
}