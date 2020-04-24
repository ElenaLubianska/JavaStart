package com.javaStart.Task6Level1e;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(sumWords(str));
        sc.close();
    }
    static int sumWords(String str){
        String [] text = str.split("[ ,!.?]");
        return text.length ;
    }
}
