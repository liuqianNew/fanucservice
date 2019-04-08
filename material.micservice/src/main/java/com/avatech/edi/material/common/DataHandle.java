package com.avatech.edi.material.common;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DataHandle {

    public static String getValue(String value){
        if(StringUtils.isEmpty(value)){
            return "";
        }else {
            return value;
        }
    }

    public static String getDateValue(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    public static Integer getDefaultValue(Integer value){
        if(value == null){
            return -1;
        }else {
            return value;
        }
    }
}
