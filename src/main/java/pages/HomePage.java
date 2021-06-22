package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{

    public HomePage (WebDriver driver){
        super(driver);
        jse=(JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    @FindBy( id="gbqfq")
    WebElement searchField;

    @FindBy( xpath="//*[@id=\"gbqfb\"]")
            WebElement searchBtn;

@FindBy( xpath="//*[@id=\"fcxH9b\"]/div[1]/c-wiz[1]/ul/li[2]/a/span/span[2]")
    WebElement AppsBtn;
    @FindBy( xpath="//div[@href ='/store/movies/details/Ted?id=B62C499CE174E140MV'])")
    WebElement tedIcon;

    public void searchforText(String keyword){


        setTextElementText(searchField,keyword);
        clickButton(searchBtn);
        //jse.executeScript("arguments[0].click()",AppsBtn);


    }

    public void navigateToProductsPage(){


        clickButton(AppsBtn);

        //jse.executeScript("arguments[0].click()",AppsBtn);


    }
}
