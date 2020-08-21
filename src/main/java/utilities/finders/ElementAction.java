package utilities.finders;

import io.appium.java_client.MobileElement;
import operation.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ElementAction extends BaseTest {

    public void click(By element) {
        driver.findElement(element).click();
    }

    public String getText(By element) {
        String text = driver.findElement(element).getText();
        return text;
    }

    public void androidBack() {
        driver.navigate().back();
    }

    public void sendKeys(By element, String inputKey) {
        driver.findElement(element).sendKeys(inputKey);
    }

    public void checkerEqual(By element, String expected) {
        Assert.assertEquals(driver.findElement(element).getText(), expected);
    }

    public void checkerStringNotEqual(String actual, String expected) {
        Assert.assertNotEquals(actual,expected);
    }

    public void checkerDisabled(By element) {
        Assert.assertFalse(driver.findElement(element).isEnabled());
    }

    public void checkerEnabled(By element) {
        Assert.assertTrue(driver.findElement(element).isEnabled());
    }

    public void checkTextCountains(String text) {

        driver.getPageSource().contains(text);
    }

    public boolean waitUntiElementPresent(By element) {
        try{
            WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(element));
        }
        catch(TimeoutException exception) {
            return false;
        }
        return true;
    }

    public void scrollAndClick(String text) {
       // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();

        String uiSelector = "new UiSelector().textMatches(\"" + text
                + "\")";

        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";

        driver.findElementByAndroidUIAutomator(command).click();
    }
}

