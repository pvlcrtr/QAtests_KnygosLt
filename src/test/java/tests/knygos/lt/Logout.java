package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Logout extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Logout.open();
        pages.knygos.lt.Logout.acceptCookies();
    }


    @Test
    public static void testLogout() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        String expectedResult = "https://www.knygos.lt/";
        pages.knygos.lt.Logout.clickUserAccount();
        pages.knygos.lt.Logout.sendKeysToEmailAdressField(emailAdress);
        pages.knygos.lt.Logout.sendKeysToPasswordField(password);
        pages.knygos.lt.Logout.clickLogIn();
        pages.knygos.lt.Logout.clickUserAccount();
        pages.knygos.lt.Logout.clickLogout();
    }
}
