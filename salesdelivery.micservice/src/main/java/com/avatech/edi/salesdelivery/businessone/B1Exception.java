package com.avatech.edi.salesdelivery.businessone;

import com.avatech.edi.salesdelivery.common.BaseException;

public class B1Exception extends BaseException {
    private String code;

    private String message;

    public B1Exception() {
        super();
    }

    public B1Exception(String message){
        super();
        this.message = message;
    }

    public B1Exception(String code,String message){
        super(code,message);
        this.code = code;
        this.message = message;
    }


    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public B1Exception(Exception e){
        super(e);
    }


}
