package com.javaStart.lesson9;

public class Crow extends Birds{

    public Crow(String name, Wings wings) {
    super(name, wings);
}
    public void fly(){
        System.out.println("I'm crow and I can fly");
    }


}
