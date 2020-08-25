package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseProduct extends BaseTest {
    public By txtProductTitle = By.id(ObjectElement.ProductPageObject.txtProductTitle);

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By txtCheckPriceDesc = By.id(ObjectElement.ProductPageObject.txtCheckPriceDesc);

    public By btnDecrease = By.id(ObjectElement.ProductPageObject.btnDecrease);

    public By btnIncrease = By.id(ObjectElement.ProductPageObject.btnIncrease);

    public By productCardOne = By.id(ObjectElement.ProductPageObject.productCardOne);

    public By productCardTwo = By.id(ObjectElement.ProductPageObject.productCardTwo);

    public By productCardThree = By.id(ObjectElement.ProductPageObject.productCardThree);

    public By productCardFour = By.id(ObjectElement.ProductPageObject.productCardFour);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetail = By.id(ObjectElement.ProductPageObject.btnSeeDetail);


    public void clickDetailPromoSuperBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Super Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoPowerBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Power Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoStandardBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Standard Bundle\"));");
        elementToClick.click();
    }

    public void clickDetailPromoLiteBundle() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/recycler_\")).scrollIntoView("
                        + "new UiSelector().text(\"Lite Bundle\"));");
        elementToClick.click();
    }
}
