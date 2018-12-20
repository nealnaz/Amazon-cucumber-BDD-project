package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clothing {
    WebDriver driver;

    @FindBy(id = "nav-a-content")
    public WebElement nw;

    @FindBy(linkText = "jwellery")
    public WebElement jwell;

    @FindBy(className = "a-size-base s-inline  s-access-title  a-text-normal")
    public WebElement chain;

    @FindBy(id = "add-to-cart-button")
    public WebElement add;

    @FindBy(id = "hlb-ptc-btn-native")
    public WebElement check;

    @FindBy(id = "ap_email")
    public WebElement em;

    @FindBy(id = "ap_password")
    public WebElement pass;

    @FindBy(id = "signInSubmit")
    public WebElement sign;





public  Clothing (WebDriver driver){
    PageFactory.initElements(driver,this);

}
}
