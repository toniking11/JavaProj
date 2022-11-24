package com.company.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        list.remove(2);
        System.out.println(list);

        for (int i = list.size() -1 ; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }

    }
}
