package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PurchaseBasket extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.PurchaseBasket.open();
        pages.knygosLt.PurchaseBasket.acceptCookies();
    }

    @Test
    public static void testAddProductToPurchaseBasket() {
        String searchValue = "Java";
        String expectedResult = "179,28 €";

        pages.knygosLt.PurchaseBasket.sendKeysToSearchField(searchValue);
        pages.knygosLt.PurchaseBasket.clickSearch();
        pages.knygosLt.PurchaseBasket.selectAndAddBooksToBasket();
        String actualResult = pages.knygosLt.PurchaseBasket.readBasketTotal();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
