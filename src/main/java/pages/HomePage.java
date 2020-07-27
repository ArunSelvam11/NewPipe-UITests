package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.objects.HomePageObjects;
import util.CommonMethods;

public class HomePage extends CommonMethods {

    public static HomePageObjects homePageObjects = new HomePageObjects();

    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageObjects);
    }

    public static void clickBookmarkIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(homePageObjects.bookmarkIcon));
        homePageObjects.bookmarkIcon.click();
    }

    public static boolean nothingHereIsDisplayed(){
        wait.until(ExpectedConditions.elementToBeClickable(homePageObjects.nothingHereButCricket));
        return homePageObjects.nothingHereButCricket.isDisplayed();
    }
}
