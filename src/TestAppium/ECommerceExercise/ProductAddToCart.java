package TestAppium.ECommerceExercise;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ProductAddToCart extends BaseClass {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driverAddToCart = Capabilities();

        driverAddToCart.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        driverAddToCart.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driverAddToCart.hideKeyboard();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        driverAddToCart.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        driverAddToCart.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driverAddToCart.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));" ).isDisplayed();
//        driverAddToCart.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[2]").click();


        driverAddToCart.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

        int count = driverAddToCart.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for (int i = 0; i < count; i++) {
            String text = driverAddToCart.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if (text.equals("Jordan 6 Rings")) {

                driverAddToCart.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
                break;
            }

        }

        driverAddToCart.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

    }

}
