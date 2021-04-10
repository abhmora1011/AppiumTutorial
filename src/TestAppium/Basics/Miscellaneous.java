package TestAppium.Basics;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class Miscellaneous extends AppiumMain{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = Capabilities();

        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());
        // views - Native, Hybrid, Webview
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());
        //driver.hideKeyboard();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

    }

}
