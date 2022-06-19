package com.company.lesson17;

import java.util.*;

public class TimeOfInsert {
    public static void main(String[] args) {
        System.out.println(different(fill(new ArrayList<>())));
        System.out.println(different(fill(new LinkedList<>())));

    }
    public static List<Object> fill (List<Object> list){
        for (int i = 0; i < 1000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long different(List<Object> list) {
        Date start = new Date();
        insert(list);
        Date finish = new Date();
        long res = finish.getTime() - start.getTime();
        return res;
    }

    public static void insert(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

    }
