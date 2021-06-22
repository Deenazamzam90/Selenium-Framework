package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class TEDSearchPage extends PageBase{

    public TEDSearchPage(WebDriver driver){
        super(driver);
        jse=(JavascriptExecutor) driver;
        action = new Actions(driver);
    }
    @FindBy( xpath="//a[@href =\"/store/movies/details/Ted?id=B62C499CE174E140MV\"]")
    WebElement tedIcon;


    public void chooseTEDResult(){


        clickButton(tedIcon);


    }
}
