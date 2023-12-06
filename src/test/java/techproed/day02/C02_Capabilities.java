package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {

    @Test
    public void testUiAutomator2Options() throws MalformedURLException { // (android icin)
        UiAutomator2Options options=new UiAutomator2Options()
              //  .setUdid("69a5e19a0605")  // cmd de adb devices ile bagli cihazin  id sini bulabilriz.
                .setApp("C:\\techpro\\CucumberProjeckt\\Batch151CucumberProjectFrameworks 2\\Batch151CucumberProjectFrameworks\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
               // calistiracagimiz uygulamayi secmek icin

                //      .setAppPackage("io.appium.android.apis")
                //      .setAppActivity("io.appium.android.apis.ApiDemos")
                .setAvd("pixel_q_img")  // sadece kapali emülatoru acar
                .setAvdLaunchTimeout(Duration.ofSeconds(5)) // emülatorün acilisinda süre tanimlamasi yapmak iscin
                ;

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver= new AndroidDriver(url,options);

        // bagli butun emülatoru listeler cmd de

    }
// https://inspector.appiumpro.com/ internetten inspectoru calistirir

// appium --allow-cors bu kodu cmd ye ekle

}

/*
package techproed.day02;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class C02_Capabilities {
    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp("C:\\Users\\gurka\\IdeaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk") // Çalıştıracağımız uygulamayı seçmek için
                .setUdid("3681c19b") // adb devices - Hangi cihazda testimi çalıştıracaksam onun udid bilgisini giriyorum
                .setAppPackage("io.appium.android.apis") // Çalıştıracağımız uygulamayı seçmek için
                .setAppActivity("io.appium.android.apis.ApiDemos") // Çalıştıracağımız uygulamayı seçmek için
                .setAvd("pixel_q_img") // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(5)) // Emülatörün açılışında süre tanımlaması yapmak için
                ;
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);
    }
}


 */
