package techproed.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HomeworkLocateYontenleri02 {

    @Test
    public void accessiblityId() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options =new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("pixel_q_img")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver=new AndroidDriver(url,options);
        driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        Thread.sleep(2);

        WebElement nodeProvider=driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
        System.out.println("nodeProvider = " + nodeProvider.getText());

        WebElement nodeQuerying=driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
        System.out.println("nodeQuerying = " + nodeQuerying.getText());

        WebElement service=driver.findElement(AppiumBy.accessibilityId("Accessibility Service"));
        System.out.println("service = " + service.getText());

        WebElement customView=driver.findElement(AppiumBy.accessibilityId("Custom View"));
        System.out.println("customView = " + customView.getText());


    }

// C:\techpro\CucumberProjeckt\Batch151CucumberProjectFrameworks 2\Batch151CucumberProjectFrameworks\Appium_Upskills\src\test\resources\ApiDemos-debug.apk
    @Test
    public void idLocate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options =new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("pixel_q_img")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver=new AndroidDriver(url,options);
        driver.findElement(AppiumBy.accessibilityId("Content")).click(); // content e tikla
        Thread.sleep(2);

        WebElement assets=driver.findElements(AppiumBy.id("android:id/text1")).get(0);
        System.out.println("assets = " + assets.getText());

        WebElement clipoboard=driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("clipoboard = " + clipoboard.getText());

        WebElement packages=driver.findElements(AppiumBy.id("android:id/text1")).get(2);
        System.out.println("packages = " + packages.getText());

        WebElement provider =driver.findElements(AppiumBy.id("android:id/text1")).get(3);
        System.out.println("provider = " + provider.getText());

        WebElement resouces =driver.findElements(AppiumBy.id("android:id/text1")).get(4);
        System.out.println("resouces = " + resouces.getText());

        WebElement storage =driver.findElements(AppiumBy.id("android:id/text1")).get(5);
        System.out.println("storage = " + storage.getText());


    }

    @Test
    public void className() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options =new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("pixel_q_img")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver=new AndroidDriver(url,options);
        driver.findElement(AppiumBy.accessibilityId("Media")).click(); // Media e tikla
        Thread.sleep(2);

        WebElement audioFx=driver.findElements(AppiumBy.className("android.widget.TextView")).get(1);
        System.out.println("audioFx = " + audioFx.getText());

        WebElement mediaPlayer=driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("mediaPlayer = " + mediaPlayer.getText());

        WebElement videoView=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
        System.out.println("videoView = " + videoView.getText());

    }

    @Test
    public void uiAutomaterLocate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options =new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("pixel_q_img")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver=new AndroidDriver(url,options);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")")).click(); // Media e tikla
        Thread.sleep(2);

        WebElement dispatch=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\")"));
        System.out.println("dispatch = " + dispatch.getText());

        WebElement nDefpush=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundNdefPush\")"));
        System.out.println("nDefpush = " + nDefpush.getText());

        WebElement techFilter=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"TechFilter\")"));
        System.out.println("techFilter = " + techFilter.getText());

    }


    @Test
    public void osLocate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options =new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("pixel_q_img")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver=new AndroidDriver(url,options);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OS\"]")).click(); //  tikla
        Thread.sleep(2);

        WebElement morseCode=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Morse Code\"]"));
        System.out.println("morseCode = " + morseCode.getText());

        WebElement rotationVector=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Rotation Vector\"]"));
        System.out.println("rotationVector = " + rotationVector.getText());

        WebElement sensors=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Sensors\"]"));
        System.out.println("sensors = " + sensors.getText());

        WebElement sms=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"SMS Messaging\"]"));
        System.out.println("sms = " + sms.getText());

    }








}
