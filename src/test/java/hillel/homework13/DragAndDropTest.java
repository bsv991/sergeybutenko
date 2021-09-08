package hillel.homework13;

import hillel.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop () {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(from, to).perform();
        String textTo = to.getText();
        Assert.assertEquals(textTo, "Dropped!");
    }
}