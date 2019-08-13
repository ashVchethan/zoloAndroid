package testbase;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import utils.Base;
import utils.InitiateDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected AppiumDriver driver;

    //This will run before the testng.xml suite started
    @BeforeSuite(alwaysRun = true)
    public void setup(){
        //This will launch the appium server
        InitiateDriver initiateDriver = new InitiateDriver();
        driver = initiateDriver.getAppiumDriver();
        //this implicit wait will wait 35 seconds for all steps
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Base.driver=driver;
    }

    //this will close the app after executing all the test cases in testng.xml file
   // @AfterSuite(alwaysRun = true)
    public void quit(){
        driver.closeApp();
    }

}
