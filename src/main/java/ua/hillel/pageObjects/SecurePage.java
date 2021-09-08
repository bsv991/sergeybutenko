package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePage extends BasePage {
    @FindBy(id = "flash")
    private WebElement massageLogin;

    @FindBy(id = "lat-value")
    private WebElement massageLat;

    @FindBy(id = "long-value")
    private WebElement massageLng;

    public SecurePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getMassageLoginPage () {
       return getMassage(massageLogin);
    }

    public String getMassageGeolocationLat (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lat-value")));
        return getMassage(massageLat);
    }

    public String getMassageGeolocationLng (){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("long-value")));
        return getMassage(massageLng);

    }
}