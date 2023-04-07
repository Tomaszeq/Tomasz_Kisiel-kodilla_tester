package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tomaszkisiel/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement electronicsCategory = driver.findElement(By.cssSelector("div[data-box-name=\"categories container\"] button[data-role=\"filters-dropdown-toggle\"]"));
        Select optionValue = new Select(electronicsCategory);
        optionValue.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("input[type=\"search\"]"));
        inputField.sendKeys("mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> productsList = driver.findElements(By.cssSelector("section>article"));

        for (WebElement product : productsList) {
            System.out.println(product.getText());
        }

        driver.quit();
    }
}
