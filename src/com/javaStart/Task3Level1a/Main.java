package com.javaStart.Task3Level1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b , c, d;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.println("input a");
        a = sc1.nextInt();

        System.out.println("input b");
        b = sc2.nextInt();

        System.out.println("input c");
        c = sc3.nextInt();

        System.out.println("input d");
        d = sc4.nextInt();


        if(a > b && a > c && a > d){
            System.out.println(a);
        } else if(b > a && b > c && b > d){
            System.out.println(b);
        } else if(c > a && c > b && c > d){
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
