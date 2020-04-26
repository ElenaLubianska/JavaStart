package com.javaStart.lesson10;

public class Crow extends Birds{

    public void fly()
    {
        System.out.println("I'm crow and I can fly");

    }

    @Override
    public void walk() {
        System.out.println("I'm crow");
    }
}
