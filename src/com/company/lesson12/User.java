package com.company.lesson12;

public class User {

    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {


        return "My name is " + name + " my age is " + age;
    }
}
