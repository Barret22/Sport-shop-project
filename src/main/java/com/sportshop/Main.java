package com.sportshop;

import com.sportshop.model.Order;
import com.sportshop.model.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        Order orderA = new OrderBuilder()
                .setTShirt("Червона")
                .setCap("Біла")
                .build();

        Order orderB = new OrderBuilder()
                .setTShirt("Синя")
                .setCap("Чорна")
                .build();

        orderA.printOrder("A");
        orderB.printOrder("B");
    }
}
