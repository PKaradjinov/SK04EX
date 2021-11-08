package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginForm {

    private WebElement usernameField;
    private WebElement passwordField;
    private WebElement rememberMeCheckbox;
    private WebElement signInButton;
    private WebDriver driver;

    private By usernameFieldLocator = By.xpath("//*[@id=\"defaultLoginFormUsername\"]");
    private By passwordFieldLocator = By.xpath("//*[@id=\"defaultLoginFormPassword\"]");
    private By rememberMeLocator = By.xpath("/html/body/app-root/div[2]/app-login/div/div/form/div/input");
    private By signInButtonLocator = By.xpath("//*[@id=\"sign-in-button\"]");

    LoginForm(WebDriver driver) {
        this.driver = driver;
    }
    WebElement baseUrl(){
        WebElement login = driver.findElement(By.xpath("//*[@id=\"nav-link-login\"]"));
        return baseUrl();
    }

    WebElement getUsername(){
        usernameField = driver.findElement(usernameFieldLocator);
        return usernameField;
    }
    WebElement getPassword(){
        passwordField = driver.findElement(passwordFieldLocator);
        return passwordField;

    }

    WebElement getRememberMeCheckbox(){
        rememberMeCheckbox = driver.findElement(rememberMeLocator);
        return rememberMeCheckbox;
    }
    WebElement signInButton(){
        signInButton = driver.findElement(signInButtonLocator);
        return signInButton;
    }

    void fillUsername(String value) {
       getUsername().sendKeys(value);

    }
    void fillPassword(String value){
        getPassword().sendKeys(value);
    }

    void  clickRememberMe(){
        getRememberMeCheckbox().click();
  }

    HomePage  clickSignIn(){
        signInButton().click();
        HomePage hp = new HomePage(driver);
        return hp;
    }
}





