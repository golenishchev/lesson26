package com.example.lesson26;

public class Singleton {
    private static volatile Singleton innerInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (innerInstance == null) {
            synchronized (Singleton.class) {
                if (innerInstance == null) {
                    innerInstance = new Singleton();
                }
            }
        }
        return innerInstance;
    }
}
