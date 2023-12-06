package techproed.day04practice;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.GeneralStoreBaseTest;

import java.util.List;

public class P02_GeneralStore extends GeneralStoreBaseTest {

    /*

//      Uygulama: GeneralStore
//  GeneralStore uygulamasına gir
//  Menüden Angola seçeneğini seç
//  Your Name kutusuna Safinaz yaz
//  Gender bölümünden Female seçeneğini seç
//  Let’s Shop butonuna tıkla
//  Ürün listesindeki iki ürünü sepete ekle
//  Sepete gir
//  Sepette iki ürün olduğunu doğrula
//  Ürün fiyatlarını topla
//  Total Purchase Amount bölümündeki tutarın doğru olduğunu doğrula
//  Send me e-mails.. kutusunu seç
//  Visit to the website.. butonuna tıkla
//
//
     */
    @Test
    public void testGeneralStore() throws InterruptedException {
        WebElement menu = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry"));
        menu.click();
        WebElement angola = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Angola\"]"));
        angola.click();
        WebElement nameBox=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField"));
        nameBox.sendKeys("Safinaz");

        WebElement female=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale"));
        female.click();

    //   WebElement button=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
    //   button.click();
    //   Thread.sleep(3000);
    //   List<WebElement> addToCart=driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart"));
    //  addToCart.get(0).click();
    //  addToCart.get(1).click();

        WebElement button = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop"));
        button.click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).click();


        //Add to cart yazisi get 0 ile click yapildiginda added to cart oldugu icin get 1 de elemani bulamiyor

        // ilk eleman sepete eklendigi icin, ismi degisiyor ve siradaki urun yine sifirinci indeks olmus oluyor.
        //bu sebeple iki kez sifirinci indekse tikliyoruz. 0-1 yazarsak, ilk urun secildikten sonra ikinci urun 0 olacagi icin
        //birinci indeksi bulamaz ve hata verir.

        WebElement cart = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart"));
        cart.click();
        List<WebElement> products = driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));
        Assert.assertEquals(products.size(), 2);

        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            String priceText = products.get(i).getText(); // $160.97 --> $120.0
            double price = Double.parseDouble(priceText.substring(1)); // 160.97  --> 120.0
            total += price;
        }

        /*
        for (WebElement w:products) {
    String priceText = w.getText();
    double price = Double.parseDouble(priceText.substring(1));
    total += price;
}

         */



        double totalAmount = Double.parseDouble(driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText().substring(1));

        Assert.assertEquals(total, totalAmount);

        WebElement checkBox=driver.findElement(AppiumBy.className("android.widget.CheckBox"));
        checkBox.click();
        WebElement visitButton=driver.findElement(AppiumBy.id(("com.androidsample.generalstore:id/btnProceed")));
        visitButton.click();
        Thread.sleep(10000);




    }


}
