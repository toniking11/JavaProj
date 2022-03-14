package com.company.lesson10.lesson1010;

public class Fish {

    private String name;
    private int age;
    private Woman owner;

    public Fish(String name, int age, Woman owner) {
        this.owner = owner;

    }
    public Woman getOwner() {
        return owner;
    }
}
