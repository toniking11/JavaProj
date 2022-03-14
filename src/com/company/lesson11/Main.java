package com.company.lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = new int[10];


        arr[0] = 22;
        arr[6] = 44;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = 9 - i;

        }


        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);

        }


        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }






        int[][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }








    }
}
