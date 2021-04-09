package TestAppium.ECommerceExercise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class ECommerceDEmo extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driverECommerce = Capabilities();

        driverECommerce.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driverECommerce.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));" ).click();
        driverECommerce.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driverECommerce.hideKeyboard();
        driverECommerce.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        driverECommerce.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driverECommerce.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();



    }

}
