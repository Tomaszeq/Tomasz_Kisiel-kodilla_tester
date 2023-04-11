package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    WebDriver driver;

    public KodillaLoginPom() {
        System.setProperty("webdriver.chrome.driver", "/Users/tomaszkisiel/Documents/Development/Kodilla/chromedriver");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/login");

    }

    public boolean login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        String alertMessage = driver.switchTo().alert().getText();
        String message = alertMessage.replace(alertMessage.charAt(5), 's');
        driver.switchTo().alert().dismiss();
        return message.equals("Jestes teraz zalogowany!");
    }

    public void close() {
        driver.close();
    }
}