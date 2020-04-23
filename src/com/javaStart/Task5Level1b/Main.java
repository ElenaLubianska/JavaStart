package com.javaStart.Task5Level1b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of mass");
        size = sc.nextInt();

        int [] arr = new int[size];
        for( int i = 0; i < arr.length; i++){
            System.out.println("enter a number of array with index [" + i + "] and press ENTER");
            arr [i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
