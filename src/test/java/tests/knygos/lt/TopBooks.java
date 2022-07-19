package tests.knygos.lt;

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
        pages.knygos.lt.TopBooks.open();
        pages.knygos.lt.TopBooks.acceptCookies();
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
        pages.knygos.lt.TopBooks.clickTopBooksCategory();
        pages.knygos.lt.TopBooks.selectCategory(category);
        String actualResult = pages.knygos.lt.TopBooks.readSearchResult();
        Assert.assertTrue(actualResult.contains(category));
    }

}
