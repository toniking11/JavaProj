package com.company.lesson11.homeWork11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        String str4 = reader.readLine();
        String str5 = reader.readLine();*/


        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
       }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }









    }
}
