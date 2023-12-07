package techproed.day11;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyInput;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C25_Klavye extends ApiDemosBaseTest {

    @Test
    public void testIsKeyboardShown() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));

        System.out.println(driver.isKeyboardShown());
        driver.findElement(AppiumBy.accessibilityId("TextFields")).click();


        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
        System.out.println(driver.isKeyboardShown());

        driver.hideKeyboard(); // klavyeyi gizleme yapar
        System.out.println(driver.isKeyboardShown()); // false

        bekle(2);



    }

    @Test
    public void testPressKey() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));
        driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();

        KeyEvent home =new KeyEvent(AndroidKey.HOME); // import io.appium.java_client.android.nativekey.KeyEvent; buradan import et
        driver.pressKey(home);

        KeyEvent back =new KeyEvent(AndroidKey.BACK);
        driver.pressKey(back);

        KeyEvent appSwitch =new KeyEvent(AndroidKey.APP_SWITCH); // arkada acik uygulamalari gösterir
        driver.pressKey(appSwitch);

        KeyEvent home1 =new KeyEvent(AndroidKey.HOME); // import io.appium.java_client.android.nativekey.KeyEvent; buradan import et
        driver.pressKey(home1);



        // withKey arastir




    }


}
