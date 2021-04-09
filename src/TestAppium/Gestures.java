package TestAppium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Gestures extends AppiumMain {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //Tap
        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandList))).perform();

        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

        WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element((peopleNames))).withDuration(Duration.ofSeconds(2))).release().perform();
        //Thread.sleep(2000);
        System.out.println(driver.findElementById("android:id/title").isDisplayed());






        //driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();

        //driver.findElementByAndroidUIAutomator("text(\"People Names\")").


    }

}
