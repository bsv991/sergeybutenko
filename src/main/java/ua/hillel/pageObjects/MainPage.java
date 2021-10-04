package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(linkText = "Form Authentication")
    private WebElement loginLink;

    @FindBy(linkText = "Geolocation")
    private WebElement geolocationLink;

    @FindBy(linkText = "Challenging DOM")
    private WebElement geolocationChallengingLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversPageLink;

    @FindBy(linkText = "File Download")
    private WebElement downloadLink;

    @FindBy(linkText = "File Upload")
    private WebElement uploadLink;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("goToLoginPage")
    public LoginPage goToLoginPage() {
        click(loginLink);
        return new LoginPage(driver);
    }
    @Step("goToGeolocationPage")
    public GeolocationPage goToGeolocationPage() {
        click(geolocationLink);
        return new GeolocationPage(driver);
    }
    @Step("goToChallengingDomPage")
    public ChallengingDomPage goToChallengingDomPage() {
        click(geolocationChallengingLink);
        return new ChallengingDomPage(driver);
    }
    @Step("goToHoversPage")
    public HoversPage goToHoversPage() {
        click(hoversPageLink);
        return new HoversPage(driver);
    }
    @Step("goToFileDownload")
    public DownloadPage goToFileDownload() {
        click(downloadLink);
        return new DownloadPage(driver);
    }
    @Step("goToFileUpload")
    public UploadPage goToFileUpload() {
        click(uploadLink);
        return new UploadPage(driver);
    }
}