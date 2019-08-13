package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

public class InitiateDriver {

    //Should start appium server in local machine
    private AppiumDriver appiumDriver;
    public InitiateDriver(){

        //app path
        File app = new File("./src/main/resources/Zolo_com.zelo.customer.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName", "moto");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("app", app);
        capabilities.setCapability("appPackage", "com.zelo.customer");
        capabilities.setCapability("appActivity", "com.zelo.customer.view.activity.SplashActivity");

        try{
         FileInputStream file = new FileInputStream("./src/main/resources/config.properties");
         Properties prop = new Properties();
         prop.load(file);
         //appium server url is stored in config.properties file
         String appiumserver = prop.getProperty("AndroidAppURL");

            appiumDriver = new AndroidDriver(new URL(appiumserver),capabilities);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //throws null if appium driver not initiated
    public AppiumDriver getAppiumDriver() {
        if(appiumDriver==null)
            throw new RuntimeException("Driver has not been instantiated");

        return appiumDriver;
    }

}
