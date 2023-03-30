package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String product;
    private int quantity;
    private LocalDate date;
    private double price;

    public Order(String product, int quantity, LocalDate date, double price) {
        this.product = product;
        this.quantity = quantity;
        this.date = date;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Double.compare(order.price, price) == 0 && Objects.equals(product, order.product) && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity, date, price);
    }
}
