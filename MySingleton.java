package com.example.lesson26;

public class MySingleton {
    /*
    HOW TO CREATE
    The simplest form
    1. Define a static instance of itself inside the class, initialize it as null
    2. Make the constructor private
    3. Define  getInstance method, call the constructor if the inner instance is null
     */
    private static MySingleton innerInstance = null;

    private MySingleton() {

    }

    public static synchronized MySingleton getInnerInstance() {
        if (innerInstance == null) {
            innerInstance = new MySingleton();
        }
        return innerInstance;
    }
}
