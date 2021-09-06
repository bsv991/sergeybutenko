package hillel.homework13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    Actions actions;

    @BeforeClass
    public void beforeClass () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass () {
        driver.quit();
    }
}
