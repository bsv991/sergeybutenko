package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage extends BasePage {

    @FindBy(linkText = "recovery_codes.txt")
    private WebElement recoveryCodesLink;

    public DownloadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Download files")
    public void downloadFiles() {
        click(recoveryCodesLink);
    }
}