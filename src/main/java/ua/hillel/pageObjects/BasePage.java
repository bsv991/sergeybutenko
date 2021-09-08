package ua.hillel.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    private JavascriptExecutor javascriptExecutor;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }

    protected void setValue (WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    protected void click (WebElement element) {
        element.click();
    }

    protected String getMassage (WebElement element) {
        return element.getText();
    }

    protected void moveTo (Actions actions, WebElement element) {
        actions.moveToElement(element);
    }
}