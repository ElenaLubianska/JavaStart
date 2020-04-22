package com.javaStart.lesson9;

public class Main {
    public static void main(String[] args) {
        Wings wings = new Wings();
        Wings w = new Wings();
        wings.setColor("red");
        w.setColor("black");
        Ostrich ostrich = new Ostrich("op",wings);
        Crow crow = new Crow("kar",w);


        ostrich.walk();
        ostrich.hideHead();
        crow.fly();
        System.out.println(ostrich);

       }

}
