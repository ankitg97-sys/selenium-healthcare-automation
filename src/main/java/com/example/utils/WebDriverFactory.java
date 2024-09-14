package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver createWebDriver(String browser) {
        WebDriver driver = null;

        switch (browser.toLowerCase()) {
            case "chrome":
                // Set ChromeDriver path (replace with your actual path)
                System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                // Set FirefoxDriver path (replace with your actual path)
                System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser specified: " + browser);
        }

        driver.manage().window().maximize();
        return driver;
    }
}
