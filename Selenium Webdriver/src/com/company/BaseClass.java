package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

    WebDriver driver;

    @BeforeMethod
    void runBeforeEveryTest() throws InterruptedException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver.get("http://training.skillo-bg.com:4300");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @AfterMethod
    void runAfterEveryTest() {
        driver.close();
    }
}

