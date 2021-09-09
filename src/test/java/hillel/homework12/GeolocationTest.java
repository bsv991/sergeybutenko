package hillel.homework12;

import hillel.BaseTest;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.GeolocationPage;

public class GeolocationTest extends BaseTest {
    @Test
    public void testGeolocation() {
        GeolocationPage securePage = openApp()
                .goToGeolocationPage()
                .clickGeolocationButton();
        System.out.println("Latitude: " + securePage.getMassageGeolocationLat());
        System.out.println("Longitude: " + securePage.getMassageGeolocationLng());
    }
}