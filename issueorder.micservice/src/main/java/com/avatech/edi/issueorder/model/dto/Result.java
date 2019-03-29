package com.avatech.edi.issueorder.model.dto;

public class Result {
    private String code;

    private String message;

    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Result ok(){
        this.code = "0";
        this.message = "Successful";
        return this;
    }

    public Result ok(String value){
        this.code = "0";
        this.message = "Successful";
        this.data = value;
        return this;
    }

    public Result error(String message){
        this.code = "-1";
        this.message = message;
        return this;
    }

}
