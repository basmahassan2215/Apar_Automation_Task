package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Egypt_country_package_Page extends Page_Base {

    public Egypt_country_package_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='country-current']")
    public WebElement Current_Country;


    @FindBy(xpath = "//*[@id='eg-contry-flag']")
    public WebElement Egypt;
    @FindBy (xpath =  "//*[contains(text(),'مصر') and @id= 'country-name']")
    public  WebElement Egypt_country__in_Arabic ;



    @FindBy (xpath = "//*[@id= 'name-لايت']")
    public WebElement Lite_packge ;
    @FindBy (xpath = "//*[@id= 'name-الأساسية']")
    public WebElement Basic_package ;
    @FindBy (xpath = "//*[@id= 'name-بريميوم']")
    public WebElement Premium_package ;



    @FindBy (xpath = "//*[@id=\"currency-لايت\"]/b")
    public WebElement Price_of_lite_package ;
    @FindBy (xpath = "//*[@id=\"currency-الأساسية\"]/b")
    public WebElement Price_of_basic_package ;
    @FindBy (xpath = "//*[@id=\"currency-بريميوم\"]/b")
    public WebElement Price_of_premium_package ;




    @FindBy (xpath = "//*[@id=\"currency-لايت\"]/i")
    public WebElement currency_of_lite_package ;
    @FindBy (xpath = "//*[@id=\"currency-الأساسية\"]/i")
    public WebElement  currency_of_base_package ;
    @FindBy (xpath = "//*[@id=\"currency-بريميوم\"]/i")
    public WebElement  currency_of_premium_package ;







    @FindBy (xpath = "(//*[@class='plan-names'])[4]//div[1]")
    public  WebElement Viewing_Quality_of_lite_package ;
    @FindBy (xpath = "(//*[@class='plan-names'])[4]//div[2]")
    public  WebElement Viewing_Quality_of_base_package ;
    @FindBy (xpath = "//*[@id=\"main\"]/div/div[2]/div[5]/div[2]/div[3]")
    public  WebElement Viewing_Quality_of_Premium_package ;





    @FindBy (xpath =  "(//*[@class='plan-names'])[5]//div[1]")
    public  WebElement Number_of_devices_of_Lite_package ;
    @FindBy (xpath =  "(//*[@class='plan-names'])[5]//div[2]")
    public WebElement Number_of_devices_of_base_package ;
    @FindBy (xpath = "(//*[@class='plan-names'])[5]//div[3]")
    public WebElement Number_of_devices_of_premium_package ;



    // Action class to open the countries options (Egypt
    public void open_countries_options ()
    {
      clickButton(Current_Country);
    }

    // Action class to SELECT country
    public void  Select_country()
    {
        clickButton(Egypt);
    }


















}
