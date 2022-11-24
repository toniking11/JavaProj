package com.company.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1,3);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
