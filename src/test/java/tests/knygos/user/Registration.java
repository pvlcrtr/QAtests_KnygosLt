package tests.knygos.user;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygos.home.Search;
import pages.knygos.user.LogIn;
import tests.BaseTest;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Registration extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Search.open();
        Search.acceptCookies();
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

        LogIn.clickUserAccount();
        pages.knygos.user.Registration.clickSignIn();
        pages.knygos.user.Registration.verifyAllRegistrationFields(
                firstName,
                lastName,
                phoneNumber,
                emailAddress,
                password,
                confirmPassword
        );
        pages.knygos.user.Registration.clickSubmitRegistration();
        String actualResult = pages.knygos.user.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testCreateNewAccountWithExistingEmail() {
        Faker faker = new Faker();

        int randomIntForphone = ThreadLocalRandom.current().nextInt(60000000, 69999999);

        String password = "Java123123123";
        String confirmPassword = "Java123123123";
        String emailAddress = "pashaduniak@gmail.com";
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String phoneNumber = String.valueOf(randomIntForphone);
        String expectedResult = "https://www.knygos.lt/cart/registration";

        LogIn.clickUserAccount();
        pages.knygos.user.Registration.clickSignIn();
        pages.knygos.user.Registration.verifyAllRegistrationFields(
                firstName,
                lastName,
                phoneNumber,
                emailAddress,
                password,
                confirmPassword
        );
        pages.knygos.user.Registration.clickSubmitRegistration();
        String actualResult = pages.knygos.user.Registration.getRegistrationStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
