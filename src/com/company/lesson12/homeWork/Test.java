package com.company.lesson12.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[5];
        String[] arrays = new String[5];
        int[] leg = new int[5];

        System.out.println("enter five lions");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("enter five string");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = reader.readLine();
            leg[i] = arrays[i].length();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+")");
            arr[i] =leg[i];
            System.out.println(arr[i]);
        }



        }


    }

