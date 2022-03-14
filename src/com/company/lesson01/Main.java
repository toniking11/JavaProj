package com.company.lesson01;

public class Main {


    public static void main(String[] args) {

        byte b = 33;
        short s = 1111;
        char c = 'f';
        int i = 1111009;
        long l = 29038949090L;
        boolean bool = true;
        float f = 3434.4F;
        double d = 89887.44444;
        String str = "dddd";
        System.out.println(str);

        System.out.println(d);
        int res = sum(10, 15);


        System.out.println(res);


        System.out.println(convert("vanya"));

        twotimes("antonhier");
    }


    public static int sum(int a, int b) {
        int res = a + b;

        return res;

    }
    private static String convert (String str) {

        String res = str + "lox";
        return res;
    }


    public static void twotimes (String str){
        System.out.println(str);
        System.out.println(str);
    }


}
