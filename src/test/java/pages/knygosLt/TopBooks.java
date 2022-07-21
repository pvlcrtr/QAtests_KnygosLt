package pages.knygosLt;

import pages.Common;
import pages.Locators;

public class TopBooks {
    public static void open() {
        pages.Common.openUrl("https://www.knygos.lt/");
    }

    public static void acceptCookies() {
        Common.clickElement(Locators.knygos.Search.buttonAcceptCookies);
    }

    public static void clickTopBooksCategory() {
        Common.clickElementByAction(Locators.knygos.TopBooks.buttonTopBooks);
    }

    public static void selectCategory(String category) {
        Common.clickElementByAction(Locators.knygos.TopBooks.inputByCategory(category));
    }

    public static String readSearchResult() {
        return Common.getElementText(Locators.knygos.TopBooks.fieldTopBooksMessage);
    }
}
