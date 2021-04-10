package TestAppium.Basics;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class ScrollingDemo extends AppiumMain{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = Capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //Android API Code is executed in the UiAutomator function.
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));" );
    }
}
