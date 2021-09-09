package hillel.homework16;

import hillel.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.SecureUpload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DownloadUploadFileTest extends BaseTest {

    @Test
    public void testFileDownloadUpload() throws InterruptedException {
        String text = "11111111";
        openApp()
                .goToFileDownload()
                .downloadFiles();
        checkFileDirectory("recovery_codes.txt");
        try {
            Files.write(Paths.get("target/" + "recovery_codes.txt"), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        SecureUpload secureUpload =  openApp()
                .goToFileUpload()
                .fileUpload("target/recovery_codes.txt")
                .clickSubmit();
        Assert.assertTrue(secureUpload.getMassage().contains("File Uploaded!"), "File Uploaded!");
        System.out.println("done");
    }
}