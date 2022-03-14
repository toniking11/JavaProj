package com.company.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write you age");
        int age = Integer.parseInt(reader.readLine());

        // > <
        if (age>=18){

            System.out.println("yes");
        } else  {
            System.out.println("no");
        }

    }

}
