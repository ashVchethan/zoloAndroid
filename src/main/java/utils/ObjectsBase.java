package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.util.concurrent.TimeUnit;

public class ObjectsBase {
    public static long wait = 10;

    public ObjectsBase(AppiumDriver driver){
        FieldDecorator fieldDecorator= new AppiumFieldDecorator(driver, wait, TimeUnit.SECONDS);
        PageFactory.initElements(fieldDecorator, this);
    }


}
