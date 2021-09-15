package hillel.homework17;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pageObjectsSelenide.DynamicControlsPage;

import static com.codeborne.selenide.Selenide.$;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void testDynamicControls() {
        openAppSelenide("dynamic_controls");
        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.setCheckbox();
        dynamicControlsPage.addOrRemoveCheckbox(true);
        Assert.assertTrue($(By.id("message")).getText().contains("It's gone!"), "It's gone!");
        dynamicControlsPage.addOrRemoveCheckbox(false);
        Assert.assertTrue($(By.id("message")).getText().contains("It's back!"), "It's back!");
        dynamicControlsPage.enableOrDisabledButton(true);
        Assert.assertTrue($(By.id("message")).getText().contains("It's enabled!"), "It's enabled!");
        dynamicControlsPage.enableOrDisabledButton(false);
        Assert.assertTrue($(By.id("message")).getText().contains("It's disabled!"), "It's disabled!");
    }
}