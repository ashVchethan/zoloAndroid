package pages;

import launchapp.InitialProcess;
import mobilenbr.EnterMobileNumber;
import utils.Base;

public class Pages {
    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) { //make sure you use JDK 1.8
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return page;
    }

    public static InitialProcess initialProcess(){return getPage(InitialProcess.class);}
    public static EnterMobileNumber enterMobileNumber(){return getPage(EnterMobileNumber.class);}


}
