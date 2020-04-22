package com.javaStart.Task3Level2a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, x0 = 0, y0 = 0, r = 4;

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter x");
        x = sc.nextInt();

        System.out.println("enter y");
        y = sc.nextInt();

        if((Math.pow((x - x0), 2) + Math.pow((y - y0), 2)) <= Math.pow(r, 2)){
            System.out.println("this point in circle");
        } else {
            System.out.println("this point is not circle");
        }
        sc.close();
    }
}
