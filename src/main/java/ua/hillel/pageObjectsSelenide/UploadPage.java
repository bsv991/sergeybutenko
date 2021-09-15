package ua.hillel.pageObjectsSelenide;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    private final SelenideElement fileUpload = $("input[type='file']");
    private final SelenideElement clickSubmit =  $("#file-submit");

    public void fileUpload(File name) {
        fileUpload.uploadFile(name);
    }

    public void clickSubmit () {
        clickSubmit.click();
    }
}