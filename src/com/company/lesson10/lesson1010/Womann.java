package com.company.lesson10.lesson1010;

public class Womann {
    private String name;
    private int age;
    private Man husband;

    public Womann(String name, int age) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Man getHusband() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
