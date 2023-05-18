package Tests;
import Pages.Egypt_country_package_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EgyptCountryPackageTest extends Test_Base {

    Egypt_country_package_Page Egypt_country;

    @Test(priority = 1, alwaysRun = true)
    public void Check_Egypt_subscriptions_packages() {
        try {
            Egypt_country = new Egypt_country_package_Page(driver);
            Egypt_country.open_countries_options();
            Egypt_country.Select_country();


            Assert.assertTrue(Egypt_country.Egypt_country__in_Arabic.getText().contains("مصر"));
            System.out.println( "The assertion for Egypt country is TRUE  and the expected & actual value is  ( "  +  Egypt_country.Egypt_country__in_Arabic.getText() + " ) ");


            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400)");



            Assert.assertTrue(Egypt_country.Lite_packge.getText().contains("لايت"));
            System.out.println( "The assertion for Egypt -Lite package is TRUE and the expected & actual value is  ( " + Egypt_country.Lite_packge.getText() + " )");


            Assert.assertTrue(Egypt_country.Basic_package.getText().contains("الأساسية"));
            System.out.println( "The assertion for Egypt - Basic package is TRUE and the expected & actual value is  ( " + Egypt_country.Basic_package.getText() + ")");


            Assert.assertTrue(Egypt_country.Premium_package.getText().contains("بريميوم"));
            System.out.println(  "The assertion for Egypt- premium package is TRUE and the expected & actual value is  (  " + Egypt_country.Premium_package.getText() + " )");


            Assert.assertTrue(Egypt_country.Price_of_lite_package.getText().contains("25"));
            System.out.println(  "The assertion for Egypt- price of lite package is TRUE and the expected & actual value is  (  " + Egypt_country.Price_of_lite_package.getText() +  " )");


            Assert.assertTrue(Egypt_country.Price_of_basic_package.getText().contains("5"));
            System.out.println( "The assertion for Egypt- price of basic package is TRUE and the expected & actual value is  ( " + Egypt_country.Price_of_basic_package.getText() + ")");

            Assert.assertTrue(Egypt_country.Price_of_premium_package.getText().contains("1"));
            System.out.println( "The assertion for Egypt- price of premium package is TRUE and the expected & actual value is  (   " + Egypt_country.Price_of_premium_package.getText() + " )");


            Assert.assertTrue(Egypt_country.currency_of_lite_package.getText().contains("دولار"));
            System.out.println(  "The assertion for Egypt- currency of lite package is TRUE and the expected & actual value is  ( "  + Egypt_country.currency_of_lite_package.getText() + ")");


            Assert.assertTrue(Egypt_country.currency_of_base_package.getText().contains("دولار"));
            System.out.println("The assertion for Egypt- currency of basic package is TRUE  and thNe expected & actual value is  " + Egypt_country.currency_of_base_package.getText() +  ")");


            Assert.assertTrue(Egypt_country.currency_of_premium_package.getText().contains("دولار"));
            System.out.println( "The assertion for Egypt- currency of premium package is TRUE  and the expected & actual value is  (  " + Egypt_country.currency_of_premium_package.getText() + ")");


            Assert.assertTrue(Egypt_country.Viewing_Quality_of_lite_package.getText().contains("D"));
            System.out.println( "The assertion for Egypt- Viewing of quality for Lite package is TRUE   and the expected & actual value is  (  " + Egypt_country.Viewing_Quality_of_lite_package.getText() + ")");


            Assert.assertTrue(Egypt_country.Viewing_Quality_of_base_package.getText().contains("Full"));
            System.out.println( "The assertion for Egypt- Viewing of quality for basic package is TRUE  and the expected & actual value is (  " + Egypt_country.Viewing_Quality_of_base_package.getText() + ")");


            Assert.assertTrue(Egypt_country.Viewing_Quality_of_Premium_package.getText().contains("4k"));
            System.out.println( "The assertion for Egypt- Viewing of quality for premium package is TRUE  and the expected & actual value is  (  " + Egypt_country.Viewing_Quality_of_Premium_package.getText() + ")");


            Assert.assertTrue(Egypt_country.Number_of_devices_of_Lite_package.getText().contains("4"));
            System.out.println("The assertion for Egypt- Number of devices of lite package  is TRUE  and the expected & actual value is  ( " + Egypt_country.Number_of_devices_of_Lite_package.getText() +  ")");


            Assert.assertTrue(Egypt_country.Number_of_devices_of_base_package.getText().contains("4"));
            System.out.println( "The assertion for Egypt- Number of devices of basic package  is TRUE  and the expected & actual value is  (   " + Egypt_country.Number_of_devices_of_base_package.getText() + " ) ");


            Assert.assertTrue(Egypt_country.Number_of_devices_of_premium_package.getText().contains("8"));
            System.out.println("The assertion for Egypt- Number of devices of premium package  is TRUE and the expected & actual value is  (  " + Egypt_country.Number_of_devices_of_premium_package.getText() +  ")");


        } catch (Exception e) {
            System.out.println("Error occurred " + e.getMessage());

        }
    }
}
