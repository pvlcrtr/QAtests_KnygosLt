package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PurchaseBasket extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.PurchaseBasket.open();
        pages.knygos.lt.PurchaseBasket.acceptCookies();
    }

    @Test
    public static void testAddProductToPurchaseBasket() {
        String searchValue = "Java";
        String expectedResult = "179,28 €";

        pages.knygos.lt.PurchaseBasket.sendKeysToSearchField(searchValue);
        pages.knygos.lt.PurchaseBasket.clickSearch();
        pages.knygos.lt.PurchaseBasket.selectAndAddBooksToBasket();
        String actualResult = pages.knygos.lt.PurchaseBasket.readBasketTotal();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
