package TestAppium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

public class swipeDemo extends AppiumMain{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        //driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();

        TouchAction t = new TouchAction(driver);

        WebElement clock = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement clock2 = driver.findElementByXPath("//*[@content-desc='35']");

        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(clock))).moveTo(ElementOption.element(clock2)).release().perform();

    }
}