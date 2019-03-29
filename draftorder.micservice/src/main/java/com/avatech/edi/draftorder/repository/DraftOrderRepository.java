/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.draftorder.repository;

import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrderItem;
import com.avatech.edi.draftorder.model.bo.draftorder.BatchItem;
import org.springframework.stereotype.Component;
import java.util.List;

public interface DraftOrderRepository{

    void saveDraftOrder(DraftOrder DraftOrder);

    List<DraftOrder> fetchDraftOrders();

    void saveDraftOrderItem(DraftOrderItem DraftOrderItem);

    List<DraftOrderItem> fetchDraftOrderItems();

    void saveBatchItem(BatchItem BatchItem);

    List<BatchItem> fetchBatchItems();
}