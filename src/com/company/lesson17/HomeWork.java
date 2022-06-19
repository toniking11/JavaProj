package com.company.lesson17;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(res(fill(new ArrayList())));
        System.out.println(res(fill(new LinkedList())));

    }

    public static List fill(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long res(List list) {
        Date startTime = new Date();
        set(list);
        Date finishTime = new Date();
        long res = finishTime.getTime() - startTime.getTime();

        return res;
    }

    public static void set(List list) {

        for (int i = 0; i <list.size() ; i++) {
            list.remove(5);
        }
    }


}
