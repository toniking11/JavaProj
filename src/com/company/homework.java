package com.company;

public class homework {
    public static void main ( String [] args){

        int res = sum(10, 20);
        System.out.println(res);

        int multi = multy(5, 2);
        System.out.println(multi);

        int sub = subt(10, 7);
        System.out.println(sub);

        int divi = div(100, 4);
        System.out.println(divi);

        double con = convert(100);
        System.out.println(con);

        double per = persent(100);
        System.out.println(per);

        String print = print("hello");
        System.out.println(print);

        int tt = summ(10, 20);
        System.out.println(print("hello"));
    }


    private static int sum (int a, int b) {

        int res = a + b;
        return res;
    }

    private static int multy (int a, int b) {

        int multi = a * b;
        return multi;
    }

    private static int subt(int a, int b) {

        int sub = a - b;
        return sub;
    }

    private static int div(int a, int b) {

        int divi = a / b;
        return divi;


    }

    private static double convert(int a) {


        double con = a * 1.14;
        return con;
    }

    private static double persent (int a){

        double per = a + (a * 0.10);
        return per;
    }

    private static String print(String args) {

        String print = args + args + args + args;
        return print;
    }


    private static int summ (int a, int b) {
        int res = a + b;
        return res;
    }

    }

