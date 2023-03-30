package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public List<Order> findOrdersFromDatesRange(LocalDate dateFrom, LocalDate dateTo) {
        return orders.stream()
                .filter(order -> order.getDate().isBefore(dateTo.plusDays(1)) && order.getDate().isAfter(dateFrom.minusDays(1)))
                .toList();
    }

    public List<Order> findOrdersFromValuesRange(double valueFrom, double valueTo) {
        return orders.stream()
                .filter(order -> order.getPrice() * order.getQuantity() >= valueFrom)
                .filter(order -> order.getPrice() * order.getQuantity() <= valueTo)
                .toList();
    }

    public double calculateValueOfOrders() {
        return orders.stream()
                .mapToDouble(order -> order.getPrice() * order.getQuantity())
                .sum();
    }
}