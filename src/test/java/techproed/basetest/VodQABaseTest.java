package techproed.basetest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import techproed.utilities.ReusableMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class VodQABaseTest extends ReusableMethods {

   public AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "VodQA.apk";
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl);
        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

/*
Implicitly Wait:-->belirtilen süreye kadar bekler
Implicitly wait'i TestBase class'ımızda kullanıyoruz.
driver.manage().timeouts().implicitlyWait (Duration. ofSeconds (10));--> bu geneldde kullanilan ve testbase e atilan

Explicit Wait:FluentWait-->belirtilen saniye araliklarinde testt eder ve bekler-->bunda spesifik milisaniye atayabiliyoruz, bu milisaniyelerde sayfayi kontrol ediyor.
Explicit Wait: WebDriverWait-->-e kadar bekle, default yarim saniyelik araliklarla test eder ve belirtilen süre kadar bekler


    Bu ikisinin farki sadece milisaniye atayabilmek.

Olusturdugumuz wait objesi sayesinde WebDriverWait class'indan until() method'u ile birlikte
ExpectedConditions Class'ini kullanabiliriz. Ornegin WebElement'i locate etmek icin wait object'i kullanmak icin

WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
WebElement element = wait.until(Expected Conditions.visibilityOfElementLocated (By.xpath("...")));

 */