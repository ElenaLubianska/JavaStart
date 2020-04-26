package com.javaStart.lesson10;

public class Main {
    public static void main(String[] args) {
        Birds ostrich2 = new Ostrich();

        Birds crow = new Crow();

        Test test = new Test();

        test.foo(ostrich2);
        test.foo(crow);

    }
}
