package com.company.lesson10;

public class Man {

    private String name;
    private int age;
    private Woman1 wife;


    public Man(String name, int age) {

        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public Woman1 getWife(){
        return wife;
    }

    public int getAge(){
        return age;
    }

    public void setWife(Woman1 wife) {
        this.wife = wife;
    }


}
