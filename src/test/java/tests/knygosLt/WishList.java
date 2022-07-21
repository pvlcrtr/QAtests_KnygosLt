package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class WishList extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.WishList.open();
        pages.knygosLt.WishList.acceptCookies();
    }

    @Test
    public static void testAddToWishListFunction() {
        String expectedResult = "Kvinė";

        pages.knygosLt.WishList.loginToUserAccount();
        pages.knygosLt.WishList.selectBooksOnSale();
        pages.knygosLt.WishList.selectBooksUpToThreeEur();
        pages.knygosLt.WishList.selectBooksWithDefects();
        pages.knygosLt.WishList.selectBooksInStock();
        pages.knygosLt.WishList.selectBook();
        pages.knygosLt.WishList.addBookToWishList();
        pages.knygosLt.WishList.clickUserAccount();
        pages.knygosLt.WishList.clickOpenWishlist();
        String actualResult = pages.knygosLt.WishList.getWishListStatus();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
