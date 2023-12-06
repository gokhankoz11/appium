package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C01_SetupDriver {

@Test
    public  void testDesiredCapabilities() throws MalformedURLException {

    String appUrl = System.getProperty("user.dir")
            + File.separator + "src"
            + File.separator + "test"
            + File.separator + "resources"
            + File.separator + "ApiDemos-debug.apk";
    DesiredCapabilities capabilities=new DesiredCapabilities(); // (Genel icin)
    capabilities.setCapability("platformName","android"); // zorunlu
    capabilities.setCapability("automationName","uiautomator2"); // duruma göre degisir , zorunlu degil
    capabilities.setCapability("udid","69a5e19a0605"); // cmd ye yaz --> adb devices
    capabilities.setCapability("app",appUrl);
  //  capabilities.setCapability("appPackage","com.android.launcher3");
  //  capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");


    /*
    ustekkini app (yeterli)ya da alttaki appPackage, appActivity ikisi(beraber yeterli) kullan.


 *************** APK bilgileri Cmd den almak icin -->  adb shell dumpsys window | find "mCurrentFocus"
adb shell (enter bas)
dumpsys activity activities | grep mResumedActivity

 com.android.calculator2/com.android.calculator2.Calculator

     */

    URL url = new URL("http://0.0.0.0:4723");
    AndroidDriver driver= new AndroidDriver(url,capabilities);

}

    @Test
    public void testUiAutomator2Options() throws MalformedURLException { // (android icin)

        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";
       // "C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk"
    // File.separator slash lar icin kullanilir.


        UiAutomator2Options options=new UiAutomator2Options()
                .setUdid("69a5e19a0605")  // cmd de adb devices ile bagli cihazin  id sini bulabilriz.
                .setApp(appUrl)
         //      .setAppPackage("io.appium.android.apis")
         //      .setAppActivity("io.appium.android.apis.ApiDemos")
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver= new AndroidDriver(url,options);

    }



}
