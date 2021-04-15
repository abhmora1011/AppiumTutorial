package TestAppium.pageObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(AndroidDriver<AndroidElement> dr) { PageFactory.initElements(dr,this); }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preferences;
}
