package com.company.lesson10;

public class Fish {

    private String name;
    private int age;
    private Woman owner;

    public Fish(Woman owner) {
        this.owner = owner;

    }

    public Woman getOwner() {
        return owner;
    }
}
