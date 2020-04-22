package com.javaStart.lesson9;

public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public void walk(){
        System.out.println("la-la-la");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", wings=" + wings +
                '}';
    }
}
