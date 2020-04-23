package com.javaStart.Task5Level1a;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr [] = new int[] {0, 5, 8, 4, 6, 32, 7, 21};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

       int max = arr [0];
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max) max = arr[i];
       }
        System.out.println("maximum number in array " + max);

       int totalAllNumber = 0;
       for( int i = 0; i < arr.length; i++) {
           totalAllNumber = totalAllNumber + arr[i];
       }
           System.out.println("total array is " + totalAllNumber);

       int totalOddNumber = 0;
       for( int i = 0; i < arr.length; i++){
           if((i % 2) == 0) totalOddNumber += arr[i];

       }
        System.out.println("total odd number in array is " + totalOddNumber);
    }

}
