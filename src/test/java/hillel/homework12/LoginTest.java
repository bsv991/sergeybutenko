package hillel.homework12;

import hillel.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.SecurePage;

public class LoginTest extends BaseTest {
    @Test
    public void loginTestAccept() {
        SecurePage securePage = openApp()
                .goToLoginPage()
                .setUserName("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        Assert.assertTrue(securePage.getMassageLoginPage().contains("You logged into a secure area!"), "You logged into a secure area!");
    }

    @Test
    public void loginTestInvalid() {
        SecurePage securePage = openApp()
                .goToLoginPage()
                .setUserName("test")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        Assert.assertTrue(securePage.getMassageLoginPage().contains("Your username is invalid!"), "Your username is invalid!");
    }
}