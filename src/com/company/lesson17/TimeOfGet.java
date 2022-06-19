package com.company.lesson17;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfGet {
    public static void main(String[] args) {
        System.out.println(getTime(fill(new ArrayList())));
        System.out.println(getTime(fill(new LinkedList())));



    }

    public static List fill(List list) {

        for (int i = 0; i < 1000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTime(List list) {
        Date timeStart = new Date();
        get1000(list);
        Date timeFinish = new Date();
        long difference = timeFinish.getTime() - timeStart.getTime();
        return difference;
    }

    public static void get1000(List list) {
        int x = list.size() / 2;
        for (int i = 0; i < list.size(); i++) {
            list.get(x);
        }
    }
}
