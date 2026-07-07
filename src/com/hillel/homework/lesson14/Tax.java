package com.hillel.homework.lesson14;

public class Tax {
    protected double S;
    protected static final double TAX_K = 0.2;//20%

    public Tax(double S) {
        this.S = S;
    }

    public double calculateTax() {
        return this.S * TAX_K;
    }
    @Override
    public String toString() {
        return "Tax{" + "S=" + S + '}';
    }
}
