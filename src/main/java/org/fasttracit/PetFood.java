package org.fasttracit;

import java.time.LocalDate;

public class PetFood {
    String name;
    double price;
    double amountOFFood;
    int expirationDate;
    boolean isInStock;


    public PetFood(String name, double price, double amountOFFood, int expirationDate, boolean isInStock) {
        this.name = name;
        this.price = price;
        this.amountOFFood = amountOFFood;
        this.expirationDate = expirationDate;
        this.isInStock = isInStock;
    }
}


