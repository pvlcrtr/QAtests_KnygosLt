package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogOut extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.LogOut.open();
        pages.knygos.lt.LogOut.acceptCookies();
    }

    @Test
    public static void testLogout() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygos.lt.LogOut.clickUserAccount();
        pages.knygos.lt.LogOut.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.lt.LogOut.sendKeysToPasswordField(password);
        pages.knygos.lt.LogOut.clickLogIn();
        pages.knygos.lt.LogOut.clickUserAccount();
        pages.knygos.lt.LogOut.clickLogout();
        String actualResult = pages.knygos.lt.LogOut.getLogOutStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
