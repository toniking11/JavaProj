package com.company.lesson08;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;
import static java.lang.Math.incrementExact;

public class HomeWork08 {
    public static void main(String[] args) throws IOException {
        System.out.println("vvedi 2 chisla");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        closeToFive(a,b);


    }


    private static void  closeToFive(int a, int b) {

       /* int aa = Math.abs(a - 5);
        int bb = Math.abs(b - 5);


        if (aa > bb) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }*/

        if (a- 5< b-5) {
        }


    }

    }


