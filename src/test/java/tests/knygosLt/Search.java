package tests.knygosLt;

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
        pages.knygosLt.Search.open();
        pages.knygosLt.Search.acceptCookies();
    }

    @DataProvider(name = "author")
    public Object[][] keyWordForSearchDataProvider() {
        return new Object[][]{
                {"Maironis"},
                {"Rowling"}
        };
    }

    @Test(dataProvider = "author")
    public static void testSearchFunction(String expectedResult) {
        pages.knygosLt.Search.sendKeysToSearchField(expectedResult);
        pages.knygosLt.Search.clickSearch();
        String actualResult = pages.knygosLt.Search.readSearchResult();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
