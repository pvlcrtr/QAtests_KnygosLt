package tests.knygos.cart;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.knygos.home.Search;
import tests.BaseTest;

public class PurchaseBasket extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Search.open();
        Search.acceptCookies();
    }

    @Test
    public static void testAddProductToPurchaseBasket() {
        String searchValue = "Java";
        String expectedResult = "179,28 €";

        Search.sendKeysToSearchField(searchValue);
        Search.clickSearch();
        pages.knygos.cart.PurchaseBasket.selectBooks();
        String actualResult = pages.knygos.cart.PurchaseBasket.getBasketTotal();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
