package TestAppium.Basics;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class DragAndDrop extends AppiumMain{
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = Capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();

        TouchAction t = new TouchAction(driver);

        WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);

        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(destination)).release().perform();

    }
}
