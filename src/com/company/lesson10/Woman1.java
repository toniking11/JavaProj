package com.company.lesson10;

public class Woman1 {

    private String name;
    private int age;
    private Man husband;

    public Woman1(String name, int age) {

        this.name = name;
        this.age = age;


    }

    public Man getHusband(){
        return husband;
    }

    public void setHusband( Man husband) {
        this.husband = husband;
    }



}
