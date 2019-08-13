package testbase.launchtest;

import launchapp.InitialProcess;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;
import testbase.TestBase;

public class InitialProcessTest extends TestBase {


    @Test(priority = 1)
    public void firstScreenValidation(){
       //Verifying  header message with expected value
        Assert.assertEquals(Pages.initialProcess().firstScreenHeader(),"Great Places to Stay");
        //Verifying  header content with expected value
        Assert.assertEquals(Pages.initialProcess().firstScreenContent(),"High-quality ready-to-move-in spaces");
    }

    @Test(priority = 2)
    public void clickNextBtn(){

        Assert.assertTrue(Pages.initialProcess().clickNxtBtn(),"failed to click next button");
    }

    @Test(priority = 3)
    public void secondScreenValidation(){
        //Verifying  header message with expected value
        Assert.assertEquals(Pages.initialProcess().secondScreenHeader(),"At Affordable Prices");
        //Assert.assertEquals(Pages.initialProcess().secondScreenContent(),"Starts at Rs.5000 per month Only one month deposit");
        Assert.assertTrue(Pages.initialProcess().verifyBackBtn(),"failed to verify back button");

    }

    @Test(priority = 4)
    public void clickNextBtn2(){

        Assert.assertTrue(Pages.initialProcess().clickNxtBtn(),"failed to click next button");
    }

    @Test(priority = 5)
    public void thirdScreenValidation(){
        //Verifying  header message with expected value
        Assert.assertEquals(Pages.initialProcess().thirdScreenHeader(),"Made Easy by Technology");
        Assert.assertEquals(Pages.initialProcess().thirdScreenContent(),"Pay rent | Get issues resolved | Refer and Earn");

    }

    @Test(priority = 6)
    public void clickNextBtn3(){

        Assert.assertTrue(Pages.initialProcess().clickNxtBtn(),"failed to click next button");
    }

    @Test(priority = 7)
    public void fourthScreenValidation(){
        //Verifying  header message with expected value
        Assert.assertEquals(Pages.initialProcess().fourthScreenHeader(),"Your Choice of Services");
        Assert.assertEquals(Pages.initialProcess().fourthScreenContent(),"Good food | Good wifi | Good life");

    }

    @Test(priority = 8)
    public void clickNextBtn4(){

        Assert.assertTrue(Pages.initialProcess().clickNxtBtn(),"failed to click next button");
    }

}
