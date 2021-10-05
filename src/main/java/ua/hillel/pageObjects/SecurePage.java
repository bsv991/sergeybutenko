package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage extends BasePage {
    @FindBy(id = "flash")
    private WebElement massageLogin;

    public SecurePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Get massage login page")
    public String getMassageLoginPage () {
       return getMassage(massageLogin);
    }
}