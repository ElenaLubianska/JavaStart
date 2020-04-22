package com.javaStart.lesson7;

public class Main {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setA(10);
        en.setB(52);
        System.out.println(en.showResult());
        en.setA(25);
        System.out.println(en.getA());
    }
}
