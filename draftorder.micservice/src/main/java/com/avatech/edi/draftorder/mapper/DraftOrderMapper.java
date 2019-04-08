/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-03-27
 */
package com.avatech.edi.draftorder.mapper;


import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrder;
import com.avatech.edi.draftorder.model.bo.draftorder.DraftOrderItem;
import com.avatech.edi.draftorder.model.bo.draftorder.BatchItem;
import com.avatech.edi.draftorder.model.vo.SyncResult;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public interface DraftOrderMapper{

    List<DraftOrder> searchDraftOrders();

    List<DraftOrderItem> searchDraftOrderItems(String docEntry);

    List<BatchItem> searchBatchItems(Map map);

    void updateDraftOrder(SyncResult result);
}