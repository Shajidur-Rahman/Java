package com.company;

import java.util.Calendar;

public class java_15_ch_98_vi_01_pr {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());
    }
}
