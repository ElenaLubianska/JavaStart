package com.javaStart.lesson10;

public class Birds {
    private String name;

    public void walk(){

        System.out.println("la-la-la");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                '}';
    }
}
