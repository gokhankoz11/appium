package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C05_TemelEylemler extends ApiDemosBaseTest {
    @Test
    public void testTemelEylemler() throws MalformedURLException, InterruptedException {


        By app = AppiumBy.accessibilityId("App");
        By actvity = AppiumBy.accessibilityId("Activity");
        By customTitle = AppiumBy.accessibilityId("Custom Title");
        By leftTextBox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By rightTextBox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By leftButton = AppiumBy.accessibilityId("Change Left");
        By rightButton = AppiumBy.accessibilityId("Change Right");

        driver.findElement(app).click();
        driver.findElement(actvity).click();
        driver.findElement(customTitle).click();

        driver.findElement(leftTextBox).clear();
        driver.findElement(leftTextBox).sendKeys("Gökhan");
        driver.findElement(leftButton).click();

        driver.findElement(rightTextBox).clear();
        driver.setClipboardText("Gökhan"); // ctrl + C komutu gibi calisir
        Thread.sleep(3000);
        driver.findElement(rightTextBox).sendKeys(driver.getClipboardText()); // ctrl + V
        Thread.sleep(3000);
        driver.findElement(rightButton).click();

       KeyEvent back= new KeyEvent(AndroidKey.BACK);
       KeyEvent home= new KeyEvent(AndroidKey.HOME);

       driver.pressKey(back);
       Thread.sleep(2000);
       driver.pressKey(home);



    }



}
