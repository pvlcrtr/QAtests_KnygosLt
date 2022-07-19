package tests.knygos.home;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Search extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.home.Search.open();
        pages.knygos.home.Search.acceptCookies();
    }

    @Test
    public static void testSearchFunction() {
        String expectedResult = "Maironis";
        pages.knygos.home.Search.sendKeysToSearchField(expectedResult);
        pages.knygos.home.Search.clickSearch();
        String actualResult = pages.knygos.home.Search.readSearchResult();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
