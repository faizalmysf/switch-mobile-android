package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import listeners.TestAllureListener;
import operation.BaseLanding;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LandingPages;
import pages.ProfilePages;

@Listeners({TestAllureListener.class})
public class LandingITest extends TestSetup {

    LandingPages landingPages = new LandingPages();
    ProfilePages profilePages = new ProfilePages();
    ProfileITest profile = new ProfileITest();
    BaseLanding baseLanding = new BaseLanding();

    @Test(priority = 1, description = "Switch_Land_001 - User able to go to Login/SignUp")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToSignUpPage() throws InterruptedException {
        landingPages.testGoToSignUpPage();
    }

    @Test(priority = 2, description = "Switch_Land_002 - User able to go to LOGIN PAGE")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Login Page on Clicking on Login Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToLoginPage() throws InterruptedException {
        landingPages.testGoToLoginPage();
    }

    @Test(priority = 3, description = "Switch_Land_003 - User able to login as GUEST")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to GuestPage on Clicking on Skip Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkLoginAsGuest() throws InterruptedException {
        landingPages.testLoginAsGuest();
    }

    @Test(priority = 4, description = "Switch_Land_004 - User able to go to any page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Navigate to Sign Up/Login page simultneously.")
    @Story("Story Name : Check On Landing Page")
    public void checkMoveToPageFrequently() throws InterruptedException {
        landingPages.testCheckHeaderFooterButton();
    }

    @Test(priority = 5, description = "Switch_Land_005 - User able to SIGN UP using Unregistered Google Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Google account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredGoogleAccount() throws InterruptedException {
        landingPages.testSignUpWithGoogle();
    }

    @Test(priority = 6, description = "Switch_Land_006 - User able to SIGN UP using Unregistered Facebook Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is able to Capture Facebook account in Sign Up flow.")
    @Story("Story Name : Check On Landing Page")
    public void checkSignUpWithUnregisteredFacebookAccount() throws InterruptedException {
        landingPages.testSignUpWithFacebook();
    }

    @Test(priority = 7, description = "Switch_Land_007 - User able to go to Login/SignUp with Bahasa Language")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
    @Story("Story Name : Check On Landing Page")
    public void checkGoToSignUpPageBahasa() throws InterruptedException {
        profile.checkChangeLanguage();
        profilePages.testLogout();
        profilePages.testClickButtonLoginHere();
        landingPages.testCheckLoginPage();
    }

//    @Test(priority = 8, description = "Switch_Land_007 - User able to go to Login/SignUp with Bahasa Language")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Verify that User is navigating to Sign Up Page on Clicking on Sign Up Button in any storyboard.")
//    @Story("Story Name : Check On Landing Page")
//    public void checkGoToSignInPageBahasa() throws InterruptedException {
//        profilePages.testChangeLanguage();
//        profilePages.testLogout();
//        profilePages.testClickButtonLoginHere();
//        landingPages.clickButtonBack();
//        landingPages.testGoToSignUpPage();
//    }
}
