package com.company.lesson11.homeWork11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
    public static void main(String[] args) throws IOException {


        initializeArray();

    }


    public static void initializeArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int arr[] = new int[4];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

        }


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]); }




    }
}
