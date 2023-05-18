package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_Base {

   // protected WebDriver driver ;

    // create constructor
    public Page_Base( WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button)
    {
        button.click();
    }


}
