package com.hillel.homework.lesson15;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return celsius*1.8+32.0;
    }
}
