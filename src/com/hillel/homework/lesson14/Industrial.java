package com.hillel.homework.lesson14;

public class Industrial extends Tax{
    public Industrial( int S) {
        super(S);
    }
    @Override
    public double calculateTax() {
        return super.calculateTax();
    }
    @Override
    public String toString() {
        return "Industrial build [" + "S=" + S + ']';
    }
}
