package com.javaStart.lesson4;

public class Operation {
    Integer a = 3, b = 6, c;
    String str1 = "hot", str2 = "java", result;
    int x = 10, d = 20;

    public void foo(){

        a+= b;    //a=a+b
        c = a + b * a;
        result = str1 + str2;
        boolean w = 2 < 5;
        System.out.println(result);
        System.out.println(c);
        System.out.println(a);
        System.out.println(w);
        System.out.println(Math.min(a,b));
    }
}
