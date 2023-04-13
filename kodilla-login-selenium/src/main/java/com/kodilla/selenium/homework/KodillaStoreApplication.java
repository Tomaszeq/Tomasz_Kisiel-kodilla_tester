package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tomaszkisiel/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStore storePom = new KodillaStore(driver);
        storePom.search("Notebook");
    }
}