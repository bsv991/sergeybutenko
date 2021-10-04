package ua.hillel.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class HoversPage extends MainPage {
    @FindBy(css = "div.figure")
    private List<WebElement> elementList;

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Get users names")
    public List<String> getUserNames() {
        List<String> data = new ArrayList<>();
        for (WebElement x : elementList) {
            actions.moveToElement(x).perform();
            List<WebElement> listUser = x.findElements(By.xpath("//div[@class='figcaption']/h5"));
            for (WebElement a : listUser) {
                data.add(a.getText());
            }
        } return data;
    }
}