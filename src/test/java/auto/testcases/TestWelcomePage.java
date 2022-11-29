package page.testcases;
import org.testng.annotations.Test;

import page.Objects.HomePage;
import page.utilities.Init;

public class TestWelcomePage extends Init{

    @Test
    public void testWelcomePage() {
    	HomePage welcomePage = new HomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLogo();
        welcomePage.clickOnTryFree();


    }
}
