package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProfilePages;

@Listeners({TestAllureListener.class})
public class ProfileITest extends TestSetup {

    LoginITest login = new LoginITest();
    ProfilePages profilePages = new ProfilePages();

    @Test(priority = 201, description = "Switch_Profile_001 - User able to EDIT FULL NAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeFullName() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testUpdateFullName();
    }

    @Test(priority = 202, description = "Switch_Profile_002 - User able to EDIT ALT PHONE NUMBER")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success EDIT ALT PHONE NUMBER from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeAlternatePhoneNumber() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testUpdateAlternatePhoneNumber();
    }

    @Test(priority = 203, description = "Switch_Profile_003 - User able to CHANGE LANGUAGE")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can success CHANGE LANGUAGE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkChangeLanguage() throws InterruptedException {
        login.checkValidLoginUsingEmail();
        profilePages.testChangeLanguage();
    }

    @Test(priority = 204, description = "Switch_Profile_004 - User unable to EMPTY FULLNAME")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can't EMPTY FULL NAME from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkEmptyFullName() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testInputFullName("");
    }

    @Test(priority = 205, description = "Switch_Profile_005 - User able to Fill Address")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can ADD ADDRESS from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkValidSaveDeliveryAddress() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testAddDeliveryAddress(
                "OFFICE",
                "Faizal",
                "087784292693"
        );
        profilePages.testDeliveryAddress(
                "Bendungan Hilir",
                "JL. Benhil Raya"
        );
    }

    @Test(priority = 206, description = "Switch_Profile_006 - User able to Fill Address")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can't ADD EMPTY ALL ADDRESS FORM from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkInvalidSaveDeliveryAddressAllEmpty() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testAddDeliveryAddress(
                "",
                "",
                ""
        );
    }

    @Test(priority = 207, description = "Switch_Profile_007 - User able to Copy Referral Code")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can COPY REFERRAL CODE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkCopyReferralCode() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testCopyReferralCode("fgyRpcHC");
    }

    @Test(priority = 208, description = "Switch_Profile_008 - User able to Share Referral Code")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can SHARE REFERRAL CODE from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkShareReferralCode() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testShareReferralCode("fgyRpcHC");
    }

    @Test(priority = 209, description = "Switch_Profile_009 - User unable to Change PIN with Incorrect Current PIN")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can't CHANGE PIN with Incorrect Current PIN from Profile Menu.")
    @Story("Story Name : Check User Profile")
    public void checkInvalidChangePIN() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testChangePin("123456");
    }

    @Test(priority = 210, description = "Switch_Profile - Check Wistlist page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can access wishlist page")
    @Story("")
    public void checkWishlistPage() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testCheckWishlist();
    }

    @Test(priority = 211, description = "Switch_Profile - Check SIM Info")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can access SIM info page")
    @Story("")
    public void checkSIMInfo() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testCheckSIMInfo();
    }

    @Test(priority = 212, description = "Switch_Profile - Chat")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can doing chat")
    @Story("")
    public void checkInputChat() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.testChatWithShely();
    }

    @Test(priority = 213, description = "Switch_Profile - FAQ")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can access FAQ page")
    @Story("")
    public void checkFAQ() throws InterruptedException {
        login.checkValidLoginUsingSwitchNumber();
        profilePages.checkFAQ();
    }
}
