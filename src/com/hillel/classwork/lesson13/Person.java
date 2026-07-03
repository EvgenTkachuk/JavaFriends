package com.hillel.classwork.lesson13;

public class Person {

    public static final String DEFAULT_NAME = "Unknown";
    public static int COUNT;

    private final String name;
    private int age;

    public Person(int age){
        this.age = age;
        this.name = DEFAULT_NAME;
        COUNT++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        secretAction();
        COUNT++;
    }
    private void secretAction(){
        System.out.println(this.name + " secretAction");
        printCount();
    }

    public static void printCount() {
        System.out.println("count" + COUNT);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
