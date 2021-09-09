package hillel.homework12;

import hillel.BaseTest;
import org.testng.annotations.Test;
import ua.hillel.pageObjects.ChallengingDomPage;
import java.util.List;

public class ChallengingDomTest extends BaseTest {
    @Test
    public void testChallengingDom() {
        openApp()
                .goToChallengingDomPage()
                .clickButtonFirst()
                .clickButtonAlert()
                .clickButtonSuccess();
        List<String> list = new ChallengingDomPage(driver).getTableData();
        for (String data: list) {
            System.out.println(data);
        }
    }
}