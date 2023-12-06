package techproed.day07;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.VodQABaseTest;
public class C14_PinchOpenAndCloseGestures extends VodQABaseTest {
    @Test
    public void testPinchOpenAndCloseGesturesElement() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();
        WebElement element = driver.findElement(AppiumBy.className("android.widget.ImageView"));
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(2000);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(5000);
    }
    @Test
    public void testPinchOpenAndCloseGesturesCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();
        Thread.sleep(1000);
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 200, "top", 1000, "width", 700, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(2000);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 200, "top", 1000, "width", 700, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(5000);
    }
}