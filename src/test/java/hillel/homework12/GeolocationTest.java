package hillel.homework12;

import hillel.BaseTest;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.SecurePage;

public class GeolocationTest extends BaseTest {
    @Test
    public void testGeolocation() {
        SecurePage securePage = openApp()
                .goToGeolocationPage()
                .clickGeolocationButton();
        System.out.println("Latitude: " + securePage.getMassageGeolocationLat());
        System.out.println("Longitude: " + securePage.getMassageGeolocationLng());
    }
}