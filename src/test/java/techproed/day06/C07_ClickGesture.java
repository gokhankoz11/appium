package techproed.day06;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C07_ClickGesture extends ApiDemosBaseTest {
    // appium gesture komutlari
    // https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md#mobile-clickgesture


    @Test
    public void testClickGesture() throws InterruptedException {

        //   driver.manage().window().getSize(); // tlf in cozunurlugunu goruruz.
        WebElement os = driver.findElement(AppiumBy.accessibilityId("OS"));

        //  driver.executeScript("mobile: clickGesture", ImmutableMap.of(
        //          "elementId", ((RemoteWebElement) os).getId()
        //  ));
        clickGesture(driver, os);

        Thread.sleep(3000);
    }

    @Test
    public void testClickGestureCordinate() throws InterruptedException {

        //     driver.executeScript("mobile: clickGesture", ImmutableMap.of(
        //             "x", 740,
        //             "y", 1088));
        //     Thread.sleep(3000);
        // }

        clickGesture(driver,740,1088);

    }


}
