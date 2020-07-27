package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static AndroidDriver<MobileElement> driver =null;
    public static WebDriverWait wait;

    public static void desiredCapabilities(){

        String URL_0 = "http://0.0.0.0:4723/wd/hub";
        String URL_1 = "http://127.0.0.1:4723/wd/hub";

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g(6)");
            caps.setCapability(MobileCapabilityType.UDID, "ZF6222392G");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.NO_RESET, true);
            //caps.setCapability("app", System.getProperty("user.dir")+"/src/main/resources/apps/org.schabi.newpipe.apk");
            caps.setCapability("appPackage", "org.schabi.newpipe");
            caps.setCapability("appActivity", ".MainActivity");


            URL url = new URL(URL_1);

            driver = new AndroidDriver<MobileElement>(url, caps);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 20);
        }
        catch (Exception e){
            System.out.println("Cause is : " + e.getCause());
            System.out.println("Message is : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
