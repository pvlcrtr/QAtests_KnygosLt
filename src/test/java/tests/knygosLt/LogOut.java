package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogOut extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.LogOut.open();
        pages.knygosLt.LogOut.acceptCookies();
    }

    @Test
    public static void testLogout() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygosLt.LogOut.clickUserAccount();
        pages.knygosLt.LogOut.sendKeysToEmailAdressField(emailAdress);
        pages.knygosLt.LogOut.sendKeysToPasswordField(password);
        pages.knygosLt.LogOut.clickLogIn();
        pages.knygosLt.LogOut.clickUserAccount();
        pages.knygosLt.LogOut.clickLogout();
        String actualResult = pages.knygosLt.LogOut.getLogOutStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
