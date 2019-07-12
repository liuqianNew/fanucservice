package com.avatech.edi.purchasereceipt.common;

public class BusinessException extends BaseException{
    private static final long serialVersionUID = 1L;

    private String code = "";

    public String getCode(){
        return code;
    }

    private String message = "";
    public String getMessage(){return message;}

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
    }

    public BusinessException(String code,String message){
        super(code,message);
        this.code = code;
        this.message = message;
    }
}
