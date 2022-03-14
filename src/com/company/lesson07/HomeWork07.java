package com.company.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String num1 = reader.readLine();
        int s1 = Integer.parseInt(num1);

        String num2 = reader.readLine();
        int s2 = Integer.parseInt(num1);

        System.out.println(name + " будет получать $a" + num1 + " через " + num2+" лет.");




    }


}
