package com.javaStart.lesson8;

public class Main {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;
        for (Music element : Music.values()) {
            System.out.println(element);
        }
        Music mc2 = Music.valueOf(Music.class, "ROCK");
        System.out.println(mc.ordinal());

        System.out.println(mc2.getI());
        System.out.println(mc2.getName());


        mc.foo();
        mc2.foo();
    }
}