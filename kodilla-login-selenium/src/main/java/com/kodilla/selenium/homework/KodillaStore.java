package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class KodillaStore extends StoreAbstract {

    private WebDriver driver;

    public KodillaStore(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void search(String phrase) {
        WebElement searchField = driver.findElement(By.xpath("//input[@name=\"search\"]"));
        searchField.sendKeys(phrase);
    }

    public int getResultsCount() {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"elements-wrapper\"]/div"));
        return elements.size();
    }
}