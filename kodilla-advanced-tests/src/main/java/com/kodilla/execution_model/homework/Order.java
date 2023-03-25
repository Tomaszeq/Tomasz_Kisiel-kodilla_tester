package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String userLogin;

    public Order(double orderValue, LocalDate orderDate, String userLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}