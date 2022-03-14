package com.company.lesson10.lesson1010;

public class Main {
    public static void main(String[] args) {


    Robot anton = new Robot("anton", 27, 99);
    Robot andrey = new Robot("andrey", 26, 98);

        System.out.println(anton.fight(andrey));

        Woman woman = new Woman("lisa", 44);

        Cat cat = new Cat("cat", 22, woman );
        Dog dog = new Dog("dog", 33, woman);
        Fish fish = new Fish("Fish", 44, woman);

        System.out.println( fish.getOwner().getName());


        Man man = new Man("alex", 22);
        Womann womann = new Womann("lola", 33);

        man.setWife(womann);
        womann.setHusband(man);

        System.out.println(man.getWife().getName());

    }
}
