package com.avatech.edi.material.job;

import com.avatech.edi.material.common.MESService;
import com.avatech.edi.material.messervice.FDIService;
import com.avatech.edi.material.model.bo.material.MaterialItem;
import com.avatech.edi.material.model.vo.SyncResult;
import com.avatech.edi.material.repository.MaterialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaterialJob {

    private final Logger logger = LoggerFactory.getLogger(MaterialJob.class);

    @Autowired
    private MaterialRepository materialRepository;

    @Scheduled(cron = "0 0/1 * * * ?")
    private void process() {
        try {
            List<MaterialItem> materialItems = materialRepository.fetchMaterialItems();
            if (materialItems == null || materialItems.size() == 0) {
                return;
            }
            FDIService service = MESService.getInstance();
            logger.info("推送MES物料信息：{}", materialItems.toString());
            String result = service.getFDIServiceSoap().getMaterialInfo(materialItems.toString());
            logger.info("推送MES物料结果：{}", result);

            for (MaterialItem item : materialItems) {
                if (result.equals("OK")) {
                    // TODO update success status for push material successful
                    materialRepository.updateMaterialItemsUserField(new SyncResult(item.getItemCode(), "Y", "Successful"));
                } else {
                    // TODO update success status for push material failure
                    materialRepository.updateMaterialItemsUserField(new SyncResult(item.getItemCode(), "E", result));
                }
            }
        } catch (Exception e) {
            logger.error("推送物料信息异常：", e);
        }
    }

}


