package com.hillel.homework.lesson11;

import java.util.Random;
import java.util.random.RandomGenerator;

abstract class BaseGenPW {
    public abstract char getNextChar();// абстрактний метод для подальшого перевизначення
    public abstract boolean isValid(String password);//абстрактний метод для подальшої валідації

    public String generate(int size) {
        String password;
        do {
            StringBuilder sb = new StringBuilder(size);
            for (int i = 0; i < size; i++) {
                sb.append(getNextChar());
            }
            password = sb.toString();
        } while (!isValid(password));
        return password;
    }
}

