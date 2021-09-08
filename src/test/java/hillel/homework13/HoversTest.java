package hillel.homework13;

import hillel.BaseTest;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {
    @Test
    public void testHovers() {
        openApp()
                .goToHoversPage().
                iterationGetValue();
    }
}