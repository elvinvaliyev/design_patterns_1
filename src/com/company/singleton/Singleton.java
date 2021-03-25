package com.company.singleton;

public class Singleton {
    //the object of Singleton class
    private static Singleton instance = new Singleton();

    //private constructor which don't allow to create new object of class
    private Singleton() {
    }

    //method which return instance object
    public static Singleton getInstance() {
        return instance;
    }

    //you can create other methods too
    public void messageFromSingleton() {
        System.out.println("Hello, it is me!");
    }

}
