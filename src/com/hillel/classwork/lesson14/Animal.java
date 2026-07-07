package com.hillel.classwork.lesson14;

public class Animal {
    static final String DEFAULT_COLOR = "white";
    protected String color;
    public  Animal(String DEFAULT_COLOR){
        this.color = DEFAULT_COLOR;
    }
    public void speak(){
        System.out.println("I don't speak");
    }
}
