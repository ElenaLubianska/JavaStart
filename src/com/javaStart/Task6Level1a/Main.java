package com.javaStart.Task6Level1a;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{-25, 5, 800, 4, 6, 32, 7, 21};

        System.out.println(maxNumber(arr));
    }
    static int maxNumber(int [] arr){
        int max = arr [0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
