package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Registration {

    public static void open() {
        pages.Common.openUrl("https://www.knygos.lt/");
    }

    public static void acceptCookies() {
        Common.clickElementByAction(Locators.knygos.Search.buttonAcceptCookies);
    }

    public static void clickUserAccount() {
        Common.clickElement(Locators.knygos.LogIn.buttonUserAccount);
    }

    public static void clickSignIn() {
        Common.clickElement(Locators.knygos.Registration.buttonRegistration);
    }

    public static void verifyAllRegistrationFields(
            String firstName,
            String lastName,
            String phoneNumber,
            String emailAdress,
            String password,
            String confirmPassword
    ) {
        Common.sendKeysByAction(Locators.knygos.Registration.fieldFirstName, firstName);
        Common.sendKeysByAction(Locators.knygos.Registration.fieldLastName, lastName);
        Common.sendKeysByAction(Locators.knygos.Registration.fieldPhoneNumber, phoneNumber);
        Common.sendKeysByAction(Locators.knygos.Registration.fieldEmailAdress, emailAdress);
        Common.sendKeysByAction(Locators.knygos.Registration.fieldPassword, password);
        Common.sendKeysByAction(Locators.knygos.Registration.fieldConfirmPassword, confirmPassword);
        Common.clickElementByAction(Locators.knygos.Registration.buttonAcceptPrivacyPolicy);
    }

    public static void clickSubmitRegistration() {
        try {
            Thread.sleep(2000);
            Common.clickElementByAction(Locators.knygos.Registration.buttonSubmitRegistration);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getRegistrationStatus() {
        return Common.getUrl();
    }

}
