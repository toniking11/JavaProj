package com.company.lesson15;

import com.company.lesson15.exampl.Exampl2;
import com.company.lesson15.exampl.Example1;
import com.company.lesson15.model.BaseObject;
import com.company.lesson15.model.ChaildObject;
import com.company.lesson15.model.User;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();


        Example1<User> exampl1 = new Example1<>();
        System.out.println(exampl1.get());
        exampl1.set(new User("anton", 28));
        System.out.println(exampl1.get());

        Exampl2<User> exampl2 = Exampl2.init(new User());
        exampl2.set(new User("andrey", 23));
        System.out.println(exampl2.getInstance());

        List<BaseObject> list5 = new ArrayList<>();
        List<User> list6 = new ArrayList<>();
        List<ChaildObject> list7 = new ArrayList<>();

    }

    public static void example1(List<?> list) {
    }

    public static void example2(List<? extends User> list) {

    }
}
