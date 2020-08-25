package pages;

import constants.ObjectElement;
import operation.BaseHomepage;
import operation.BaseLanding;
import operation.BaseLogout;
import operation.BaseProfile;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

public class ProfilePages {
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProfile baseProfile = new BaseProfile();
    BaseLogout baseLogout = new BaseLogout();
    BaseLanding baseLanding = new BaseLanding();
    ElementAction action = new ElementAction();

    public void testUpdateFullName() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateFullNameProfile();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testUpdateAlternatePhoneNumber() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateAlternatePhoneNumber();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testChangeLanguage() throws InterruptedException{
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonLanguage();
    }

    public void testInputFullName(String fullName) {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        action.sendKeys(baseProfile.inputFullName,fullName);
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testChooseFavorite() {
        action.click(baseHomepage.btnProfile);
    }

    public void testCopyReferralCode() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickReferralCode();
        baseProfile.clickButtonCopyRefCode();
    }

    public void testShareReferralCode() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickReferralCode();
        baseProfile.clickButtonShareRefCode();
        action.androidBack();
    }

    public void testCheckWishlist() {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonYourWishlist();
        baseProfile.checkWishlistTitle();
    }

    public void testChangePin(String pin) {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonAccount();
        action.click(baseProfile.btnChangePin);
        action.sendKeys(baseProfile.inputPin,pin);
        action.click(baseProfile.btnNext);
    }

    public void testPhaseTwoChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputPin,pin);
        action.click(baseProfile.btnNext);
    }

    public void testCompleteChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputPin,pin);
        action.click(baseProfile.btnNext);
        action.sendKeys(baseProfile.inputPin,pin);
        action.click(baseProfile.btnNext);
    }

    public void testAddDeliveryAddress(String homeOfficeName, String recipientName, String recipientNumber) {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonAccount();
        action.click(baseProfile.btnDeliveryAddress);
        action.click(baseProfile.btnAddAddress);
        baseProfile.inputHomeOrOffice(homeOfficeName);
        baseProfile.inputRecipientName(recipientName);
        baseProfile.inputRecipientPhoneNumber(recipientNumber);

    }

    public void testDeliveryAddress(String city, String address) {
        baseProfile.clickButtonCityOrDistrict();
        baseProfile.inputSearchCityOrDistrict(city);
        baseProfile.clickSelectedCityOrDistrict();
        baseProfile.inputAddressDetail(address);
        baseProfile.clickButtonChooseLocation();
        action.click(baseProfile.btnSelectThisLocation);
        baseProfile.clickCheckboxTermsAndCondition();
        baseProfile.clickButtonSave();
    }

    public void testCheckSIMInfo() {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonSIMSettings();
        action.click(baseProfile.btnSimInfo);
        baseProfile.checkSIMInfo();
    }

    public void testCheckCompatibility() {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonSIMSettings();
        action.click(baseProfile.btnCheckCompatibility);
    }

    public void testChatWithShely() {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonHelp();
        action.click(baseProfile.btnCHat);
        action.click(baseProfile.btnChatIn);
        baseProfile.setInputChat();
    }

    public void checkFAQ() {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonHelp();
        action.click(baseProfile.btnFAQ);
        action.checkTextCountains("FAQ & Tutorial");

    }

    public void testEmailUs() {
       action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonHelp();
        action.click(baseProfile.btnCHat);
        action.click(baseProfile.btnEmail);
        baseProfile.clickButtonEmail();
        action.androidBack();
        action.checkTextCountains("Email");
    }

    public void testValidLogout() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonLogout();
        action.click(baseLogout.btnConfirmLogout);
    }

    public void testLogout() {
        baseProfile.clickButtonLogout();
        action.click(baseLogout.btnConfirmLogout);
    }

    public void testClickButtonLoginHere() {
        action.click(baseHomepage.btnProfile);
        action.click(baseLogout.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
    }
}