package com.avatech.edi.salesdeliveries.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    /**
     * 获取当天日期  yyyy-MM-dd
     * @return
     */
    public static String newDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    /**
     * 获取当前时间  hh:mm:SS
     * @return
     */
    public static Integer newTime() {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        return c.get(Calendar.HOUR_OF_DAY) * 10000 + c.get(Calendar.MINUTE) * 100 + c.get(Calendar.SECOND);
    }

    /**
     * 拆分时间 yyyy-MM-dd HH:mm:ss 获取 HH:mm:ss
     */
    public static Integer newSplitTime(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int intTime = calendar.get(Calendar.HOUR_OF_DAY)* 10000 +calendar.get(Calendar.MINUTE)* 100+calendar.get(Calendar.SECOND);
        return intTime;
    }

    /**
     * 获取当前时间 yyyy-MM-dd hh:mm:SS
     */
    public static String newDateTime(Date date){
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
