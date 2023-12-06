package techproed.day09;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.basetest.CalculatorBaseTest;

import java.time.Duration;
import java.util.Collections;

public class C16_PointerInput_DoubleTap extends CalculatorBaseTest {


    @Test
    public void testDoubleTap() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        WebElement element = driver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1)
                // ilk tiklama
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 875, 400))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))

                // ikinci tiklama adimi --- kordinatlarda kucuk degisiklikler yapilabilr tavsiye-- 10 msaniye eklenebilir
                .addAction(finger.createPointerMove(Duration.ofMillis(10), PointerInput.Origin.viewport(), 870, 395))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));
        bekle(3000);

    }
}
