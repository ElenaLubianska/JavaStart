package com.javaStart.lesson2;

public class Main {
    public static void main(String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        ourBus.color = "red";
        firstBus.color = "black";
        secondBus.color = "grey";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }

}
