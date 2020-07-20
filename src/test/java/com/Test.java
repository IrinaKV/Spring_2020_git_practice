package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test {

        WebDriver driver;
        @BeforeMethod
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://google.com");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        @org.testng.annotations.Test
        public void test1() {
            Assert.assertEquals(driver.getTitle(), "Google","You are on a wrong page");
        }
        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }

