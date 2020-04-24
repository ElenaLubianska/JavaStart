package com.javaStart.Task6Level1c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a height");
        int height = sc.nextInt();

        System.out.println("enter a width");
        int width = sc.nextInt();
        rectangle(height, width);
        sc.close();
    }

    static void rectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}