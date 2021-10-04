package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage {
    @FindBy(tagName = "button")
    private WebElement geolocationButton;

    @FindBy(id = "lat-value")
    private WebElement massageLat;

    @FindBy(id = "long-value")
    private WebElement massageLng;

    public GeolocationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click geolocation button")
    public GeolocationPage clickGeolocationButton() {
        click(geolocationButton);
        return new GeolocationPage(driver);
    }

    @Step("Get massage lat")
    public String getMassageGeolocationLat (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lat-value")));
        return getMassage(massageLat);
    }

    @Step("Get massage lng")
    public String getMassageGeolocationLng (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("long-value")));
        return getMassage(massageLng);
    }
}