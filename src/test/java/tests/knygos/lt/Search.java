package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Search extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Search.open();
        pages.knygos.lt.Search.acceptCookies();
    }

    @DataProvider(name = "author")
    public Object[][] radioButtonGenderDataProvider() {
        return new Object[][]{
                {"Maironis"},
                {"Rowling"}
        };
    }

    @Test(dataProvider = "author")
    public static void testSearchFunction(String expectedResult) {
        pages.knygos.lt.Search.sendKeysToSearchField(expectedResult);
        pages.knygos.lt.Search.clickSearch();
        String actualResult = pages.knygos.lt.Search.readSearchResult();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
