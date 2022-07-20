package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class WishList extends pages.knygos.lt.LogIn {
    public static void open() {
        pages.Common.openUrl("https://www.knygos.lt/");
    }

    public static void acceptCookies() {
        Common.clickElementByAction(Locators.knygos.Search.buttonAcceptCookies);
    }

    public static void loginToUserAccount() {
        String emailAdress = "pashaduniak@gmail.com";
        String password = "Knygos_123";
        LogIn.clickUserAccount();
        LogIn.sendKeysToEmailAdressField(emailAdress);
        LogIn.sendKeysToPasswordField(password);
        LogIn.clickLogIn();
    }

    public static void selectBooksOnSale() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonBooksOnSale);
    }

    public static void selectBooksUpToThreeEur() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonBooksUpToThreeEur);
    }

    public static void selectBooksWithDefects() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonBooksWithDefects);
    }

    public static void selectBooksInStock() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonInStock);
    }

    public static void selectBook() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonSelectBook);
    }

    public static void addBookToWishList() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonAddBookToWishList);
    }

    public static void clickUserAccount() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonUserAccount);
    }

    public static void clickOpenWishlist() {
        Common.clickElementByAction(Locators.knygos.WishList.buttonOpenWishList);
    }

    public static String getWishListStatus() {
        return Common.getElementText(Locators.knygos.WishList.fieldBookName);
    }

}
