package ua.hillel.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeolocationPage extends BasePage {
    @FindBy(tagName = "button")
    private WebElement geolocationButton;


    public GeolocationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SecurePage clickGeolocationButton() {
        click(geolocationButton);
        return new SecurePage(driver);
    }
}
