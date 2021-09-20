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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import static com.codeborne.selenide.Selenide.$;

public class DownloadUploadFileTest extends BaseTest {
    @Test
    public void testFileDownloadUpload() throws FileNotFoundException {
        String text = "11111111";
        openAppSelenide("download");
        File file = new DownloadPage().downloadFiles();
        Path paths = Paths.get(file.getAbsolutePath());
        try {
            Files.write(paths, text.getBytes(), StandardOpenOption.APPEND);
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