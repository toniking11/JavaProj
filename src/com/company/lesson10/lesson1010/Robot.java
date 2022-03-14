package com.company.lesson10.lesson1010;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {

        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean fight(Robot anotherRobot) {

        if (this.power < anotherRobot.getPower()) {
            return false;
        } else {
            return true;
        }
    }


}

