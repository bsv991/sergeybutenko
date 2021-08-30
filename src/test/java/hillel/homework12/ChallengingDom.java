package hillel.homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ChallengingDom extends BaseTest {
    @Test
    public void testChallengingDom() {

        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.findElement(By.cssSelector(".columns.large-2")).findElement(By.cssSelector(".button")).click();
        driver.findElement(By.cssSelector(".columns.large-2")).findElement(By.cssSelector(".alert.button")).click();
        driver.findElement(By.cssSelector(".columns.large-2")).findElement(By.cssSelector(".success.button")).click();
        WebElement table = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        for (WebElement row : tableRows) {
            List<WebElement> cells = row.findElements(By.cssSelector("td:nth-child(4)"));
            for (WebElement cell : cells) {
                System.out.println("Value = " + cell.getText());
            }
        }
    }
}
