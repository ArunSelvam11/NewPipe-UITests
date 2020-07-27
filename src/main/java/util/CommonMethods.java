package util;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CommonMethods extends TestBase {

    public AppiumDriver<MobileElement> driver;

    public CommonMethods(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }
}
