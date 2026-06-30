package com.hillel.classwork.lesson13;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private int strength;
    private boolean streetCat;

    public Cat(String name, int age, double weight, boolean streetCat) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.streetCat = streetCat;
        this.strength = getStrength(this.age, (int) this.weight, this.streetCat);
    }


    public Cat fight(Cat catOpponent) {
        if (this.strength > catOpponent.strength) {
            return this;
        }
        if (this.strength == catOpponent.strength) {
            if (this.weight > catOpponent.weight)
                return this;
        }
        if (this.weight == catOpponent.weight) {
            if (this.age < catOpponent.age)
                return this;
        }
        if (this.age == catOpponent.age) {
            if (this.streetCat && !catOpponent.streetCat)
                return this;

        }
        if (this.streetCat == catOpponent.streetCat) {
            return null;
        }
        return catOpponent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetCat() {
        if (streetCat) {
            return "\t\tStreet Cat";
        } else {
            return "\t\tHome's Cat";
        }
    }

    private int getStrength(int age, int weight, boolean streetCat) {
        double coef = age * weight;
        if (age > 2 && age < 5) {
            coef *= 1.5;
        }
        if (age <= 2) {
            coef /= 2;
        }
        if (age >= 5) {
            coef /= 2;
        }
        if (streetCat) {
            coef *= 2;
        }
        return (int) coef;
    }


    @Override
    public String toString() {
        return
                String.format("Name: %-10s Age: %-5d Weight: %-7.1f %-15s FightClass: %-5d",
                        name, age, weight, getStreetCat().trim(), strength);
    }
}
