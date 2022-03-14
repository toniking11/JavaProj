package com.company.lesson12;

public class Main {
    public static void main(String[] args) {

        User user = new User("anton", 27);
        User user1 = new User("andrey",26);

        System.out.println(user.toString());
        System.out.println(user1.toString());

        System.out.println(user.equals(user1));
    }


}
