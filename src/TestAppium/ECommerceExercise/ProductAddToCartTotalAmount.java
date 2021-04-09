package TestAppium.ECommerceExercise;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleConsumer;

public class ProductAddToCartTotalAmount extends BaseClass{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> drTotalAmount= Capabilities();

        drTotalAmount.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
        drTotalAmount.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        drTotalAmount.hideKeyboard();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/radioMale").isDisplayed();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/radioFemale").click();
        drTotalAmount.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        drTotalAmount.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        drTotalAmount.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        drTotalAmount.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(4000);

        int count = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
        double partialTotal = 0;

        for (int i = 0; i < count;i++){
            double p = getAmount(drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText());
            partialTotal = partialTotal + p;
        }

//        String p1 = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
//        double amountP1 = getAmount(p1);

//        String p2 = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
//        double amountP2 = getAmount(p2);

//        double total = amountP1 + amountP2;

        String totalPay = drTotalAmount.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        double totalPayFinal = getAmount(totalPay);

        if (totalPayFinal == partialTotal){
            System.out.println("Equal");
        }


        //========= DO NOT UNCOMMENT IF NOT NEEDED =========//

        /*

        drTotalAmount.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        drTotalAmount.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
        drTotalAmount.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        int count = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        String text = "";

        for (int i = 0; i < count; i++) {
            text = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if (text.equalsIgnoreCase("Jordan 6 Rings")) {

                drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
                break;
            }
        }

        drTotalAmount.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        String temp = drTotalAmount.findElementById("com.androidsample.generalstore:id/productName").getText();

        if(temp.equals("Jordan 6 Rings")) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not Matched");
        }

        */


/*        int priceCount = drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/rvCartProductList")).size();
        int totalPay = 0;
        int tempPay = 0;

        for (int j = 0; j < priceCount - 1; j++){

            tempPay =  Integer.valueOf(drTotalAmount.findElements(By.id("com.androidsample.generalstore:id/rvCartProductList")).get(j).getText().substring(1));
            totalPay = totalPay + tempPay;
        }

        int finalPayment = Integer.valueOf(drTotalAmount.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText().substring(1));

        if(totalPay == finalPayment){
            System.out.println("Equal");
        }
        else {
            System.out.println("Error");
        }*/


    }

    public static double getAmount(String value){
        value = value.substring(1);
        double amountValue = Double.parseDouble(value);
        return amountValue;
    }

}
