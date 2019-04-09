package com.avatech.edi.productionorder.model.dto;

public class Result {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result ok(){
        this.code = "0";
        this.message = "Successful";
        return this;
    }

    public Result error(String message){
        this.code = "-1";
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
