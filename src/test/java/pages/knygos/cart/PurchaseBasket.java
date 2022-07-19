package pages.knygos.cart;

import org.testng.Assert;
import pages.Common;
import pages.Locators;

public class PurchaseBasket {

    public static void open() {

        pages.Common.openUrl("https://www.knygos.lt/");


    }

    public static void acceptCookies() {
        Common.clickElementByAction(Locators.knygos.Search.buttonAcceptCookies);
    }

    public static void sendKeysToSearchField(String keys) {
        Common.sendKeysByAction(Locators.knygos.Search.fieldSearch, keys);
    }

    public static void clickSearch() {
        Common.clickElement(Locators.knygos.Search.buttonSearch);
    }

    public static void selectBooks() {

        try {
            Common.clickElementByAction(Locators.knygos.PurchaseBasket.buttonAddToBasketFirstBook);
            Thread.sleep(1500);
            Common.clickElementByAction(Locators.knygos.PurchaseBasket.buttonContinueShopping);
            Thread.sleep(1500);
            Common.clickElementByAction(Locators.knygos.PurchaseBasket.buttonAddToBasketSecondBook);
            Thread.sleep(1500);
            Common.clickElementByAction(Locators.knygos.PurchaseBasket.buttonReviewBasket);
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static String getBasketTotal() {
        return Common.getElementText(Locators.knygos.PurchaseBasket.fieldBasketTotal);
    }
}
