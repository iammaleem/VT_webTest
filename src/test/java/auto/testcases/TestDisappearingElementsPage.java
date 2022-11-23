package auto.testcases;

import auto.pages.DisappearingElementsPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;

import java.util.List;


public class TestDisappearingElementsPage extends Init {

    @Test
    public void testChallengingPage() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Disappearing Elements");

        DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage(driver);
        disappearingElementsPage.verifyDisappearingElementsPageHeader();
        List<String> tabNames = disappearingElementsPage.getAllTabsName();
        System.out.println(tabNames);
        disappearingElementsPage.verifyDisappearTab("Gallery");
    }
}
