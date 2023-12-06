package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.MyDemoBaseTest;

import java.util.List;

public class Homework05 extends MyDemoBaseTest {
    /*

                Uygulama: MyDemoApp
            1. MyDemoApp uygulamasına gir
            2. Menüyü aç
            3. Login ol (bob@example.com, 10203040)
            4. Login butonuna tıkla
            5. İlk ürünü seç
            6. Ürün miktarını ikiye çıkar
            7. Add To Cart butonuna tıkla
            8. Sepete git
            9. Ürün miktarının Toplam miktar ile aynı olduğunu
            doğrla
            10. Proceed To Checkout butonuna tıkla

     */

    @Test
    public void testMyDemoTest05() {
        By menu = AppiumBy.accessibilityId("open menu");
        By logIn = AppiumBy.accessibilityId("menu item log in");
        By usernameInputField = AppiumBy.accessibilityId("Username input field");
        By passwordInputField = AppiumBy.accessibilityId("Password input field");
        By loginButton = AppiumBy.accessibilityId("Login button");
        By notNow = AppiumBy.accessibilityId("android:id/autofill_save_no");
        List<WebElement> canta = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().packageName(\"com.saucelabs.mydemoapp.rn\")"));
        canta.get(9);
        By artiButton = AppiumBy.accessibilityId("counter plus button");
        By addToCartButton = AppiumBy.accessibilityId("Add To Cart button");
        By cartBadge = AppiumBy.accessibilityId("cart badge");

        List<WebElement> urunAdet = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"2\")"));
        urunAdet.get(2);







    }
}
