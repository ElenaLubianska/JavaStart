package com.javaStart.Task5Level1d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        //System.out.println(str);
        int num = 0;

        char [] letters = str.toCharArray();
        for(int i = 0; i < letters.length; i++ ){
            if(letters [i] == 'b') num += 1;
        }
        System.out.println(num);
        sc.close();
    }
}
