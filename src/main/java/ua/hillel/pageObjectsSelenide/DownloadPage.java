package ua.hillel.pageObjectsSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    private final SelenideElement linkText = $(By.linkText("some-file.txt"));

    public File downloadFiles() throws FileNotFoundException {
        return $(linkText).download();
    }
}