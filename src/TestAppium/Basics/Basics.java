package TestAppium.Basics;

import TestAppium.pageObject.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Basics extends AppiumMain{

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> dr = Capabilities();

        HomePage hp = new HomePage(dr);

        dr.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        dr.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        dr.findElementById("android:id/checkbox").click();
        dr.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        //dr.findElementById("android:id/edit").sendKeys("Batch2");
        dr.findElementByClassName("android.widget.EditText").sendKeys("hello");
        dr.findElementsByClassName("android.widget.Button").get(1).click();
        System.out.println("PASSED");
    }
}
