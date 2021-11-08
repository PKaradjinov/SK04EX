package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
    private WebElement registerButton;
    private WebElement usernameField;
    private WebElement emailField;
    private WebElement dateField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement publicInfoField;
    private WebElement signInButton;
    private WebDriver driver;

    private By usernameFieldLocator = By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[1]/input");
    private By emailFieldLocator = By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[2]/input");
    private By dateFieldLocator = By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[3]/input");
    private By passwordFieldLocator = By.xpath("//*[@id=\"defaultRegisterFormPassword\"]");
    private By confirmPasswordFieldLocator = By.xpath("//*[@id=\"defaultRegisterPhonePassword\"]");
    private By publicInfoFieldLocator = By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[6]/textarea");
    private By signInButtonLocator = By.xpath("//*[@id=\"sign-in-button\"]");

    Register(WebDriver driver){
        this.driver = driver;
    }
//    WebElement getRegisterButton() {
//        registerButton = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a"));
//        return registerButton;
//        }
            WebElement getUsername(){
            usernameField = driver.findElement(usernameFieldLocator);
            return usernameField;
        }
            WebElement getEmail(){
            emailField = driver.findElement(emailFieldLocator);
            return emailField;
            }
            WebElement getDate(){
            dateField = driver.findElement(dateFieldLocator);
            return dateField;
            }

            WebElement getPassword(){
            passwordField = driver.findElement(passwordFieldLocator);
            return passwordField;
        }
            WebElement getConfirmPassword(){
            confirmPasswordField = driver.findElement(confirmPasswordFieldLocator);
            return confirmPasswordField;
        }
            WebElement getPublicInfo(){
            publicInfoField = driver.findElement(publicInfoFieldLocator);
            return publicInfoField;
        }
            WebElement registerButton(){
            registerButton = driver.findElement(publicInfoFieldLocator);
            return registerButton;
        }
            WebElement signInButton(){
            signInButton = driver.findElement(signInButtonLocator);
            return signInButton;
        }
            void fillUsername(String value) {
            getUsername().sendKeys(value);
        }
            void fillEmail(String value) {
            getEmail().sendKeys(value);
        }
            void fillDate(String value) {
            getDate().sendKeys(value);
        }
            void fillPassword(String value){
            getPassword().sendKeys(value);
        }
            void fillConfirmPassword(String value) {
            getConfirmPassword().sendKeys(value);
        }
            void fillPublicInfo(String value) {
            getPublicInfo().sendKeys(value);
        }
//        Register  clickRegister(){
//        registerButton().click();
//        Register rg = new Register(driver);
//        return rg;
//    }
        HomePage  clickSignIn(){
            signInButton().click();
            HomePage hp = new HomePage(driver);
            return hp;
        }
    }


