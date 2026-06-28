package com.hillel.classwork.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        PersonController.READER.readLine();
        Person person = new Person("Mariana", 18);
        System.out.println(person);
        System.out.println(Person.DEFAULT_NAME);
        System.out.println(person.getAge());
        System.out.println(person);

        System.out.println(person);

        Person person1 = new Person(23);
        System.out.println(person1);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person.getName());
        System.out.println(person.getAge());

        Person.printCount();
    }
}
