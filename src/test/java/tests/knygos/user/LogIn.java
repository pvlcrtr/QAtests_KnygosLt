package tests.knygos.user;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygos.home.Search;
import tests.BaseTest;

public class LogIn extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Search.open();
        Search.acceptCookies();
    }

    @Test
    public static void testLoginWithInvalidData() {
        String emailAdress = "sada@gmail.com";
        String password = "aasdada";
        String expectedResult = "Klaidingi duomenys.";
        pages.knygos.user.LogIn.clickUserAccount();
        pages.knygos.user.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.user.LogIn.sendKeysToPasswordField(password);
        pages.knygos.user.LogIn.clickLogIn();
        String actualResult = pages.knygos.user.LogIn.readLogInStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testLoginWithValidData() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygos.user.LogIn.clickUserAccount();
        pages.knygos.user.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.user.LogIn.sendKeysToPasswordField(password);
        pages.knygos.user.LogIn.clickLogIn();
        String actualResult = utils.Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
