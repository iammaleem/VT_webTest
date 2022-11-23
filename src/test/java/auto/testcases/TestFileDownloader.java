package auto.testcases;

import auto.pages.FileDownloaderPage;
import auto.pages.WelcomePage;
import auto.utility.Init;
import org.testng.annotations.Test;


public class TestFileDownloader extends Init {

    @Test
    public void testFrame() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("File Download");

        FileDownloaderPage downloaderPage = new FileDownloaderPage(driver);
        downloaderPage.verifyFileDownloaderHeader();
        downloaderPage.verifyFileDownload();
    }
}
