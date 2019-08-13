package mobilenbr;

import utils.Base;

public class EnterMobileNumber extends Base {
    private static EnterMobileNumberRepo mn;
    public EnterMobileNumber(){
        mn = new EnterMobileNumberRepo(driver);
    }

    public String verifyTextMsg(){
        waitUntilElementIsVisible(mn.verifyText);
        return mn.verifyText.getText();
    }

    public boolean verifyAppLogo(){
        return isElementVisible(mn.applogo);
    }

    public boolean mobileNumber(String i){
        mn.phoneNumberField.sendKeys(i);
        mn.continueBtn.click();
        return true;
    }



}
