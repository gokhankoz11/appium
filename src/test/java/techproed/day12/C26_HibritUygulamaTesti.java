package techproed.day12;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.util.Set;

public class C26_HibritUygulamaTesti extends ApiDemosBaseTest {
    @Test
    public void testHibrit() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        driver.findElement(AppiumBy.accessibilityId("WebView")).click();
        bekle(3);
        Set<String> contextHandles = driver.getContextHandles();
        for (String contextName : contextHandles) {
            System.out.println(contextName);
        }
        driver.context("WEBVIEW_io.appium.android.apis"); // hibrit e gectik bunu kullanmazsak invalidexception aliririz

        System.out.println("Url : " +driver.getCurrentUrl());

        System.out.println("Baslik : " + driver.findElement(By.tagName("h1")).getText());

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP"); // kullaanmzsak invalidargument exeption aliriz
        driver.findElement(AppiumBy.accessibilityId("Visibility")).click();

        bekle(2);

        /*
 Test çalıştırdığımızda eğer "ChromeDriver bulunamadı" şeklinde bir hata mesajı alırsak, server'ı aşağıdaki
 komut ile çalıştırıp, testi tekrar çalıştırırız. Böylece chromedriver bilgisayarımıza otomatik olarak yüklenir.
 appium --allow-insecure chromedriver_autodownload
 */

    }
}
// native den hbcritte gecerken chrome hatasi olursa uygula :

// 1- google chrome sürüm hatasi oldugunda
// https://chromedriver.chromium.org/downloads
//indir resourse at istedigin  baseTest e tanimla


// 2-  chrome driver i ihtiyac duydugununda otomatik indirmesi icin cmd ye bunu
// appium --allow-insecure chromedriver_autodownload
// yapistir


/*
driverHandle surecinde eger ChromeDriver uygun surum bulamazsa:
hata:
":io.appium.java_client.NoSuchContextException: An unknown server-side error occurred while processing the command. Original error: No Chromedriver found that can automate Chrome '49.0.2623'. You could also try to enable automated chromedrivers download as a possible workaround." hatasi alinir

cmd calistir
appium --allow-insecure chromedriver_autodownload
kod girdikten sonra testi calistir

chrome://inspect ile lokate alabiliriz

 */