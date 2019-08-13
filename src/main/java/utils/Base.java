package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static long wait=90;
    public static AppiumDriver driver;


    //This will check if element is visible
    public static boolean isElementVisible(WebElement element) {
        try{
            if(element.isDisplayed())
                return true;
            return false;
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            return false;
        }
    }

    //this explicit wait will wait till the visibility of element
    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void hideKeyboard(){
        try{
            driver.hideKeyboard();
        }
        catch (Exception e){
            System.out.println("Keyboard Already Closed");
        }
    }

    public static void sleep(long timeout){
        try{
            Thread.sleep(timeout);
        }
        catch (InterruptedException e){

        }
    }




}
