package tests.knygosLt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TopBooks extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygosLt.TopBooks.open();
        pages.knygosLt.TopBooks.acceptCookies();
    }

    @DataProvider(name = "booksCategory")
    public Object[][] bookCategoryDataProvider() {
        return new Object[][]{
                {"jaunimui"},
                {"naujienos"},
        };
    }

    @Test(dataProvider = "booksCategory")
    public static void testSearchByCategoryTopBooksForKids(String category) {
        pages.knygosLt.TopBooks.clickTopBooksCategory();
        pages.knygosLt.TopBooks.selectCategory(category);
        String actualResult = pages.knygosLt.TopBooks.readSearchResult();
        Assert.assertTrue(actualResult.contains(category));
    }
}
