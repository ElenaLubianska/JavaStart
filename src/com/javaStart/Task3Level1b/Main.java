package com.javaStart.Task3Level1b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int floor;
        int flat;
        int access;

        Scanner sc = new Scanner(System.in);
        System.out.println("input a number flat");
        flat = sc.nextInt();


        if (flat > 0 && flat <= 4 * 5 * 5) {
            access = (flat - 1) / 20 + 1;
            flat = flat - 20 * (access - 1);
            floor = (flat - 1) / 4 + 1  ;
            System.out.println("Access - " + access);
            System.out.println("Floor - " + floor);
        } else {
            System.out.println("There is no such apartment");
        }
        sc.close();

    }

}


