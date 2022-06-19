package com.company.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();  /* Integer[] arr = new Integer[5];*/

        list.add(5);
        list.add(7);
        list.add(1, 2);
        list.set(0, 1);
        System.out.println(list.get(0));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
