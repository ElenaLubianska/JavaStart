package com.javaStart.Task3Level1d;

public class Main {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 3.5;
        double c = 0.4;

        if((a + b > c) && (b + c > a) && (a + c > b)){
            System.out.println("triangle is exist");
        } else {
            System.out.println("triangle is not exist");
        }
    }
}
