package com.company.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            list.add(reader.readLine());
        }
        System.out.println(list);

        System.out.println(doubleValues(list));

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        ArrayList<String> res = new ArrayList<>();

        for (String s : list) {
            res.add(s);
            res.add(s);
        }
        return res;
    }
}
