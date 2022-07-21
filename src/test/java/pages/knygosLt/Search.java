package pages.knygosLt;

import pages.Common;
import pages.Locators;

public class Search {
    public static void open() {
        pages.Common.openUrl("https://www.knygos.lt/");
    }

    public static void acceptCookies() {
        Common.clickElement(Locators.knygos.Search.buttonAcceptCookies);
    }

    public static void sendKeysToSearchField(String keys) {
        Common.sendKeysByAction(Locators.knygos.Search.fieldSearch, keys);
    }

    public static void clickSearch() {
        Common.clickElement(Locators.knygos.Search.buttonSearch);
    }

    public static String readSearchResult() {
        return Common.getElementText(Locators.knygos.Search.fieldMessageOfSearch);
    }


}
