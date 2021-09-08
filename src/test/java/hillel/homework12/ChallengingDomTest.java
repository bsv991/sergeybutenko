package hillel.homework12;

import hillel.BaseTest;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTest {

    @Test
    public void testChallengingDom() {
     openApp()
                .goToChallengingDomPage()
                .clickButtonFirst()
                .clickButtonAlert()
                .clickButtonSuccess()
                .iterationGetValue();
    }
}