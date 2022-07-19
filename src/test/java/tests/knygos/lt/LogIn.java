package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogIn extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.LogIn.open();
        pages.knygos.lt.LogIn.acceptCookies();
    }

    @Test
    public static void testLoginWithInvalidData() {
        String emailAdress = "sada@gmail.com";
        String password = "aasdada";
        String expectedResult = "Klaidingi duomenys.";
        pages.knygos.lt.LogIn.clickUserAccount();
        pages.knygos.lt.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.lt.LogIn.sendKeysToPasswordField(password);
        pages.knygos.lt.LogIn.clickLogIn();
        String actualResult = pages.knygos.lt.LogIn.readLogInStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testLoginWithValidData() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygos.lt.LogIn.clickUserAccount();
        pages.knygos.lt.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.lt.LogIn.sendKeysToPasswordField(password);
        pages.knygos.lt.LogIn.clickLogIn();
        //String actualResult = utils.Driver.getDriver().getCurrentUrl();
        String actualResult = pages.knygos.lt.LogIn.getLogInStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
