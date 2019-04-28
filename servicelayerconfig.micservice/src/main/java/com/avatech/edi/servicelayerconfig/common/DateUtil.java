package com.avatech.edi.servicelayerconfig.common;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DateUtil {



    public static Long getLongTime() {
        return getLongTime(LocalDateTime.now());
    }

    public static Long getLongTime(LocalDateTime dateTime) {
        return dateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    public static Long getLongTime(Date date) {
        return getLongTime(date.toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime());
    }


}
