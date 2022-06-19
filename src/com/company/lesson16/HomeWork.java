package com.company.lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        List<Integer> list = new ArrayList<>();
//        list.add(Integer.parseInt(reader.readLine()));
//        list.add(Integer.parseInt(reader.readLine()));
//        list.add(Integer.parseInt(reader.readLine()));
//        list.add(Integer.parseInt(reader.readLine()));
//        list.add(Integer.parseInt(reader.readLine()));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


//        List<Integer> list2 = new ArrayList<>();
//
//        int i = 0;
//        while (i < i+1) {
//            String str = reader.readLine();
//            if (!str.isEmpty() ) {
//                list2.add(Integer.parseInt(str));
//            }else break;
//            i++;
//        }
//        System.out.println(list2);


//        List<Integer> list3 = new ArrayList<>();
//
//        int i = 0;
//        while (i < 5) {
//            int t = Integer.parseInt(reader.readLine());
//            if (t % 2 == 0) {
//                list3.add(t);
//            } else {
//                list3.add(0, t);
//            }
//            i++;
//        }
//        System.out.println(list3);

//        List<Integer> list4 = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            list4.add(Integer.parseInt(reader.readLine()));
//        }
//
//        for (int i = 0; i < list4.size(); i++) {
//            if (list4.get(i) < 5) {
//                System.out.println(list4.get(i));
//            } else list4.remove(i);
//        }

//        List<Integer> list5 = new ArrayList<>();
//        List<Integer> list52 = new ArrayList<>();
//        List<Integer> list51 = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            list5.add(Integer.parseInt(reader.readLine()));
//        }
//
//        for (int i = 0; i < list5.size(); i++) {
//            if (list5.get(i) % 2 == 0) {
//                list52.add(list5.get(i));
//            } else list51.add(list5.get(i));
//        }
//
//        System.out.println(list52);
//        System.out.println(list51);


//        List<String> list6 = new ArrayList<>();
//        List<Integer> howLong = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list6.add(reader.readLine());
//        }
//        for (int i = 0; i < list6.size(); i++) {
//            howLong.add(list6.get(i).length());
//        }
//        Collections.sort(howLong);
//        for (int i = 0; i < list6.size(); i++) {
//            if (list6.get(i).length() == howLong.get(list6.size() - 1)) {
//                System.out.println("max string is - " + list6.get(i) + " have " + howLong.get(list6.size() - 1) + " elements");
//            }
//        }


//        List<String> list7 = new ArrayList<>();
//        List<Integer> min = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            list7.add(reader.readLine());
//        }
//        for (int i = 0; i < list7.size(); i++) {
//            min.add(list7.get(i).length());
//        }
//        Collections.sort(min);
//        System.out.println(min.get(0));


        List<Integer> list8 = new ArrayList<>();
        List<Integer> list82 = new ArrayList<>();
        List<Integer> list83 = new ArrayList<>();
        List<Integer> listAnother = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list8.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list8.size(); i++) {
            if (list8.get(i) % 2 == 0) {
                list82.add(list8.get(i));
            }
        }

        for (int i = 0; i < list8.size(); i++) {
            if (list8.get(i) % 3 == 0) {
                list83.add(list8.get(i));
            }
        }
        for (int i = 0; i < list8.size(); i++) {
            if (list8.get(i) % 2 != 0 && list8.get(i) != 0) {
                listAnother.add(list8.get(i));
            }
        }

        printList(list83);
        System.out.println();
        printList(list82);
        System.out.println();
        printList(listAnother);


     


    }





    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}



