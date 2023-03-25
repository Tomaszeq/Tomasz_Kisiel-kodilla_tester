package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ShoppingList {
    public static Set<Order> getOrders() {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order(1.999, LocalDate.of(2023, 03, 01), "user01"));
        orders.add(new Order(2.999, LocalDate.of(2023, 03, 02), "user02"));
        orders.add(new Order(3.999, LocalDate.of(2023, 03, 03), "user03"));
        orders.add(new Order(4.999, LocalDate.of(2023, 03, 04), "user04"));
        orders.add(new Order(5.999, LocalDate.of(2023, 03, 05), "user05"));
        orders.add(new Order(2.999, LocalDate.of(2023, 03, 02), "user02"));
        orders.add(new Order(5.999, LocalDate.of(2023, 03, 06), "user06"));
        orders.add(new Order(0.0, LocalDate.of(2023, 03, 07), "user00"));

        System.out.println(orders.size());
        for (Order order : orders)
            System.out.println(order);
        return orders;
    }
    public static Set<Order> getUniqueOrders(Set<Order> orders) {
        Set<Order> uniqueOrders = new HashSet<>();
        Set<String> orderSignatures = new HashSet<>();

        for (Order order : orders) {
            String signature = order.getOrderValue() + "-" + order.getOrderDate() + "-" + order.getUserLogin();
            if (!orderSignatures.contains(signature)) {
                uniqueOrders.add(order);
                orderSignatures.add(signature);
            }
        }

        return uniqueOrders;
    }
}
