package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTab;

    @FindBy(className = "nav-input")
    public WebElement searchbtn;


    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}