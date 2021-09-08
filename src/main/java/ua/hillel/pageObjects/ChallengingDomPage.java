package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage extends BasePage {
    @FindBy(css = ".columns.large-2 .button")
    private WebElement button;

    @FindBy(css = ".columns.large-2 .alert.button")
    private WebElement alertButton;

    @FindBy(css = ".columns.large-2 .success.button")
    private WebElement successButton;

    @FindAll({
            @FindBy(tagName = "tr")
    })
    private List<WebElement> tableRows;

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingDomPage clickButtonFirst() {
        click(button);
        return new ChallengingDomPage(driver);
    }

    public ChallengingDomPage clickButtonAlert() {
        click(alertButton);
        return new ChallengingDomPage(driver);
    }

    public ChallengingDomPage clickButtonSuccess() {
        click(successButton);
        return new ChallengingDomPage(driver);
    }

    public void iterationGetValue() {
        for (WebElement row : tableRows) {
            List<WebElement> cells = row.findElements(By.cssSelector("td:nth-child(4)"));
            for (WebElement cell : cells) {
                System.out.println("Value = " + cell.getText());
            }
        }
    }
}
