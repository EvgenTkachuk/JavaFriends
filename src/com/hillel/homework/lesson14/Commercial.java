package com.hillel.homework.lesson14;

public class Commercial extends Tax {
    private double salesRevenue;

    public Commercial(double S, double salesRevenue) {
        super(S);
        this.salesRevenue = salesRevenue;
    }

    @Override
    public double calculateTax() {
        if (salesRevenue < 100) {
            return 0.0;
        }
        return super.calculateTax();
    }
    @Override
    public String toString() {
        return "Commercial build [" + "S=" + S + ']';
    }
}
