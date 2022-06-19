package com.company.lesson17;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
//        Date today = new Date();
//        System.out.println(today.getTime());
//        long msDay = 24 * 60 * 60 * 1000;
//        System.out.println(today.getTime() / msDay / 365);

        Date currentTime = new Date();
        Thread.sleep(1000);
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        System.out.println(delay);

    }


}
