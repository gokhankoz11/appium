package techproed.day04practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class P01_ApiDemos extends ApiDemosBaseTest {

  /*
          Uygulama: ApiDemos
        API Demos uygulamasına gir
        Preference seçeneğine tıkla
        3. Preference dependencies seçeneğine tıkla
        WiFi kontrol kutusunu seç
        WiFi settings seçeneğine tıkla
        Açılan ekrandaki başlığın WiFi settings olduğunu doğrula
        Metin kutusuna adını yaz
        Tamam butonuna tıkla

   */

    @Test
    public void testApiDemos(){
        By preference = AppiumBy.accessibilityId("Preference");
        By dependencies = AppiumBy.accessibilityId("3. Preference dependencies");
        By checkBox= By.id("android:id/checkbox");
        By wifSettings=AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")");
        By title = By.id("android:id/alertTitle");
       By textBox= By.className("android.widget.EditText"); // kizarirsa AppiumBy ile kullan
        By okButton= By.id("android:id/button1");

        driver.findElement(preference).click();
        driver.findElement(dependencies).click();
        driver.findElement(checkBox).click();
        driver.findElement(wifSettings).click();
        Assert.assertEquals(driver.findElement(title).getText(),"WiFi settings");
    driver.findElement(textBox).sendKeys("Gökhan");
    driver.findElement((okButton)).click();



    }


/*
locate tercih sirasi :
accesibityid
id classname
uiselector
xpath

new UiScrollable(new UiSelector()).scrollIntoView(text(\"TAMAM\"));  yerine gidilemeyen yerler icin ekran kaydirir  tamam (WiFi settings) yerine element i yaz


appium belgesi
https://developer.android.com/reference/android/support/test/uiautomator/UiSelector
 */

}
