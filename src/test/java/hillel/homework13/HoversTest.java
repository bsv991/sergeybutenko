package hillel.homework13;

import hillel.BaseTest;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.HoversPage;

import java.util.List;

public class HoversTest extends BaseTest {
    @Test
    public void testHovers() {
        openApp()
                .goToHoversPage();
        List<String> list =  new HoversPage(driver).getUserNames();
        for (String data : list) {
            System.out.println(data);
        }
    }
}