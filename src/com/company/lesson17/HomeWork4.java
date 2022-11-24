package com.company.lesson17;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("привет");
        list.add("дела");
        list.add("как");
        list.add("день");

        list.add("ночь");
        System.out.println(list);


        System.out.println(fix(list));








    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> res = new ArrayList<>();

        for (String s : list) {
            if (s.contains("р")){

            }
            else if (s.contains("л")){
                res.add(s);
                res.add(s);
            }
            else if(s.contains("л") && s.contains("р")){
                res.add(s);
            }
            else {
                res.add(s);
            }
    }
        return res;


    }
    }









