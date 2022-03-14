package com.company.lesson10;

public class Cat {

    private String name;
    private int age;
    private Woman owner;

    public Cat(Woman owner) {

        this.owner = owner;
    }



    public Woman getOwner() {
        return owner;
    }
}
