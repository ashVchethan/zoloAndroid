package launchapp;

import utils.Base;

public class InitialProcess extends Base {
    private static InitialProcessRepo fp;
    public InitialProcess(){
        fp = new InitialProcessRepo(driver);
    }


    public String firstScreenHeader(){
    waitUntilElementIsVisible(fp.verifyImage);
    String sr = fp.verifyHeaderText.getText();
        return sr;
    }

    public String firstScreenContent(){
        String sr = fp.verifyContentText.getText();
        return sr;
    }

    public boolean clickNxtBtn(){
        //can use swipe or NEXT button will also work fine
       // driver.swipe(930, 1240, 120, 1240, 1000);
        fp.nextBtn.click();
        return true;
    }

    public String secondScreenHeader(){
        waitUntilElementIsVisible(fp.verifyImage);
        String sr = fp.verifyHeaderText.getText();
        return sr;
    }

    public String secondScreenContent(){
        String sr = fp.verifyContentText.getText();
        return sr;
    }

    public boolean verifyBackBtn(){
        isElementVisible(fp.backBtn);
        return true;
    }

    public String thirdScreenHeader(){
        waitUntilElementIsVisible(fp.verifyImage);
        String sr = fp.verifyHeaderText.getText();
        return sr;
    }

    public String thirdScreenContent(){
        String sr = fp.verifyContentText.getText();
        return sr;
    }

    public String fourthScreenHeader(){
        waitUntilElementIsVisible(fp.verifyImage);
        String sr = fp.verifyHeaderText.getText();
        return sr;
    }

    public String fourthScreenContent(){
        String sr = fp.verifyContentText.getText();
        return sr;
    }


}
