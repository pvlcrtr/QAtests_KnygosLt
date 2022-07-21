package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class WishList extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.WishList.open();
        pages.knygos.lt.WishList.acceptCookies();
    }

    @Test
    public static void testAddToWishListFunction() {
        String expectedResult = "Kvinė";

        pages.knygos.lt.WishList.loginToUserAccount();
        pages.knygos.lt.WishList.selectBooksOnSale();
        pages.knygos.lt.WishList.selectBooksUpToThreeEur();
        pages.knygos.lt.WishList.selectBooksWithDefects();
        pages.knygos.lt.WishList.selectBooksInStock();
        pages.knygos.lt.WishList.selectBook();
        pages.knygos.lt.WishList.addBookToWishList();
        pages.knygos.lt.WishList.clickUserAccount();
        pages.knygos.lt.WishList.clickOpenWishlist();
        String actualResult = pages.knygos.lt.WishList.getWishListStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
