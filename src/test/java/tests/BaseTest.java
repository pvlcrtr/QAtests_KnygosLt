package tests;

import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        Driver.setDriver();
    }
//
//    @AfterMethod
//    public void teardown() {
//        Driver.closeDriver();
//    }
}
