package com.company.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       /* int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }


        Arrays.sort(arr);

        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }*/


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(array);

        System.out.println(" min - " +array[0]);
        System.out.println("max - " + array[4]);




    }
}
