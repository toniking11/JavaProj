package com.company.lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[4];
        String[] str = new String[3];

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello1");
        list.add("hello3");
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);


        Map<Integer, String> map = new HashMap<>();
        map.put(2, "adk");
        map.put(2, "adk");
        map.put(3, "adk");
        System.out.println(map);

        

    }
}
