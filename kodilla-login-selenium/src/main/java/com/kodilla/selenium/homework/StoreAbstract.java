package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;

public abstract class StoreAbstract {
    protected WebDriver driver;

    public StoreAbstract(WebDriver driver){
        this.driver = driver;
    }
}