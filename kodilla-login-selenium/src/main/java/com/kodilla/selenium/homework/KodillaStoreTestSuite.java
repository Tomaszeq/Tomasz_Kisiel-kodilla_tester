package com.kodilla.selenium.homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreTestSuite {

    private WebDriver driver;

    @Before
    public void initTests() {
        System.setProperty("webdriver.chrome.driver", "/Users/tomaszkisiel/Documents/Development/Kodilla/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchByNotebook() {
        KodillaStore store = new KodillaStore(driver);
        store.search("Notebook");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(5, resultsCount);
    }

    @Test
    public void testSearchBySchool() {
        KodillaStore store = new KodillaStore(driver);
        store.search("School");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(1, resultsCount);
    }

    @Test
    public void testSearchByBrand() {
        KodillaStore store = new KodillaStore(driver);
        store.search("Brand");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(1, resultsCount);
    }

    @Test
    public void testSearchByBusiness() {
        KodillaStore store = new KodillaStore(driver);
        store.search("Business");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(0, resultsCount);
    }

    @Test
    public void testSearchByGaming() {
        KodillaStore store = new KodillaStore(driver);
        store.search("Gaming");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(1, resultsCount);
    }

    @Test
    public void testSearchByPowerful() {
        KodillaStore store = new KodillaStore(driver);
        store.search("Powerful");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(0, resultsCount);
    }

    @Test
    public void testSearchByUppercaseNotebook() {
        KodillaStore store = new KodillaStore(driver);
        store.search("NOTEBOOK");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(2, resultsCount);
    }

    @Test
    public void testSearchByLowercaseNotebook() {
        KodillaStore store = new KodillaStore(driver);
        store.search("notebook");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(2, resultsCount);
    }

    @Test
    public void testSearchByMixedcaseNotebook() {
        KodillaStore store = new KodillaStore(driver);
        store.search("NoTeBoOk");
        int resultsCount = store.getResultsCount();
        Assert.assertEquals(2, resultsCount);
    }
}