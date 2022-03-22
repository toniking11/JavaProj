package com.company.lesson12.homeWork;

import java.util.Arrays;

public class Е {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};

        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] != arr[j]) {
//                    System.out.println(arr[i]);
//                    break;
//                }
//                else break;
//
//            }
//            break;
//            }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int a = 1; a < arr.length; a++) {

                if (arr[i] == arr[a]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(arr[i]);
                break;
            }
            count = 0;
        }

        System.out.println();

        }








                }








