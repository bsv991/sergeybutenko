package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(tagName = "button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @Step("Set user name")
    public LoginPage setUserName(String userName) {
        setValue(usernameInput, userName);
        return this;
    }

    @Step("Set user password")
    public LoginPage setPassword(String password) {
        setValue(passwordInput, password);
        return this;
    }
    @Step("Log into app with valid credential's")
    public SecurePage clickLoginButton() {
        click(loginButton);
        return new SecurePage(driver);
    }
}