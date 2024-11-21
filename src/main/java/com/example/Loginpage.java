package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
    public static void main(String[] args) throws InterruptedException {
        // Add Server Link Here
        String Websitelink = "https://Amazon.in/";

        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "/Users/imac/Documents/LocalBrowser/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();

        // Open the login page URL
        driver.get(Websitelink);
        driver.manage().window().maximize();

        loginPage(driver);

        driver.quit();
        Thread.sleep(5000);
    }

    private static void loginPage(WebDriver driver) throws InterruptedException {

        System.out.println( "Hello World!" );
        System.out.println( "Hello git" );

    }
}