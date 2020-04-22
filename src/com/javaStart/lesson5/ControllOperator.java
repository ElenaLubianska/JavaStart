package com.javaStart.lesson5;

public class ControllOperator {
    int a = 10, b = 8;
    boolean value = true;

    public void foo(){
        if(value){
            System.out.println(b);
        } else{
            a++;
            System.out.println(a);
        }
    }
}
