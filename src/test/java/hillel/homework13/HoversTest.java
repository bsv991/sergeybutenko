package hillel.homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class HoversTest extends BaseTest {

    @Test
    public void TestHovers() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        List<WebElement> elementList = driver.findElements(By.cssSelector("div.figure"));
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
