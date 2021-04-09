package TestAppium.MobileBrowserConfig;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileBrowserBase {

    public static AndroidDriver<AndroidElement> CapabilitiesBrowser() throws MalformedURLException{

        /*File fs = new File("src");
        File f = new File(fs,"TestAppium.apk");*/

        DesiredCapabilities cp = new DesiredCapabilities();

        cp.setCapability(MobileCapabilityType.DEVICE_NAME,"AppiumTutorial");
        cp.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cp.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        cp.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cp);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }

}
