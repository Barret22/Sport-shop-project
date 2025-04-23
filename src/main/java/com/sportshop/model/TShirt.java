package com.sportshop.model;

public class TShirt extends Product {
    public TShirt(String color) {
        this.name = color + " футболка";
        this.brand = "Active sports";
        this.price = 399.0;
    }
}
