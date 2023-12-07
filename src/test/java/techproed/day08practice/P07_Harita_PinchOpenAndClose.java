package techproed.day08practice;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.HaritalarBaseTest;
public class P07_Harita_PinchOpenAndClose extends HaritalarBaseTest {
    /*
    Uygulama: Haritalar
        Haritalar uygulamasına gir
        Harita türü olarak Uydu seçeneğini seç
        Arama motorunda Taj Mahal kelimelerini arat
        Haritada Taj Mahal bölgesine zoom in ve zoom out işlemlerini yap
    */
    @Test
    public void testPinchOpenAndClose() throws InterruptedException {
        WebElement katmanlar = driver.findElement(AppiumBy.accessibilityId("Katmanlar"));
        clickGesture(driver, katmanlar);
        WebElement uydu = driver.findElement(AppiumBy.accessibilityId("Uydu"));
        clickGesture(driver, uydu);
        WebElement menuyuKapat = driver.findElement(AppiumBy.accessibilityId("Menüyü kapat"));
        clickGesture(driver, menuyuKapat);
        WebElement aramaMotoru = driver.findElement(AppiumBy.accessibilityId("Burada arayın"));
        clickGesture(driver, aramaMotoru);
        WebElement metinArama = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/search_omnibox_edit_text"));
        metinArama.sendKeys("Rams Park Stadium");
        KeyEvent enter = new KeyEvent(AndroidKey.ENTER);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     //   driver.pressKey(enter);
        Thread.sleep(5000);
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));
        Thread.sleep(2000);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));

        Thread.sleep(5000);

    }
}