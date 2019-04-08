package com.avatech.edi.draftorder.commom;

import com.avatech.edi.draftorder.messervice.FDIService;

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
