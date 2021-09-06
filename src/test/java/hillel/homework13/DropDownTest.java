package hillel.homework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void testDropDown () {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        WebElement from = driver.findElement(By.className("dropdown"));
        WebElement secondaryDrop = driver.findElement(By.className("secondary-dropdown"));
        WebElement secondaryMenu = driver.findElement(By.xpath("//ul[@class='dropdown-menu secondary']"));
        actions.moveToElement(from).moveToElement(secondaryDrop).moveToElement(secondaryMenu).click().perform();
        String textTo = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1")).getText();
        Assert.assertEquals(textTo, "Secondary Page");
    }
}