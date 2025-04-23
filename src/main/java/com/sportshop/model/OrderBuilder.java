package com.sportshop.model;

public class OrderBuilder {
    private TShirt tshirt;
    private Cap cap;

    public OrderBuilder setTShirt(String color) {
        this.tshirt = new TShirt(color);
        return this;
    }

    public OrderBuilder setCap(String color) {
        this.cap = new Cap(color);
        return this;
    }

    public Order build() {
        return new Order(tshirt, cap);
    }
}
