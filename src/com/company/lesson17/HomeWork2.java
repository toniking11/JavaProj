package com.company.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());

        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(list.get(4));
            list.remove(5);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
