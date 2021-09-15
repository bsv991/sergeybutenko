package hillel.homework17;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjectsSelenide.DownloadPage;
import ua.hillel.pageObjectsSelenide.UploadPage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import static com.codeborne.selenide.Selenide.$;

public class DownloadUploadFileTest extends BaseTest {
    @Test
    public void testFileDownloadUpload() throws FileNotFoundException, InterruptedException {
        String text = "11111111";
        openAppSelenide("download");
        File file = new DownloadPage().downloadFiles();
        checkFileDirectory("some-file.txt");
        try {
            Files.write(Paths.get("target/451f7510-78ac-413e-ae0d-d6636ccc6eb2/" + "some-file.txt"), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        openAppSelenide("upload");
        new UploadPage().fileUpload(file);
        new UploadPage().clickSubmit();
        Assert.assertTrue($(By.id("content")).getText().contains("File Uploaded!"), "File Uploaded!");
        System.out.println("done");
    }
}