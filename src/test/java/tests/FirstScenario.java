package tests;
import org.testng.Assert;
import pages.*;
import org.testng.annotations.*;
import org.testng.Reporter;

public class FirstScenario extends TestBase{
  //  HomePage HomeObject=new HomePage(driver);


    @Test(priority = 1)
public void NavigatetoAppsTest() throws InterruptedException {


HomePage HomeObject;
HomeObject= new HomePage(driver);
HomeObject.navigateToProductsPage();



    String url=driver.getCurrentUrl();
    Assert.assertEquals(url, "https://play.google.com/store/apps");
    Reporter.log("User Navigates to Apps successfully");



}
   @Test(priority = 2)
    public void ChooseEductionTest() throws InterruptedException {


        HomePage HomeObject;
        HomeObject= new HomePage(driver);
        HomeObject.navigateToProductsPage();
        AppsPage AppsObject;
        AppsObject= new AppsPage(driver);
        AppsObject.chooseCategory();


        String url=driver.getCurrentUrl();
        Assert.assertEquals(url, "https://play.google.com/store/apps/category/EDUCATION");



    }
    @Test(priority = 3)
    public void searchForSomething() throws InterruptedException {


        HomePage HomeObject;
        HomeObject= new HomePage(driver);
        HomeObject.searchforText("TED");
        TEDSearchPage TEDSearchObject;
        TEDSearchObject= new TEDSearchPage(driver);
        TEDSearchObject.chooseTEDResult();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,         "https://play.google.com/store/movies/details/Ted?id=B62C499CE174E140MV");





    }


}
