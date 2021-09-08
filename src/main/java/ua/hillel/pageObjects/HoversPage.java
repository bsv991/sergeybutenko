package ua.hillel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HoversPage extends MainPage {
    @FindAll({
            @FindBy(css = "div.figure")
    })
    private List<WebElement> elementList;


    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void iterationGetValue() {
        for (WebElement x : elementList) {
            actions.moveToElement(x).perform();
            List<WebElement> listUser = x.findElements(By.xpath("//div[@class='figcaption']/h5"));
            for (WebElement a : listUser) {
                String textUser = a.getText();
                System.out.println(textUser);
            }
        }
    }

}
