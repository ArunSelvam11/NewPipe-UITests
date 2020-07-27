import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.HomePage.*;

public class HomePageTests extends TestBase {

    HomePage homePage;

    @BeforeTest
    public void setUp(){
        desiredCapabilities();
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyingMatches(){
        clickBookmarkIcon();
        Assert.assertTrue(nothingHereIsDisplayed());
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
