package com.wpp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtils {
//    日期转换成字符串
    public static String DateToStr(Date date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String formate = sdf.format(date);
        return formate;
    }
//    字符串转换成日期
    public static Date StrToDate(String str,String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(str);
        return date;
    }
}
