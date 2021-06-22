package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppsPage;
import pages.FBSearchPage;
import pages.HomePage;
import pages.TEDSearchPage;

public class SecondScenario extends TestBase{
  //  HomePage HomeObject=new HomePage(driver);


    @Test(priority = 4)
public void SearchFacebook() throws InterruptedException {


HomePage HomeObject;
HomeObject= new HomePage(driver);
HomeObject.searchforText("facebook");
        FBSearchPage FBSearchObject;
        FBSearchObject= new FBSearchPage(driver);




    Assert.assertTrue(FBSearchObject.checkFBIcon());



}



}
