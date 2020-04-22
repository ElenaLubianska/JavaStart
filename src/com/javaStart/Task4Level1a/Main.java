package com.javaStart.Task4Level1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of stripes");
        int a = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < a; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
            }

        sc.close();
        }

    }


