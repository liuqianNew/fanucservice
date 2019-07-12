package com.avatech.edi.purchasereceipt.common;

public class BaseException extends RuntimeException {

    private String code = "";

    public String getCode(){
        return code;
    }

    private String message = "";
    public String getMessage(){return message;}

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message;
    }

    public BaseException(String code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }
}
