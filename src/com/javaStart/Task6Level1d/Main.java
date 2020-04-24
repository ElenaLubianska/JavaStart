package com.javaStart.Task6Level1d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[] { 5, 10, 8, 56, 89};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int element = sc.nextInt();
        System.out.println(findElement(arr, element));
        sc.close();
    }
    static int findElement(int [] arr, int element){
        for(int i = 0; i <= arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;

        }
    }

