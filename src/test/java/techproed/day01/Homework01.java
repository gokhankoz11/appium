package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Homework01 {

    @Test
    public  void testDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","69a5e19a0605");
      //  capabilities.setCapability("app","C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
          capabilities.setCapability("appPackage","com.google.android.calculator");
          capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        // com.google.android.calculator/com.android.calculator2.Calculator


    /*
    ustekki ya da alttaki ikisi kullan
https://play.google.com/store/apps/details?id=com.google.android.calculator

   *********** adb shell dumpsys window | find "mCurrentFocus" *************** apk pakage ve activity cmd den aldirir
     */

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver= new AndroidDriver(url,capabilities);

    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options()
                .setUdid("69a5e19a0605")  // cmd de adb devices ile bagli cihazin  id sini bulabilriz.
              //  .setApp("C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                      .setAppPackage("com.google.android.calculator")
                      .setAppActivity("com.android.calculator2.Calculator")
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver= new AndroidDriver(url,options);
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"artı\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"6\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"eşittir\"]")).click();



    }


    @Test // navigasyon Emülator
    public  void testDesiredCapabilities2() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","emulator-5554");
        //  capabilities.setCapability("app","C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("appPackage","com.google.android.deskclock");
        capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");


        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver= new AndroidDriver(url,capabilities);

    }


// //android.widget.TextView[@resource-id="com.google.android.googlequicksearchbox:id/googleapp_zero_prefix_landing_page"]

    @Test // navigasyon Emülator
public  void testDesiredCapabilities3() throws MalformedURLException {
    DesiredCapabilities capabilities=new DesiredCapabilities();
    capabilities.setCapability("platformName","android");
    capabilities.setCapability("automationName","uiautomator2");
    capabilities.setCapability("udid","emulator-5554");
    //  capabilities.setCapability("app","C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
    capabilities.setCapability("appPackage","com.google.android.googlequicksearchbox");
    capabilities.setCapability("appActivity", "com.google.android.googlequicksearchbox.SearchActivity");


    URL url = new URL("http://0.0.0.0:4723");
    AndroidDriver driver= new AndroidDriver(url,capabilities);
    driver.findElement(By.xpath("android.widget.TextView[@resource-id=\"com.google.android.googlequicksearchbox:id/googleapp_zero_prefix_landing_page\"]\n")).click();

}






}
