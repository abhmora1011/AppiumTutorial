package TestAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

public class ApiApk {

    public static void main(String arg[]) throws MalformedURLException, SQLException, ClassNotFoundException {

        File appDir = new File("src");


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AppiumTutorial");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
        cap.setCapability(MobileCapabilityType.APP, "");
        //cap.setCapability(MobileCapabilityType.APP_ACTIVITY);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }

}