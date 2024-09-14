package com.tests;

import com.example.pages.LoginPage;
import com.example.utils.TestData;
import com.example.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createWebDriver("chrome"); // Or your preferred browser
        driver.get("https://www.your-healthcare-app-url.com/login"); // Replace with your actual URL
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.enterUsername(TestData.VALID_USERNAME);
        loginPage.enterPassword(TestData.VALID_PASSWORD);
        loginPage.clickLoginButton();

        // Add assertions to verify successful login (e.g., check for a welcome message or dashboard element)
        // Assert.assertTrue(driver.findElement(By.id("welcome-message")).isDisplayed()); 
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername(TestData.INVALID_USERNAME);
        loginPage.enterPassword(TestData.INVALID_PASSWORD);
        loginPage.clickLoginButton();

        // Add assertions to verify invalid login (e.g., check for an error message)
        // Assert.assertTrue(driver.findElement(By.id("error-message")).isDisplayed()); 
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
