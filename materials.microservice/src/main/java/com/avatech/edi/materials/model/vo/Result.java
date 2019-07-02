package com.avatech.edi.materials.model.vo;

public class Result<T> {

    public static String OK = "0";

    public static String SUCCESSFUL = "OK";

    public Result(){

    }

    public Result(String code,String message){
        this.code = code;
        this.message = message;
    }

    public Result ok(T data){
        this.code = Result.OK;
        this.message = Result.SUCCESSFUL;
        this.data = data;
        return this;
    }

    public Result ok(){
        return new Result(Result.OK,Result.SUCCESSFUL);
    }

    public Result error(String code,String message){
        return new Result(code,message);
    }

    private String code;

    private String message;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
