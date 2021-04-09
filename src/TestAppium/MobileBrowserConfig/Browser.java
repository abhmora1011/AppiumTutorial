package TestAppium.MobileBrowserConfig;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Browser extends MobileBrowserBase{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = CapabilitiesBrowser();

        driver.get("https://www.lazada.com.ph/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("/html/body/div[4]/header/div[2]/div/a[2]/span").sendKeys("1234");

    }

}
