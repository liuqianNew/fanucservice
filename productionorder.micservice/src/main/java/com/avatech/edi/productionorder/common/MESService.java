package com.avatech.edi.productionorder.common;

import com.avatech.edi.productionorder.message.FDIService;

public class MESService {

    private static FDIService service;

    private MESService(){
        service = new FDIService();
    }

    public static FDIService getInstance(){
        if(null == service){
            return new MESService().service;
        }else {
            return service;
        }
    }

}
