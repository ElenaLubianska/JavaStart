package com.javaStart.Task5Level1c;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[15];
        for (int i = 0; i < arr.length; i++){
            arr [i] = (int) (Math.random()*100);
        }
        int [] arr2 = new int [arr.length * 2] ;
        for( int i = 0; i < arr2.length; i++){
            if( i < arr.length){
                arr2[i] = arr[i];
            } else {
                arr2[i] = 2 * arr [i - arr.length];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
