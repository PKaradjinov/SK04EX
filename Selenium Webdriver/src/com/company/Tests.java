package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseClass{

    @Test
    public  void getRealTitle() throws InterruptedException {

        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        //Actual result
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        //Expected result
        String expectedTitle = "ISkillo";
        Assert.assertEquals(title, expectedTitle);
        System.out.println("Test i completed");
    }
    @Test
    public  void titleVerification() throws InterruptedException {

        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        //Actual result
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        //Expected result
        String expectedTitle = "Abv bg";
        Assert.assertEquals(title, expectedTitle);
        System.out.println("Test i completed");
    }

    @Test
    public  void versionValidation() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        //Actual result
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        //Expected result
        String expectedTitle = "Version: 2020.3.2.4300";
        Assert.assertEquals(title, expectedTitle);
        System.out.println("Test is completed");
    }

    @Test
    public  void titleValidationReal() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        //Actual result
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        //Expected result
        String expectedTitle = "ISkillo";
        Assert.assertEquals(title, expectedTitle);
        System.out.println("Test is completed");
    }
@Test
    public  void getTitle() throws InterruptedException {
    Header header = new Header(driver);
    header.clickLoginLink();
    Thread.sleep(3000);
    LoginForm loginFo  = new LoginForm(driver);
    loginFo.fillUsername("Julieta1");
    loginFo.fillPassword("Skillo1");
    loginFo.clickRememberMe();
    loginFo.clickSignIn();
    Thread.sleep(300);
    //Actual result
    String title = driver.getTitle();
    System.out.println("The page title is: " + title);
    //Expected result
    String expectedTitle = "Abv bg";
    Assert.assertEquals(title, expectedTitle);
    System.out.println("Test i completed");
}
    @Test
    public  void getActualTitle() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm loginFo  = new LoginForm(driver);
        loginFo.fillUsername("Julieta1");
        loginFo.fillPassword("Skillo1");
        loginFo.clickRememberMe();
        loginFo.clickSignIn();
        Thread.sleep(300);
        //Actual result
        String title = driver.getTitle();
        System.out.println("The page title is: " + title);
        //Expected result
        String expectedTitle = "ISkillo";
        Assert.assertEquals(title, expectedTitle);
        System.out.println("Test is completed");
    }
    @Test
    public  void successfulMassageLogin() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm loginFo  = new LoginForm(driver);
        loginFo.fillUsername("Julieta1");
        loginFo.fillPassword("Skillo1");
        loginFo.clickRememberMe();
        loginFo.clickSignIn();
        Thread.sleep(300);
        WebElement profileLink = driver.findElement(By.xpath("//*[@id=\"toast-container\"]"));
        Assert.assertTrue(profileLink.isDisplayed(), "Няма линк!");
    }

    @Test
    public  void loginWithInvalidCredentials() throws InterruptedException {

        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm loginFo  = new LoginForm(driver);
        loginFo.fillUsername("Julieta1");
        loginFo.fillPassword("Skillo1");
        loginFo.clickRememberMe();
        loginFo.clickSignIn();
        Thread.sleep(300);
    }

    @Test
    public  void registration() throws InterruptedException {

        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        Register register = new Register(driver);
        WebElement registerB = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a"));
        registerB.click();
        Thread.sleep(3000);
        register.fillUsername("IvanIvanIvan");
        register.fillEmail("kfkgkkhjfkkhkgk@abv.bg");
        register.fillDate("01.11.1991");
        register.fillPassword("123!@#qweQWE");
        register.fillConfirmPassword("123!@#qweQWE");
        register.fillPublicInfo("Fuck off");
        register.clickSignIn();
        Thread.sleep(3000);
        WebElement errorMessage = driver.findElement(By.id("toast-container"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Вече има регистриран потребител с такова име!");
    }
    @Test
    public  void searchPost() throws InterruptedException {

        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        WebElement searchText = driver.findElement(By.xpath("//*[@id=\"search-bar\"]"));
        searchText.sendKeys("test");
        Thread.sleep(3000);
        WebElement post1 = driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/div/app-search-dropdown/div/div[1]/app-small-user-profile/div/div[1]/a"));
        post1.click();
        Thread.sleep(3000);
    }
    @Test
    public  void followingUser() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        WebElement searchText = driver.findElement(By.xpath("//*[@id=\"search-bar\"]"));
        searchText.sendKeys("test");
        Thread.sleep(3000);
        WebElement post1 = driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/div/app-search-dropdown/div/div[1]/app-small-user-profile/div/div[1]/a"));
        post1.click();
        Thread.sleep(3000);
        WebElement follow = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/button"));
        follow.click();
        Thread.sleep(3000);
        WebElement success = driver.findElement(By.xpath("//*[@id=\"toast-container\"]"));
        System.out.println("Success massage is: " + success);
    }
    @Test
    public  void uploadFileWithoutFile() throws InterruptedException {

        WebElement login = driver.findElement(By.xpath("//*[@id=\"nav-link-login\"]"));
        login.click();
        Thread.sleep(3000);
        LoginForm loginFo  = new LoginForm(driver);
        loginFo.fillUsername("Julieta1");
        loginFo.fillPassword("Skillo1");
        loginFo.clickRememberMe();
        loginFo.clickSignIn();
        Thread.sleep(300);
        WebElement profileLnk = driver.findElement(By.id("nav-link-profile"));
        Assert.assertTrue(profileLnk.isDisplayed());

    }
     @Test
    public  void createPostWithPicture() throws InterruptedException {
        Header header = new Header(driver);
        header.clickLoginLink();
        Thread.sleep(3000);
        LoginForm logInFrm = new LoginForm(driver);
        logInFrm.fillUsername("Julieta1");
        logInFrm.fillPassword("Skillo1");
        logInFrm.clickRememberMe();
        logInFrm.clickSignIn();
        Thread.sleep(3000);
        WebElement newPost = driver.findElement(By.xpath("//*[@id=\"nav-link-new-post\"]"));
        newPost.click();
        Thread.sleep(3000);
        WebElement upload =driver.findElement(By.xpath("/html/body/app-root/div[2]/app-create-post/div/div/div/form/div[2]/input"));
        upload.sendKeys("C:\\pics\\qa logo.jpg");
        Thread.sleep(2000);
        WebElement caption = driver.findElement(By.xpath("/html/body/app-root/div[2]/app-create-post/div/div/div/form/div[2]/div[3]/input"));
        caption.sendKeys("Test Caption");
        WebElement createPost = driver.findElement(By.xpath("//*[@id=\"create-post\"]"));
        createPost.click();
        Thread.sleep(3000);
    }
}


