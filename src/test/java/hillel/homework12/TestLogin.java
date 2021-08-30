package hillel.homework12;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void loginTestAccept() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        String massage = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        System.out.println(massage);
        Assert.assertEquals(massage, "You logged into a secure area!\n" + "×");
    }

    @Test
    public void loginTestInvalid() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("test");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        String massage = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        System.out.println(massage);
        Assert.assertEquals(massage, "Your username is invalid!\n" + "×");
    }
}
