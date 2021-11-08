package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
    private WebDriver driver;
    private WebElement profileLink;
    private WebElement loginLink;

    Header(WebDriver driver){
        this.driver = driver;
    }
    WebElement getLoginLink() {
        loginLink = driver.findElement(By.xpath("//*[@id=\"nav-link-login\"]"));
        return loginLink;
    }
    WebElement getProfileLink() {
        profileLink = driver.findElement(By.id("nav-link-profile"));
        return profileLink;
    }
    LoginForm  clickLoginLink() {
        getLoginLink().click();
        LoginForm loginForm = new LoginForm(driver);
        return loginForm;
    }
}
