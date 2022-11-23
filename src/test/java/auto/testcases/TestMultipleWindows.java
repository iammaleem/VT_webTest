package auto.testcases;

import auto.pages.MultipleWindowsPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;


public class TestMultipleWindows extends Init {

    @Test
    public void testFrame() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Multiple Windows");

        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage(driver);
        multipleWindowsPage.verifyMultipleWindowsPageHeader();
        multipleWindowsPage.clickOnLink();
        Thread.sleep(3000);
        multipleWindowsPage.getTextOnNewWindow();
    }
}
