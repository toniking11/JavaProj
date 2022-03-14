package com.company.lesson10;

public class Dog {

    private String name;
    private int age;
    private Woman owner;


    public Dog(Woman owner) {

        this.owner = owner;
    }

    public Woman getOwner() {

        return owner;
    }
}
