package com.company.lesson12.homeWork;

public class Human {

    private String name;
    private Boolean sex;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, Boolean female, int age, Human father, Human mother) {

        this.name = name;
        this.sex = female;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, Boolean female, int age) {

        this.name = name;
        this.sex = female;
        this.age = age;

    }


    public  String sex () {

        if (sex) {
            return "man";

        }
        else {
            return "woman";
        }

    }




    public String getFatherName() {
        if (father == null) {

            return "";



        } else
            return "\n my father " + father.name;
    }


    public String getMotherName() {
        if (mother == null) {

            return "";



        } else
            return "\n my mother " + mother.name;
    }






        @Override
        public String toString () {


            return "my name is " + name + "\n my sex " + sex().toUpperCase() + "\n my age " + age + getFatherName() + getMotherName();
        }



}
