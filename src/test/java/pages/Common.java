package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.Driver;

public class Common {
    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
    }

    public static void sendKeysByAction(By locator, String keys) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.sendKeys(keys);
        action.build().perform();
    }

    public static String getUrl() {
        return utils.Driver.getDriver().getCurrentUrl();
    }
}
