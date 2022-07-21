package pages;

import org.openqa.selenium.By;

public class Locators {
    public static class knygos {

        public static class Search {
            public static By buttonAcceptCookies = By.xpath("//a[@role = 'button' and @class='cc-btn cc-allow']");
            public static By buttonSearch = By.xpath("//button[@type= 'submit' and @value='Ieškoti']");
            public static By fieldMessageOfSearch = By.xpath("//div[@class='categorie-description']");
            public static By fieldSearch = By.xpath("//input[@id = 'product-search']");
        }

        public static class LogIn {

            public static By buttonUserAccount = By.xpath("(//span[@class='text d-none d-lg-block'])[1]");
            public static By buttonLogIn = By.xpath("//input[@type='submit' and @value='Prisijungti']");
            public static By fieldLogInStatus = By.xpath("//div[@class='alert alert-danger' and @role='alert']");
            public static By fieldEmailAddress = By.xpath("//input[@id='emailInput']");
            public static By fieldPassword = By.xpath("//input[@id='passwordInput']");
        }

        public static class Logout {

            public static By buttonUserAccount = By.xpath("(//span[@class='text d-none d-lg-block'])[1]");
            public static By buttonLogIn = By.xpath("//input[@type='submit' and @value='Prisijungti']");
            public static By buttonLogout = By.xpath("(//a[@href='https://www.knygos.lt/lt/pirkejas/atsijungti'])[2]");
        }

        public static class PurchaseBasket {

            public static By buttonAddToBasketFirstBook = By.xpath("//button[@type='submit' and @id = 'add_to_cart_single_add_to_cart_1244818']");
            public static By buttonAddToBasketSecondBook = By.xpath("//button[@type='submit' and @id = 'add_to_cart_single_add_to_cart_3848518']");
            public static By buttonContinueShopping = By.xpath("//a[@class ='btn btn-outline-secondary']");
            public static By buttonReviewBasket = By.xpath("//a[@class ='btn btn-primary' and @href='https://www.knygos.lt/cart']");
            public static By fieldBasketTotal = By.xpath("//div[@class ='col text-right lead font-weight-bold']");

        }

        public static class Registration {

            public static By buttonRegistration = By.xpath("//*[@class='btn btn-primary btn-block' and @href=\"https://www.knygos.lt/cart/registration\"]");
            public static By buttonAcceptPrivacyPolicy = By.xpath("//*[@id='registration_agree_to_tos']");
            public static By buttonSubmitRegistration = By.xpath("//*[@id='registration_submit']");
            public static By fieldFirstName = By.xpath("//*[@id='registration_user_firstname']");
            public static By fieldLastName = By.xpath("//*[@id='registration_user_lastname']");
            public static By fieldPhoneNumber = By.xpath("//*[@id='registration_user_phone']");
            public static By fieldEmailAdress = By.xpath("//*[@id='registration_user_email']");
            public static By fieldPassword = By.xpath("//*[@id='registration_password_first']");
            public static By fieldConfirmPassword = By.xpath("//*[@id='registration_password_second']");
        }

        public static class TopBooks {
            public static By buttonTopBooks = By.xpath("//li[@class='menu-item top-prekes']");
            public static By fieldTopBooksMessage = By.xpath("//div[@class='title-breadcrumb-wrapper']");

            public static By inputByCategory(String category) {
                return By.xpath(
                        String.format("//li[@data-category='%s' and @class='btn btn-outline-secondary ']", category)
                );
            }
        }

        public static class WishList {
            public static By buttonBooksOnSale = By.xpath("//li[@class='menu-item akcijos']");
            public static By buttonBooksUpToThreeEur = By.xpath("(//*[@href='https://www.knygos.lt/lt/knygos/zanras/knygos-iki-2-99-eur------/'])[4]");
            public static By buttonBooksWithDefects = By.xpath("(//*[@href='https://www.knygos.lt/lt/knygos/zanras/2-99-eur-ir-pigiau-grozines-knygos---/'])[2]");
            public static By buttonInStock = By.xpath("(//input[@name=\"form_filterlist[instock]\"])[1]");
            public static By buttonSelectBook = By.xpath("//*[@title='Kvinė' and @class='product-link']");
            public static By buttonAddBookToWishList = By.xpath("(//*[@onclick=\"add_to_wishlist(2661007, this);\"])[2]");
            public static By buttonUserAccount = By.xpath("(//*[@class=\"text d-none d-lg-block\"])[1]");
            public static By buttonOpenWishList = By.xpath("(//*[@href=\"https://www.knygos.lt/user/wishlist\"])[3]\n");
            public static By fieldBookName = By.xpath("//span[@class=\"book-properties book-title\"]");
        }
    }
}