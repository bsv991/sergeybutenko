package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class UploadPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement fileUpload;

    @FindBy(id = "file-submit")
    private WebElement fileSubmit;

    public UploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("File upload")
    public UploadPage fileUpload(String name) {
        fileUpload.sendKeys(new File(name).getAbsolutePath());
        return new UploadPage(driver);
    }

    @Step("Click submit file upload")
    public SecureUpload clickSubmit () {
        click(fileSubmit);
        return new SecureUpload (driver);
    }
}
