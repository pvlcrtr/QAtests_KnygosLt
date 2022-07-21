package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogIn extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.LogIn.open();
        pages.knygosLt.LogIn.acceptCookies();
    }

    @Test
    public static void testLoginWithInvalidData() {
        String emailAdress = "sada@gmail.com";
        String password = "aasdada";
        String expectedResult = "Klaidingi duomenys.";
        pages.knygosLt.LogIn.clickUserAccount();
        pages.knygosLt.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygosLt.LogIn.sendKeysToPasswordField(password);
        pages.knygosLt.LogIn.clickLogIn();
        String actualResult = pages.knygosLt.LogIn.readLogInStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public static void testLoginWithValidData() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygosLt.LogIn.clickUserAccount();
        pages.knygosLt.LogIn.sendKeysToEmailAdressField(emailAdress);
        pages.knygosLt.LogIn.sendKeysToPasswordField(password);
        pages.knygosLt.LogIn.clickLogIn();
        String actualResult = pages.knygosLt.LogIn.getLogInStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
