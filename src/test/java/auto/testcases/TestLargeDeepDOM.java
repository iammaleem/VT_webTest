package auto.testcases;

import auto.pages.LargeDeepDOMPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;


public class TestLargeDeepDOM extends Init {

    @Test
    public void testLargeDeepDOM() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Large & Deep DOM");

        LargeDeepDOMPage deepDOMPage = new LargeDeepDOMPage(driver);
        deepDOMPage.verifyLargeDeepDOMPageHeader();
        deepDOMPage.getLargeDOMText();

        deepDOMPage.getParent("2.3");
        deepDOMPage.getAncestor("2.3");
    }
}
