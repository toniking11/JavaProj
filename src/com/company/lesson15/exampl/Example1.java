package com.company.lesson15.exampl;

public class Example1<T> {
    private T instance;

    public T get() {
        return instance;
    }

    public void set(T obj) {
        instance = obj;
    }
}
