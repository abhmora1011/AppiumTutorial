package TestAppium.ECommerceExercise;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class ECommerceTapHold extends BaseClass{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> drTotalAmount= Capabilities();

        drTotalAmount.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        drTotalAmount.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        drTotalAmount.hideKeyboard();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        drTotalAmount.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        drTotalAmount.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        drTotalAmount.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        TouchAction t = new TouchAction(drTotalAmount);
        WebElement checkbox = drTotalAmount.findElementByAndroidUIAutomator("text(\"Send me e-mails on discounts related to selected products in future\")");

        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkbox))).perform();

        WebElement linkPopUp = drTotalAmount.findElementByXPath("//android.widget.TextView[@text='Please read our terms of conditions']");

        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element((linkPopUp))).withDuration(Duration.ofSeconds(2))).release().perform();

        drTotalAmount.findElement(By.id("android:id/button1")).click();

        Thread.sleep(2000);

        drTotalAmount.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

    }



}
