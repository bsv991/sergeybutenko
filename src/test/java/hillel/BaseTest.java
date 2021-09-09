package hillel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.pageObjects.MainPage;
import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;
    protected Actions actions;

    @BeforeClass
    public void beforeClass () {
        ChromeOptions chromeOptions =  new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", Paths.get("target").toFile().getAbsolutePath());
        prefs.put("safebrowsing.enable", "false");
        prefs.put("profile.default_content_setting_popups", 0);
        chromeOptions.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass () {
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }

    public void checkFileDirectory(String fileName) throws InterruptedException {
        boolean downloadCompleted = false;
        File file = new File(Paths.get("target/" + fileName).toFile().getAbsolutePath());
        while (true) {
            if (!file.exists()) {
                Thread.sleep(1000);
            } else {
                break;
            }
        }
    }
}