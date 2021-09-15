package hillel.homework17;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.open;


public class BaseTest {
    @BeforeClass
    public void beforeClass() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.downloadsFolder = Paths.get("target").toFile().getAbsolutePath();
    }

    public void openAppSelenide(String url) {
        open(url);
    }

    public void checkFileDirectory(String fileName) throws InterruptedException {
        File file = new File(Paths.get("target/451f7510-78ac-413e-ae0d-d6636ccc6eb2/" + fileName).toFile().getAbsolutePath());
        while (true) {
            if (!file.exists()) {
                Thread.sleep(1000);
            } else {
                break;
            }
        }
    }
}