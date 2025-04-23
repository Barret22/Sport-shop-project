package com.sportshop.model;

public class Order {
    private Product tshirt;
    private Product cap;

    public Order(Product tshirt, Product cap) {
        this.tshirt = tshirt;
        this.cap = cap;
    }

    public void printOrder(String orderName) {
        System.out.println("Замовлення " + orderName + ":");
        tshirt.printDetails();
        cap.printDetails();
        double total = tshirt.getPrice() + cap.getPrice();
        System.out.println("Загальна вартість: " + total + " грн\n");
    }
}
