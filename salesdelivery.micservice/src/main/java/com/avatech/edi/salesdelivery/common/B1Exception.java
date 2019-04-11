package com.avatech.edi.salesdelivery.common;

public class B1Exception extends BaseException{
    private static final long serialVersionUID = 1L;

    private String code = "";

    public String getCode(){
        return code;
    }

    private String message = "";
    public String getMessage(){return message;}

    public B1Exception() {
    }

    public B1Exception(String message) {
        super(message);
        this.message = message;
    }

    public B1Exception(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public B1Exception(Throwable cause) {
        super(cause);
    }

    public B1Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
    }

    public B1Exception(String code,String message){
        super(code,message);
        this.code = code;
        this.message = message;
    }
}
