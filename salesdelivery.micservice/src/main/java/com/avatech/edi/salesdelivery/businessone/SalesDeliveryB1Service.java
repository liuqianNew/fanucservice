package com.avatech.edi.salesdelivery.businessone;

import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDelivery;
import com.avatech.edi.salesdelivery.model.bo.salesdelivery.SalesDeliveryItem;
import com.avatech.edi.salesdelivery.model.config.B1Connection;
import com.avatech.edi.salesdelivery.model.vo.SyncResult;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.IDocuments;
import com.sap.smb.sbo.api.SBOCOMUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SalesDeliveryB1Service {
    private final Logger logger = LoggerFactory.getLogger(SalesDeliveryB1Service.class);

    private static final Integer SALES_DELIVERY_ORDER = 15;

    private static final Integer SALES_ORDER = 17;

    public SyncResult syncSalesDelivery(SalesDelivery salesDelivery, B1Connection connection) {
        BORepositoryBusinessOne boRepositoryBusinessOne = null;
        ICompany company = null;
        try {
            logger.info(connection.toString());
            boRepositoryBusinessOne = BORepositoryBusinessOne.getInstance(connection);
            logger.info("获取连接对象");
            company = boRepositoryBusinessOne.getCompany();
            IDocuments documents = SBOCOMUtil.newDocuments(company,SALES_DELIVERY_ORDER);
            documents.setDocDate(new Date());
            documents.setCardCode(salesDelivery.getCardCode());
            for (SalesDeliveryItem item:salesDelivery.getsalesDeliveryItems()){
                documents.getLines().setBaseType(SALES_ORDER);
                documents.getLines().setBaseEntry(Integer.valueOf(""));
                documents.getLines().setBaseLine(Integer.valueOf(""));
                documents.getLines().setItemCode(item.getItemCode());
                documents.getLines().setQuantity(Double.valueOf(item.getQuantity().toString()));
                documents.getLines().add();
            }
            Integer resultCode = documents.add();
            if(resultCode.equals(0)){
                logger.info("交货单生成成功");
                return new SyncResult(salesDelivery.getEDIDocEntry().toString()).ok(company.getNewObjectKey());
            }else {
                logger.error("同步发货过账单信息失败：",company.getLastErrorCode() + company.getLastErrorDescription());
                throw new Exception(company.getLastErrorCode() + company.getLastErrorDescription());
            }
        } catch (Exception e) {
            logger.error("同步发货过账信息异常", e);
            throw new B1Exception("30010", e.getMessage());
        }
    }
}
