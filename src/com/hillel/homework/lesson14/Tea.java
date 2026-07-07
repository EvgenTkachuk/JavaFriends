package com.hillel.homework.lesson14;

public class Tea extends Drink {
    public Tea() {
        super(25);
    }

    @Override
    public String prepare() {
        return "Готуємо Чай\nПриємного чаювання!\n";
    }
    @Override
    public String toString(){
        return "Чай";
    }
}
