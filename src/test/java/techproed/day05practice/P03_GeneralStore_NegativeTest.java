package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.GeneralStoreBaseTest;

public class P03_GeneralStore_NegativeTest extends GeneralStoreBaseTest {


    /*

            Uygulama: GeneralStore
        GeneralStore uygulamasına gir
        Menüden Angola seçeneğini seç
        Your Name kutusunu boş bırak
        Let’s Shop butonuna tıkla
        Hata mesajını doğrula (Toast Message)






     */

    @Test
    public void testGeneralStoreNegativeTest() {
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

String toastMessage=driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
// Toast olusturmak icin //android.widget.Toast yapmak zorunda.name in icine koaymak orunda
        Assert.assertEquals(toastMessage,"Please enter your name");





    }
}
