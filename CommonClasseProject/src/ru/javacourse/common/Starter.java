package ru.javacourse.common;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Starter
{
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        DateFormat sdf = DateFormat.getDateInstance(DateFormat.FULL, new Locale("en"));
        String df =sdf.format(d);
        System.out.println(df);

        Calendar calen = Calendar.getInstance();
        calen.add(Calendar.HOUR, -5);
        System.out.println(calen.getTime());
        calen.get(Calendar.YEAR);
    }
}
