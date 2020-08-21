package pages;

import constants.BaseData;
import io.qameta.allure.Step;
import operation.BaseLanding;
import utilities.finders.ElementAction;

public class LandingPages {

    BaseLanding baseLanding = new BaseLanding();
    ElementAction action = new ElementAction();

    @Step("Click Button Login")
    public void testGoToLoginPage() throws InterruptedException {
        action.click(baseLanding.btnLogin);
        baseLanding.checkValidationWelcomeText();
        Thread.sleep(3000);
        System.out.println("Click Button Login");
    }

    @Step("Click Button Skip")
    public void testLoginAsGuest() throws InterruptedException{
        action.click(baseLanding.btnSkip);
        baseLanding.checkUserProfile(BaseData.HomePage.GUEST_NAME);
        Thread.sleep(3000);
    }

    @Step("Click Button Sign Up")
    public void testGoToSignUpPage() throws InterruptedException {
        Thread.sleep(3000);
        action.click(baseLanding.btnSignUp);
        baseLanding.checkValidationWelcomeText();
        Thread.sleep(3000);
    }

    @Step("Click All Possible Button Landing Pages")
    public void testCheckHeaderFooterButton() throws InterruptedException {
        //From landing page to sign up page
        action.click(baseLanding.btnSignUp);
        baseLanding.checkValidationWelcomeText();
        //From sign up page to login page using button header
        action.click(baseLanding.btnHeadLogin);
        baseLanding.checkValidationWelcomeText();
        //From login page to sign up using button header
        action.click(baseLanding.btnHeadLogin);
        baseLanding.checkValidationWelcomeText();
        //From sign up page to login page using button footer
        action.click(baseLanding.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
        //From login page to sign up page using button footer
        action.click(baseLanding.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
        Thread.sleep(3000);
    }

    @Step("Sign Up With Google")
    public void testSignUpWithGoogle() throws InterruptedException {
        action.click(baseLanding.btnSignUp);
        Thread.sleep(3000);
        action.click(baseLanding.btnOtherMethod);
        action.click(baseLanding.btnGoogle);
        action.click(baseLanding.btnGoogleAccount);
        Thread.sleep(3000);
    }

    @Step("Sign Up With Facebook")
    public void testSignUpWithFacebook() throws InterruptedException{
        action.click(baseLanding.btnSignUp);
        Thread.sleep(2000);
        action.click(baseLanding.btnOtherMethod);
        action.click(baseLanding.btnFacebook);
        Thread.sleep(3000);
    }

    public void testCheckLoginPage() {
        baseLanding.checkValidationWelcomeText();
    }

    public void clickButtonBack() {
        action.click(baseLanding.btnBack);
    }
}
