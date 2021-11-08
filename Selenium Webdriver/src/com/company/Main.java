package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main extends BaseClass{

@Test
    void loginWithValidCredentials() throws InterruptedException {
    driver.get("http://training.skillo-bg.com:4300");
    Header header = new Header(driver);
    Thread.sleep(3000);
    LoginForm login = header.clickLoginLink();
    header.getLoginLink().click();
    Thread.sleep(3000);
    login.fillUsername("Julieta1");
    login.fillPassword("Skillo1");
    login.clickRememberMe();
    Thread.sleep(3000);
    HomePage hpmePage = login.clickSignIn();


}
    @Test
    public  void loginWithInalidCredentials() throws InterruptedException {

        WebElement login = driver.findElement(By.xpath("//*[@id=\"nav-link-login\"]"));
        login.click();
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"defaultLoginFormUsername\"]"));
        username.sendKeys("Juliedasdasdta1");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"defaultLoginFormPassword\"]"));
        password.sendKeys("Skiaasadllo1");

        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"sign-in-button\"]"));
        signIn.click();
    }
    }


