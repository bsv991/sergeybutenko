package ua.hillel.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureUpload extends BasePage {
    @FindBy(id = "content")
    private WebElement massage;

    public SecureUpload(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getMassage () {
        return getMassage(massage);
    }
}