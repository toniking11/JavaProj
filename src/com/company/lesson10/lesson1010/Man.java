package com.company.lesson10.lesson1010;

public class Man {
    private String name;
    private int age;
    private Womann wife;

    public Man(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Womann getWife() {
        return wife;
    }

    public void setWife(Womann wife) {
        this.wife = wife;
    }
}
