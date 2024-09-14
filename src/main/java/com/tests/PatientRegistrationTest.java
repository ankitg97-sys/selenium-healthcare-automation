package com.tests;

import com.example.pages.LoginPage; // Assuming you need to log in before registering
import com.example.pages.PatientRegistrationPage;
import com.example.utils.TestData;
import com.example.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PatientRegistrationTest {

    private WebDriver driver;
    private LoginPage loginPage; // Assuming login is required
    private PatientRegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createWebDriver("chrome"); 
        driver.get("https://www.your-healthcare-app-url.com/login"); 
        loginPage = new LoginPage(driver);
        // Perform login if required 
        // loginPage.enterUsername(TestData.VALID_USERNAME);
        // loginPage.enterPassword(TestData.VALID_PASSWORD);
        // loginPage.clickLoginButton();

        // Navigate to the registration page (replace with the actual URL)
        driver.get("https://www.your-healthcare-app-url.com/register"); 
        registrationPage = new PatientRegistrationPage(driver);
    }

    @Test
    public void testSuccessfulRegistration() {
        registrationPage.enterFirstName(TestData.FIRST_NAME);
        registrationPage.enterLastName(TestData.LAST_NAME);
        registrationPage.enterDateOfBirth(TestData.DATE_OF_BIRTH);
        registrationPage.clickRegisterButton();

        // Add assertions to verify successful registration 
        // (e.g., check for a success message or redirection to a new page)
        // Assert.assertTrue(driver.findElement(By.id("success-message")).isDisplayed()); 
    }

    // Add more test cases for different registration scenarios (e.g., invalid data, duplicate registration)

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
