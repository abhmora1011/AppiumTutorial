package TestAppium.HybridBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HybridBaseDemo {


    public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
        //public static void main(String args[]) throws MalformedURLException

        File f =  new File("src");
        File fs = new File(f,"TestAppium.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        if(device.equals("emulator")){
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,"AppiumTutorial");
        }
        else if(device.equals("real")){
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        }
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);



        return driver; //added

    }



}
