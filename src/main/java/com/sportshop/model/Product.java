package com.sportshop.model;

public abstract class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }

    public void printDetails() {
        System.out.println(name + " | Виробник: " + brand + " | Ціна: " + price + " грн");
    }
}
