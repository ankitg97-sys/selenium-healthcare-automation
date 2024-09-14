package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRegistrationPage {

    private WebDriver driver;

    // Page elements (locators - replace with actual IDs from your application)
    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "dateOfBirth")
    private WebElement dateOfBirthField;

    @FindBy(id = "registerButton")
    private WebElement registerButton;

    // Constructor
    public PatientRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page actions (methods)
    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        dateOfBirthField.sendKeys(dateOfBirth);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
