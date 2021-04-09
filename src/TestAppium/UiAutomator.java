package TestAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomator extends AppiumMain {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

        // Validate clickable features for all options

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().checked(true)").size());
        // driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");



    }

}
