package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygosLt.LogIn;
import tests.BaseTest;

public class Registration extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.Registration.open();
        pages.knygosLt.Registration.acceptCookies();
    }

    @Test
    public static void testCreateNewAccountWithExistingEmail() {

        String expectedResult = "https://www.knygos.lt/cart/registration";

        String password = "Java123123123";
        String confirmPassword = "Java123123123";
        String emailAddress = "pashaduniak@gmail.com";
        String firstName = pages.knygosLt.Registration.getRandomFirstName();
        String lastName = pages.knygosLt.Registration.getRandomLastName();
        String phoneNumber = pages.knygosLt.Registration.getRandomPhoneNumber();

        LogIn.clickUserAccount();
        pages.knygosLt.Registration.clickSignIn();
        pages.knygosLt.Registration.verifyAllRegistrationFields(
                firstName,
                lastName,
                phoneNumber,
                emailAddress,
                password,
                confirmPassword
        );
        pages.knygosLt.Registration.clickConfirmPrivacyPolitics();
        pages.knygosLt.Registration.clickSubmitRegistration();
        String actualResult = pages.knygosLt.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
