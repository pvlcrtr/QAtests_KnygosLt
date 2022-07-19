package tests.knygos.lt;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygos.lt.LogIn;
import tests.BaseTest;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Registration extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Registration.open();
        pages.knygos.lt.Registration.acceptCookies();
    }

    @Test
    public static void testCreateNewAccountWithNonExistingEmail() {
        Random randomGenerator = new Random();
        Faker faker = new Faker();

        int randomIntForEmail = randomGenerator.nextInt(100000);
        int randomIntForphone = ThreadLocalRandom.current().nextInt(60000000, 69999999);

        String password = "Java123123123";
        String confirmPassword = "Java123123123";
        String expectedResult = "https://www.knygos.lt/";
        String emailAddress = "qwerty" + randomIntForEmail + "@gmail.com";
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = String.valueOf(randomIntForphone);

        pages.knygos.lt.Registration.clickUserAccount();
        pages.knygos.lt.Registration.clickSignIn();
        pages.knygos.lt.Registration.verifyAllRegistrationFields(
                firstName,
                lastName,
                phoneNumber,
                emailAddress,
                password,
                confirmPassword
        );
        pages.knygos.lt.Registration.clickSubmitRegistration();
        String actualResult = pages.knygos.lt.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testCreateNewAccountWithExistingEmail() {
        Faker faker = new Faker();

        int randomPhoneNumber = ThreadLocalRandom.current().nextInt(60000000, 69999999);

        String password = "Java123123123";
        String confirmPassword = "Java123123123";
        String emailAddress = "pashaduniak@gmail.com";
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = String.valueOf(randomPhoneNumber);
        String expectedResult = "https://www.knygos.lt/cart/registration";

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
        pages.knygos.lt.Registration.clickSubmitRegistration();
        String actualResult = pages.knygos.lt.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
