package hillel.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestGeolocation extends BaseTest {
    @Test
    public void testGeolocation () {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"lat-value\"]"))).getText();
        String latValue = driver.findElement(By.xpath("//*[@id=\"lat-value\"]")).getText();
        String longValue = driver.findElement(By.xpath("//*[@id=\"long-value\"]")).getText();
        System.out.println("Latitude: " + latValue);
        System.out.println("Longitude: " + longValue);

    }
}