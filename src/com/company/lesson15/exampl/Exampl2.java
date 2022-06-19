package com.company.lesson15.exampl;

public class Exampl2<T> {
    private T instance;

    private Exampl2() {

    }



    public static <T> void simpleInit(T instantiator) {
        T obj;

    }

    public static <T> Exampl2<T> init(T instantiator) {
        return new Exampl2<>();
    }


    public void set(T obj) {
        this.instance = obj;
    }

    public T getInstance() {
        return instance;
    }
}


