package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class FBSearchPage extends PageBase{

    public FBSearchPage(WebDriver driver){
        super(driver);
        jse=(JavascriptExecutor) driver;
        action = new Actions(driver);
    }
    @FindBy( xpath="//a[@href =\"/store/apps/details?id=com.facebook.katana\"]")
    WebElement fbIcon;


    public boolean checkFBIcon(){


        return fbIcon.isDisplayed();


    }
}
