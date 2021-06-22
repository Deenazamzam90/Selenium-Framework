package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AppsPage extends PageBase{

    public AppsPage(WebDriver driver){
        super(driver);
        jse=(JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    @FindBy(xpath="//*[@id=\"action-dropdown-parent-Categories\"]/span[1]")
    WebElement categorisList;
    @FindBy(xpath="//*[@id=\"action-dropdown-children-Categories\"]/div/ul/li[1]/ul/li[11]/a")
    WebElement EducationOptions;

    public void chooseCategory() throws InterruptedException {


        clickButton(categorisList);
        Thread.sleep(5000);
        clickButton(EducationOptions);


    }
}
