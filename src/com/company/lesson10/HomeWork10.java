package com.company.lesson10;

public class HomeWork10 {
    public static void main(String[] args) {


        Robot anton = new Robot("anton", 27, 99);
        Robot andrey = new Robot("andrey", 26, 98);


        System.out.println(anton.fight(andrey));

        Woman woman = new Woman("Lina");


        Cat cat = new Cat(woman);
        Dog dog = new Dog(woman);
        Fish fish = new Fish(woman);

        System.out.println(cat.getOwner().getName());



        Man man = new Man("alex",22);

        Woman1 woman1 = new Woman1("Sara", 22);


        man.setWife(woman1);
        woman1.setHusband(man);



        System.out.println(woman1.getHusband().getName());

    }
}




