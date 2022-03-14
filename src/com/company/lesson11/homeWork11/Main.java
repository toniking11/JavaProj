package com.company.lesson11.homeWork11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = 10 - i;
            System.out.println(arr[i]);

        }

        for (int i = 0; i <arr.length ; i++) {

            arr[i] = i +10 ;
            System.out.println(arr[i]);

        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = 29 - i;
            System.out.println(arr[i]);

        }








    }
}
