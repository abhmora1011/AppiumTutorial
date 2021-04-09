package TestAppium.ECommerceExercise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import sun.jvm.hotspot.utilities.Assert;

import java.net.MalformedURLException;

public class ECommerceDemoNegative extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driverECommerce = Capabilities();

        driverECommerce.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driverECommerce.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));" ).click();
        //driverECommerce.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driverECommerce.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        driverECommerce.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driverECommerce.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        String toast = driverECommerce.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");

        // Need TestNG or Junit
        // Assert.assertEquals("Please enter your name",toast);
    }

}
