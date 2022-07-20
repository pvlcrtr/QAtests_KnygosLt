package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygos.lt.LogIn;
import tests.BaseTest;

public class Registration extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Registration.open();
        pages.knygos.lt.Registration.acceptCookies();
    }

    @Test
    public static void testCreateNewAccountWithExistingEmail() {

        String expectedResult = "https://www.knygos.lt/cart/registration";

        String password = "Java123123123";
        String confirmPassword = "Java123123123";
        String emailAddress = "pashaduniak@gmail.com";
        String firstName = pages.knygos.lt.Registration.getRandomFirstName();
        String lastName = pages.knygos.lt.Registration.getRandomLastName();
        String phoneNumber = pages.knygos.lt.Registration.getRandomPhoneNumber();

        LogIn.clickUserAccount();
        pages.knygos.lt.Registration.clickSignIn();
        pages.knygos.lt.Registration.verifyAllRegistrationFields(
                firstName,
                lastName,
                phoneNumber,
                emailAddress,
                password,
                confirmPassword
        );
        pages.knygos.lt.Registration.clickConfirmPrivacyPolitics();
        pages.knygos.lt.Registration.clickSubmitRegistration();
        String actualResult = pages.knygos.lt.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
