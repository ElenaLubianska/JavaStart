package com.javaStart.Task6Level1b;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 3.5;
        String c = "The sum is ";
        System.out.println(concat(a, b, c));
    }

    static String concat(int a, double b, String c){
        double sum = a + b;
        return c + sum;
    }
}
