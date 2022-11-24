package com.company.lesson17;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println (deference((fill(new ArrayList<>()))));
        System.out.println (deference((fill(new LinkedList<>()))));

    }

    public static List fill(List list) {
        for (int i = 0; i < 1000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long deference(List list) {
        Date start = new Date();
        remove(list);
        Date finish = new Date();
        long res = finish.getTime() - start.getTime();
        return res;
    }

    public static void remove(List list) {
        for (int i = 0; i < 10000; i++) {
            list.set(500, 5);
        }
    }


}
