package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class LogIn {

    public static void open() {
        pages.Common.openUrl("https://www.knygos.lt/");
    }
    public static void acceptCookies() {
        Common.clickElementByAction(Locators.knygos.Search.buttonAcceptCookies);
    }
    public static void sendKeysToEmailAdressField(String keys) {
        Common.sendKeysByAction(Locators.knygos.LogIn.fieldEmailAddress, keys);
    }
    public static void sendKeysToPasswordField(String keys) {
        Common.sendKeysByAction(Locators.knygos.LogIn.fieldPassword, keys);
    }
    public static void clickUserAccount() {
        Common.clickElement(Locators.knygos.LogIn.buttonUserAccount);
    }
    public static String readLogInStatus() {
        return Common.getElementText(Locators.knygos.LogIn.fieldLogInStatus);
    }
    public static void clickLogIn() {
        Common.clickElementByAction(Locators.knygos.LogIn.buttonLogIn);
    }
    public static String getLogInStatus() {
        return Common.getUrl();
    }

}

