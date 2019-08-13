package testbase.launchtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;
import testbase.TestBase;


public class enterMobileNumberTest extends TestBase {

    @Test(priority = 1)
    public void verifyTextMsgInPhoneNumberField(){
        //Verifying the text message in phone number field
        Assert.assertEquals(Pages.enterMobileNumber().verifyTextMsg(),"Please enter your phone number to continue");
    }

    @Test(priority = 2)
    public void verifyAppLogo(){
        Assert.assertTrue(Pages.enterMobileNumber().verifyAppLogo(),"logo is missing");
    }

    @Test(priority = 3)
    public void enterMobileNumberTest(){
        String MOBILENUMBER ="8876459845";
        //Enter phone number and click continue button
        Assert.assertTrue(Pages.enterMobileNumber().mobileNumber(MOBILENUMBER),"Failed to enter mobile number");
    }

}
