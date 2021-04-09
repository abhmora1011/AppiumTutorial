package TestAppium.ECommerceExercise;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class ProductAddToCart extends BaseClass{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driverAddToCart = Capabilities();

        driverAddToCart.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driverAddToCart.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));" ).click();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driverAddToCart.hideKeyboard();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
    }

}
