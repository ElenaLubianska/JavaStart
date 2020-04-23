package com.javaStart.Task5Level1c;

import java.util.Arrays;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[15];
        for (int i = 0; i <=15; i++){
            arr [i] = r.nextInt(15);

        }
        System.out.println(Arrays.toString(arr));
    }
}
