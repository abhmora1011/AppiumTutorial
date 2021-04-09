package TestAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseRealDevice {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        //public static void main(String args[]) throws MalformedURLException

        File f =  new File("src");
        File fs = new File(f,"TestAppium.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        AndroidDriver<AndroidElement> dr = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return dr; //added

    }
}
