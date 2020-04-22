package com.javaStart.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Triangle tr1 = new Triangle();
        tr1.area();*/

        Scanner sc = new Scanner(System.in);
        double r;

        System.out.println("enter a radius r");
        r = sc.nextDouble();
        double p = 2.0 * Math.PI * r;
        System.out.println("perimeter is " + Math.round(p));
    }
}
