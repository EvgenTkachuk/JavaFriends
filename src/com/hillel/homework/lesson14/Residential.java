package com.hillel.homework.lesson14;

public class Residential extends Tax {
    protected static final double SUBSIDES = 0.005;//0,5%

    public Residential(double S) {
        super(S);
    }

    @Override
    public double calculateTax() {
        double tax = super.calculateTax() ;
        return tax-(tax*SUBSIDES);
    }
    @Override
    public String toString() {
        return "Residential build [" + "S=" + S + ']';
    }
}
