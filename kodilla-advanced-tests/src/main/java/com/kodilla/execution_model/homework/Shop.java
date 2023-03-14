package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;
public class Shop {
    private Set<Order> orders = new HashSet<>();

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public Set<Order> getOrders() {
        return orders;
    }
}
