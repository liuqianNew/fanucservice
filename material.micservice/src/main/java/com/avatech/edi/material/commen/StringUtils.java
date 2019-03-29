package com.avatech.edi.material.commen;

public class StringUtils {
    public static boolean isEmpty(String value){
        if(value == null || value.length() == 0){
            return true;
        }else {
            return false;
        }
    }

    public static String getSubString(String value,int length){
        if(isEmpty(value)){
            return "";
        }
        if(value.length()<= length){
            return value;
        }
        return value.substring(0,length-1);
    }
}
