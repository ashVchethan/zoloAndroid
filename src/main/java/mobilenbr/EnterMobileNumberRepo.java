package mobilenbr;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.ObjectsBase;

public class EnterMobileNumberRepo extends ObjectsBase{

    public EnterMobileNumberRepo(AppiumDriver driver){
        super(driver);
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.zelo.customer:id/phone_number\"]")
    public static MobileElement phoneNumberField;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.zelo.customer:id/submit\"]")
    public static MobileElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.zelo.customer:id/app_bar\"]")
    public static MobileElement applogo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zelo.customer:id/textView2\"]")
    public static MobileElement verifyText;
//Please enter your phone number to continue

}
