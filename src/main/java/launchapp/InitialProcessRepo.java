package launchapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import utils.ObjectsBase;

public class InitialProcessRepo extends ObjectsBase{

    public InitialProcessRepo(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public static MobileElement verifyImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zelo.customer:id/heading\"]")
    public static MobileElement verifyHeaderText;
    //Great Places to Stay
    // At Affordable Prices
    //Made Easy by Technology
    //Your Choice of Services

    @AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
    public static MobileElement verifyContentText;
    //High-quality ready-to-move-in spaces
    // Starts at Rs.5000 per month Only one month deposit
    //Pay rent | Get issues resolved | Refer and Earn
    //Good food | Good wifi | Good life

   @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,\"Back\")]")
   public static MobileElement backBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,\"NEXT\")]")
    public static MobileElement nextBtn;




}
