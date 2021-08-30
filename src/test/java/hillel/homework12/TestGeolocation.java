package hillel.homework12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestGeolocation extends BaseTest {
    @Test
    public void testGeolocation () throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        Thread.sleep(3000);
        String latValue = driver.findElement(By.xpath("//*[@id=\"lat-value\"]")).getText();
        String longValue = driver.findElement(By.xpath("//*[@id=\"long-value\"]")).getText();
        System.out.println("Latitude: " + latValue);
        System.out.println("Longitude: " + longValue);

    }
}