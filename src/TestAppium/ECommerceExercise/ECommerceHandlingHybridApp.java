package TestAppium.ECommerceExercise;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class ECommerceHandlingHybridApp extends BaseClass{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> drHybrid = Capabilities();

        drHybrid.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        drHybrid.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();
        drHybrid.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        drHybrid.hideKeyboard();
        drHybrid.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        drHybrid.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        drHybrid.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        drHybrid.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        drHybrid.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        drHybrid.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        TouchAction t = new TouchAction(drHybrid);
        WebElement checkbox = drHybrid.findElementByAndroidUIAutomator("text(\"Send me e-mails on discounts related to selected products in future\")");

        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkbox))).perform();

        drHybrid.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

        Thread.sleep(3000);

        Set<String> contexts = drHybrid.getContextHandles();

        for (String contextName:contexts) {
            System.out.println(contextName);
        }

        drHybrid.context("WEBVIEW_com.androidsample.generalstore");

        Thread.sleep(2000);

        drHybrid.findElement(By.name("q")).sendKeys("hello");

        drHybrid.findElement(By.name("q")).sendKeys(Keys.ENTER);

        drHybrid.pressKey(new KeyEvent(AndroidKey.BACK));

        drHybrid.context("NATIVE_APP");

    }

}
