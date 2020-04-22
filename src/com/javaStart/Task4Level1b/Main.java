package com.javaStart.Task4Level1b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        long factorial = 1L;
       if (4 < n && n < 16){
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
                System.out.println("" + n + "!=" + factorial);
            }
        } else {
           System.out.println("wrong input");
       }
       sc.close();
    }

}
