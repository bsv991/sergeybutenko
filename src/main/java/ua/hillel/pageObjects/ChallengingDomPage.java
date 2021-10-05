package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomPage extends BasePage {
    @FindBy(css = ".columns.large-2 .button")
    private WebElement button;

    @FindBy(css = ".columns.large-2 .alert.button")
    private WebElement alertButton;

    @FindBy(css = ".columns.large-2 .success.button")
    private WebElement successButton;

    @FindBy(css = "tr > td:nth-child(4)")
    private List<WebElement> tableRows;

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click button first")
    public ChallengingDomPage clickButtonFirst() {
        click(button);
        return new ChallengingDomPage(driver);
    }
    @Step("Click button alert")
    public ChallengingDomPage clickButtonAlert() {
        click(alertButton);
        return new ChallengingDomPage(driver);
    }

    @Step("Click button success")
    public ChallengingDomPage clickButtonSuccess() {
        click(successButton);
        return new ChallengingDomPage(driver);
    }
    @Step("Get table data")
    public List<String> getTableData() {
        List<String> data = new ArrayList<>();
        for (WebElement tableRow : tableRows) {
            data.add(tableRow.getText());
        }
        return data;
    }
}