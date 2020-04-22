package com.javaStart.Task3Level1c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dayInYear = 0;
        System.out.println("enter a year");
        Scanner sc = new Scanner(System.in);
        dayInYear = sc.nextInt();

        if(dayInYear % 4 == 0 || dayInYear % 400 == 0){
            System.out.println( dayInYear + " year is a leap year");
        } else {
            System.out.println(dayInYear + " year is a not leap year");
        }
        sc.close();
    }
}
