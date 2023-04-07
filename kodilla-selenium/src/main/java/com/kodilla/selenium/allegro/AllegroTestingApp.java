package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/tomaszkisiel/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement electronicsCategory = driver.findElement(By.xpath("//div[@class=\"mp7g_oh mr3m_1 s4kyg\" and @align=\"/kategorie\"]"));
        Select optionValue = new Select(electronicsCategory);
        optionValue.selectByIndex(3);


        WebElement inputField = driver.findElement(By.xpath("//div[contains@align=\"szukasz?\""));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
