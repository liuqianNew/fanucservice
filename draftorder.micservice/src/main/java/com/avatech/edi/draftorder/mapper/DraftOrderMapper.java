/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.draftorder.mapper;


import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrderItem;
import com.avatech.edi.draftorder.model.bo.draftorder.BatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface DraftOrderMapper{

    void insertDraftOrder(DraftOrder DraftOrder);

    List<DraftOrder> searchDraftOrders();

    void insertDraftOrderItem(DraftOrderItem DraftOrderItem);

    List<DraftOrderItem> searchDraftOrderItems();

    void insertBatchItem(BatchItem BatchItem);

    List<BatchItem> searchBatchItems();
}