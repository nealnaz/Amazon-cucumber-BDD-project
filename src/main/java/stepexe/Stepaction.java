package stepexe;

import Baseclass.parent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Clothing;
import pages.Homepage;

import java.util.concurrent.TimeUnit;

public class Stepaction extends parent {

    Homepage hp = new Homepage(driver);
    Clothing cp = new Clothing(driver);

    public void iam_on_home_page() {
     driver.get("https://www.amazon.co.uk/");

    }

    @Test (priority = 1, description = "starsearch test")


    public void enter_clothing_in_search_bar() {
        hp.searchTab.sendKeys("clothing");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void click_search() {
        hp.searchbtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
   @Test (priority =2,description = "hoovertest")

    public void hover_on_new() {
        Actions act =new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-a-conten"))).perform();

    }

    public void click_jeans() {
        cp.jwell.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void click_new_look_jeans() {
     cp.chain.click();
    }


    public void add_to_basket() {
        cp.add.click();
    }


    public void cick_proceed_to_checkout() {
        cp.pass.click();
    }
   @Test(priority =3,description = "emailtest")
    public void enter_email() {
        cp.em.sendKeys("xyz@gmail.com");
    }


    public void enter_password() {
        cp.pass.sendKeys("123456");
    }


    public void click_sign_in() {
        cp.sign.click();
    }



    public void validate_purchase() {




    }

}

