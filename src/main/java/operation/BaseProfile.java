package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.finders.ElementAction;

import java.net.MalformedURLException;

public class BaseProfile extends BaseTest {
    ElementAction action = new ElementAction();

    public By txtHeaderTitle = By.id(ObjectElement.ProfilePageObject.txtHeaderTitle);

    public By txtNameUserTitle = By.id(ObjectElement.ProfilePageObject.txtNameUserTitle);

    public By txtEmailUserTitle = By.id(ObjectElement.ProfilePageObject.txtEmailUserTitle);

    public By btnEdit = By.id(ObjectElement.ProfilePageObject.btnEdit);

    public By txtDealsTitle = By.id(ObjectElement.ProfilePageObject.txtDealsTitle);

    public By btnLogout = By.id(ObjectElement.ProfilePageObject.btnLogout);

    public By btnConfirmLogout = By.id(ObjectElement.ProfilePageObject.btnConfirmLogout);

    public By btnLanguage = By.id(ObjectElement.ProfilePageObject.btnLanguage);

    public By btnBahasa = By.id(ObjectElement.ProfilePageObject.btnBahasa);

    public By btnEnglish = By.id(ObjectElement.ProfilePageObject.btnEnglish);

    public By btnCancelChangeLang = By.id(ObjectElement.ProfilePageObject.btnCancelChangeLang);

    public By btnSeeAllFavorite = By.id(ObjectElement.ProfilePageObject.btnSeeAllFavorite);

    public By scrollView = By.id(ObjectElement.ProfilePageObject.scrollView);

    public By btnLoginHere = By.id(ObjectElement.ProfilePageObject.btnLoginHere);

    public By inputFullName = By.id(ObjectElement.EditProfileObject.inputFullName);

    public By btnSubmitChangeProfile = By.id(ObjectElement.EditProfileObject.btnSubmitChangeProfile);

    public By inputAlternatePhoneNumber = By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber);

    public By btnChangePin = By.id(ObjectElement.AccountObject.btnChangePin);

    public By inputPin = By.id(ObjectElement.AccountObject.inputPin);

    public By btnNext = By.id(ObjectElement.AccountObject.btnNext);

    public By btnDeliveryAddress = By.id(ObjectElement.AccountObject.btnDeliveryAddress);

    public By btnAddAddress = By.id(ObjectElement.AccountObject.btnAddAddress);

    public By btnSelectThisLocation = By.id(ObjectElement.AccountObject.btnSelectThisLocation);

    public By btnSimInfo = By.id(ObjectElement.SIMSettingObject.btnSimInfo);

    public By btnCheckCompatibility = By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility);

    public By btnCHat = By.id(ObjectElement.HelpPageObject.btnCHat);

    public By btnFAQ = By.id(ObjectElement.HelpPageObject.btnFAQ);

    public By btnChatIn = By.id(ObjectElement.HelpPageObject.btnChatIn);

    public By InputChat = By.id(ObjectElement.HelpPageObject.InputChat);

    public By txtHeadTitleMenu = By.id(ObjectElement.ReferralObject.txtHeadTitleMenu);

    /* profile-menu-page */

    public void clickSeeAllFavorite() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnSeeAllFavorite)).click();
    }

    public void clickReferralCode() throws InterruptedException {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/button3\"));");
        elementToClick.click();
    }

    public void clickButtonYourWishlist() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/wishlist\"));");
        elementToClick.click();
    }

    public void clickButtonSolveMission() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/textView119\"));");
        elementToClick.click();
    }

    public void clickButtonAccount() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/account_txt\"));");
        elementToClick.click();
    }

    public void clickButtonSIMSettings() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/sim_setting\"));");
        elementToClick.click();
    }

    public String activeLang() {
        String langNow = driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLanguage)).getText();
        try {
            return String.valueOf(langNow);
        } catch (Exception e) {
            return null;
        }
    }

    public void clickButtonLanguage() throws InterruptedException{
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
        System.out.println(activeLang());
        if (activeLang().equals("English")) {
            elementToClick.click();
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnBahasa)).click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                            + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
            Thread.sleep(4000);
            Assert.assertEquals(activeLang(), "Bahasa");
        } else {
            elementToClick.click();
            driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEnglish)).click();
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                            + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                            + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
            Thread.sleep(4000);
            Assert.assertEquals(activeLang(), "English");
        }
    }

    public void clickButtonHelp() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/help\"));");
        elementToClick.click();
    }

    public void clickButtonLogout() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/logout\"));");
        elementToClick.click();
    }

    /* menu-config */

    public void updateFullNameProfile() {
        String UserFullName = driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).getText();
        if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_1)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_2);
        } else if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_2)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_1);
        }
    }

    public void setInputChat() {
        if (driver.findElement(By.id(ObjectElement.HelpPageObject.btnChatNotAvailable)).isDisplayed()) {
            System.out.println("Chat Not Available");
        } else {
            action.click(btnChatIn);
            action.sendKeys(InputChat,"hello");
            action.checkerEqual(txtHeadTitleMenu,"Chat");
        }
    }

    public void updateAlternatePhoneNumber() {
        String AlternatePhone = driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).getText();
        if (AlternatePhone.equals(BaseData.Validation.VALIDATION_ALT_PHONE_1)) {
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("881850440");
        } else if (AlternatePhone.equals(BaseData.Validation.VALIDATION_ALT_PHONE_2)){
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("8194120194");
        } else if (AlternatePhone.equals("+62")){
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).click();
            driver.findElement(By.id(ObjectElement.EditProfileObject.inputAlternatePhoneNumber)).sendKeys("8194120194");
        }
    }

    public void clickButtonBahasa() throws InterruptedException {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/language\"));");
        String txtLangNow = driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLanguage)).getText();
        elementToClick.click();
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnBahasa)).click();
        Thread.sleep(4000);
    }

    public void clickButtonCopyRefCode() {
        final String referralCode = driver.findElement(By.id(ObjectElement.ReferralObject.txtReferralCode)).getText();
        Assert.assertEquals(referralCode, "HDi0lyIe");
        driver.findElement(By.id(ObjectElement.ReferralObject.btnCopyRef)).click();
    }

    public void clickButtonShareRefCode() {
        final String referralCode = driver.findElement(By.id(ObjectElement.ReferralObject.txtReferralCode)).getText();
        Assert.assertEquals(referralCode, "HDi0lyIe");
        driver.findElement(By.id(ObjectElement.ReferralObject.btnShareRef)).click();
    }

    public void checkWishlistTitle() {
        String TitleWishlist = driver.findElement(By.id(ObjectElement.ReferralObject.txtHeadTitleMenu)).getText();
        if (TitleWishlist.equals(BaseData.Profile.WishlistTitle_ID)) {
            Assert.assertEquals(TitleWishlist, BaseData.Profile.WishlistTitle_ID);
        } else {
            Assert.assertEquals(TitleWishlist, BaseData.Profile.WishlistTitle_ENG);
        }
    }

    public void inputHomeOrOffice(String homeOfficeName) {
        Object officeName = driver.findElement(By.id(ObjectElement.AccountObject.inputHomeOrOfficeName));
        Assert.assertNotNull(officeName);
        MobileElement elementToInput = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/txt_address_type\"));");
        elementToInput.sendKeys(homeOfficeName);
    }

    public void inputRecipientName(String recipientName) {
        Object recName = driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientName));
        Assert.assertNotNull(recName);
        MobileElement elementToInput = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recName\"));");
        elementToInput.sendKeys(recipientName);
    }

    public void inputRecipientPhoneNumber(String recipientNumber) {
        Object recNumber = driver.findElement(By.id(ObjectElement.AccountObject.inputRecipientNumber));
        Assert.assertNotNull(recNumber);
        MobileElement elementToInput = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recPhone\"));");
        elementToInput.sendKeys(recipientNumber);
    }

    public void clickButtonCityOrDistrict() {
        Object btnSelectCity = driver.findElement(By.id(ObjectElement.AccountObject.btnCityOrDistrict));
        Assert.assertNotNull(btnSelectCity);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recCity\"));");
        elementToClick.click();
    }

    public void inputSearchCityOrDistrict(String city) {
        Object inputCity = driver.findElement(By.id(ObjectElement.AccountObject.inputSearchCityOrDistrict));
        Assert.assertNotNull(inputCity);
        MobileElement elementToInput = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/edt_search\"));");
        elementToInput.sendKeys(city);
    }

    public void clickSelectedCityOrDistrict() {
        Object btnSelectCity = driver.findElement(By.id(ObjectElement.AccountObject.btnSelectCityOrDistrict));
        Assert.assertNotNull(btnSelectCity);
        driver.findElement(By.id(ObjectElement.AccountObject.btnSelectCityOrDistrict)).click();
    }

    public void inputAddressDetail(String address) {
        Object inputAddress = driver.findElement(By.id(ObjectElement.AccountObject.inputAddressDetail));
        Assert.assertNotNull(inputAddress);
        MobileElement elementToInput = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/recDetails\"));");
        elementToInput.sendKeys(address);
    }

    public void clickButtonChooseLocation() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/img_view_map\"));");
        elementToClick.click();
    }

    public void clickButtonSelectThisLocation() {
        driver.findElement(By.id(ObjectElement.AccountObject.btnSelectThisLocation)).click();
    }

    public void clickCheckboxTermsAndCondition() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/checkBox\"));");
        elementToClick.click();
    }

    public void clickButtonSave() {
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".resourceId(\"com.smartfren.switchmobile:id/scrollView2\")).scrollIntoView("
                        + "new UiSelector().resourceId(\"com.smartfren.switchmobile:id/next\"));");
        elementToClick.click();
    }

    public void checkSIMInfo() {
        String SimTitle = driver.findElement(By.id(ObjectElement.ReferralObject.txtHeadTitleMenu)).getText();
        Assert.assertEquals(SimTitle, BaseData.Profile.SimTitle);
    }

    public void clickButtonCheckCompatibility() {
        driver.findElement(By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility)).click();
    }

    private By clickButtonCheckCompatibility = By.id(ObjectElement.SIMSettingObject.btnCheckCompatibility);

    public void checkCompatibility() {

    }

    public void clickButtonChatWithShely() {

    }

    public void clickButtonChat() {

    }

    public void clickButtonEmail() {

    }

    public void checkValueAddress() {

    }

    public String getReferralTitle() {
        String refTitle = driver.findElement(By.id("")).getText();
        try {
            return String.valueOf(refTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void checkValidationReferralPage() {

    }
}
