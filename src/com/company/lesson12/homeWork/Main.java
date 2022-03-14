package com.company.lesson12.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Human grandpa1 = new Human("alex", true, 66);
        Human grandpa2 = new Human("michal", true, 77);

        Human grandma1 = new Human("lora", false, 64);
        Human grandma2 = new Human("kelly", false, 74);

        Human father = new Human("max", true, 33, grandpa1, grandma1);
        Human mother = new Human("lisa", false, 32, grandpa2, grandma2);

        Human children1 = new Human("raphael", true, 11, father, mother);
        Human children2 = new Human("lolo", false, 12, father, mother);




        int[] arr = initializeArray();

        printArray(arr);


    }


    public static int[] initializeArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        System.out.println("vvedi 10 chisel");

        for (int i = 0; i < arr.length; i++) {
            if (i == 8) {
                break;
            }

            arr[i] = Integer.parseInt(reader.readLine());
        }

        return arr;

    }

    public static void printArray(int[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        for (int i = array.length ; i > 0 ; i--) {
            System.out.print(array[i - 1]);
        }




    }


}
