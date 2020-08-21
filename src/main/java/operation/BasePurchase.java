package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BasePurchase extends BaseTest {

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetailPurchase = By.id(ObjectElement.ProductPageObject.btnSeeDetail);

    public By btnCloseSeeDetailPurchase = By.id(ObjectElement.PaymentDetailObject.btnCloseDetail);

    public void clickButtonAddToCart() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnAddToCart)).click();
    }

    public void clickButtonConfirmBuy() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnConfirmBuy)).click();
    }

    public void clickButtonIncreaseCountProduct(int increase) {
        int i;
        for(i=0;i<=increase;i++) {
            driver.findElement(By.id(ObjectElement.ProductPageObject.btnIncrease)).click();
        }
    }

    public void clickButtonDecreaseCountProduct(int decrease) {
        int i;
        for(i=0;i<=decrease;i++) {
            driver.findElement(By.id(ObjectElement.ProductPageObject.btnDecrease)).click();
        }
    }

    public void clickButtonChoosePayment() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnChoosePayment)).click();
    }

    public void clickButtonChooseGoPay() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"GoPay\"));");
        elementToClick.click();
    }

    public void clickButtonChooseDana() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"DANA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseOVO() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"OVO\"));");
        elementToClick.click();
    }

    public void clickButtonChooseCC() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Visa/Master\"));");
        elementToClick.click();
    }

    public void clickButtonChoosePermataVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Permata VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseDanamonVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Danamon VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseMandiriVA() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Mandiri VA\"));");
        elementToClick.click();
    }

    public void clickButtonChooseAlfamart() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_e_wallet\")).scrollIntoView("
                        + "new UiSelector().text(\"Alfamart\"));");
        elementToClick.click();
    }

    public void clickButtonLetsSwitch() {
        driver.findElement(By.xpath("//*[@text = 'LET'S SWITCH']")).click();
//        MobileElement elementToClick = (MobileElement) driver
//                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//                        + ".resourceId(\"com.smartfren.switchmobile:id/rv_section_one\")).scrollIntoView("
//                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/button_activate\"));");
//        elementToClick.click();
    }

    public void clickChooseYourNumber(String mainNumber) {
        driver.findElement(By.id(ObjectElement.OrderSIMNumberPage.btnMainNumber)).click();
        driver.findElement(By.xpath(String.format("//*[@text = '%mainNumber']", mainNumber))).click();
    }

    public void clickButtonSeeDetailPurchase() {
        driver.findElement(By.id(ObjectElement.ProductPageObject.btnSeeDetail)).click();
    }

    public void clickCloseButtonSeeDetailPurchase() {
        driver.findElement(By.id(ObjectElement.PaymentDetailObject.btnCloseDetail)).click();
    }
}
