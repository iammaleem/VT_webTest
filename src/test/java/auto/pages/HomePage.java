package page.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.*;


public class HomePage {

    final static String TITLE = "VdoTok - Easy-to-use APIs for Live Media";
    final static String HEADING = "Need easy-to-use\n"
    		+ "APIs for live media?";
    WebDriver driver;
    String xpathHeading = "//p[@class='typekit_h1 webkit_primary_h h1bp']";
    String xpathLink = "//ul/li/a[text()='**link**']";
    String xpathLogo =  "img[id='vdtbrandlogo']";

    String TryfreeButton = "//button[contains(@class, 'tryfree')]";
  
   // String currentPageSource = driver.getPageSource();

    
    


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomePageTitle() {
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, TITLE,
                "Actual title " + actualTitle + " should be same as expected " + TITLE);
    }

    public void verifyWelcomePageHeader() {
        WebElement headerEle = driver.findElement(By.xpath(xpathHeading));
        String actualHeading = headerEle.getText();
        assertEquals(actualHeading, HEADING,
                "Actual heading '" + actualHeading + "' should be same as expected '" + HEADING + "'.");
    }

    public void clickOnLogo() {
        driver.findElement(By.cssSelector(xpathLogo)).click();
    }

    public void clickOnTryFree() {
        driver.findElement(By.xpath(TryfreeButton)).click();
    } 


    public void clickOnLinkViaPartialText(String link) {
        driver.findElement(By.partialLinkText(link)).click();
    }

    public Object clickOnLink(String link) {
        xpathLink = xpathLink.replace("**link**", link);
        driver.findElement(By.xpath(xpathLink)).click();
        return this;
    }
}
