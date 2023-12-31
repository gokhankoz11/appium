package techproed.basetest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import techproed.utilities.ReusableMethods;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class DeviceBaseTest extends ReusableMethods {
    protected AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
            //    .setUnlockType("pin") // kilit turu
             //   .setUnlockKey("11111"); // sifre
                .setUnlockType("pattern")
                .setUnlockKey("14258") // desen icin izlenen sayilar
        ;
        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}