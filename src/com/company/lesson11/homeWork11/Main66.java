package com.company.lesson11.homeWork11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main66 {

    public static void main(String[] args) throws IOException {




        System.out.println(initializeArray());

    }


    public static int initializeArray() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        int r = max(arr);
        return r;

    }

    public static int max(int[] array) throws IOException {

        Arrays.sort(array);
        return array[array.length - 1];



    }







}
