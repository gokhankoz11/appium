package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C06_ElementDegerleriniCekme extends ApiDemosBaseTest {
    @Test
    public void testTemelEylemler() throws MalformedURLException, InterruptedException {


        By accessibility = AppiumBy.accessibilityId("Accessibility");

        System.out.println("Get Ttext : " + driver.findElement(accessibility).getText());
        System.out.println("Get Attribute : " + driver.findElement(accessibility).getAttribute("package"));
        System.out.println("Get Attribute : " + driver.findElement(accessibility).getAttribute("checkable"));

        System.out.println("Is Selected : "+driver.findElement(accessibility).isSelected());
        System.out.println("Is Enabled : "+driver.findElement(accessibility).isEnabled());

        System.out.println("isDisplayed : "+driver.findElement(accessibility).isDisplayed());

        System.out.println("Get Size : "+driver.findElement(accessibility).getSize());
        System.out.println("Get Location : "+driver.findElement(accessibility).getLocation());


    }



}
