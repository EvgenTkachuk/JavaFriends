package com.hillel.homework.lesson14;

import java.util.ArrayList;
import java.util.List;

public class TaxMain {
    public static void main(String[] args) {
        Residential home = new Residential(47);
        Residential home2 = new Residential(54);
        Commercial home3 = new Commercial(54, 100);
        Commercial home4 = new Commercial(54, 99);
        Industrial home5 = new Industrial(10000);
        Industrial home6 = new Industrial(100000);
        List<Tax> allPropertiesList = new ArrayList<>();
        allPropertiesList.add(home);
        allPropertiesList.add(home2);
        allPropertiesList.add(home3);
        allPropertiesList.add(home4);
        allPropertiesList.add(home5);
        allPropertiesList.add(home6);
        System.out.println("Розрахунок податку:");
        for (Tax building : allPropertiesList) {
            System.out.println("Tax for "+building.toString()+" = "+ String.format("%.1f",building.calculateTax())+ " грн");
        }
    }
}

