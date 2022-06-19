package com.company.lesson17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Date date = new Date();
//        long ms = 1000 * 60 * 60 * 24;
//        System.out.println(date.getTime()/ms/365);

        LocalDate date = LocalDate.now();
        System.out.println(date);



    }
}
