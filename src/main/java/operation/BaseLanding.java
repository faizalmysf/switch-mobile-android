package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import io.qameta.allure.*;
import utilities.finders.ElementAction;

import java.io.File;
import java.net.MalformedURLException;

public class BaseLanding extends BaseTest {

    ElementAction action = new ElementAction();

    public By btnLogin = By.id(ObjectElement.LandingPageObject.btnLogin);

    public By btnHeadLogin = By.id(ObjectElement.SignUpPageObject.btnLogin);

    public By btnSignUp = By.id(ObjectElement.LandingPageObject.btnSignUp);

    public By btnSkip = By.id(ObjectElement.LandingPageObject.btnSkip);

    public By btnLoginHere = By.id(ObjectElement.SignUpPageObject.btnLoginHere);

    public By btnOtherMethod = By.id(ObjectElement.LoginPageObject.btnOtherMethods);

    public By btnGoogle = By.id(ObjectElement.LoginPageObject.btnGoogle);

    public By btnFacebook = By.id(ObjectElement.LoginPageObject.btnFacebook);

    public By txtTitlePages = By.id(ObjectElement.LoginPageObject.txtLoginTitle);

    public By txtWelcomeTitle = By.id(ObjectElement.LoginPageObject.txtWelcomeTitle);

    public By txtWelcomeDesc = By.id(ObjectElement.LoginPageObject.txtWelcomeDesc);

    public By txtLangCenter = By.id(ObjectElement.LoginPageObject.txtOtherWaysTitle);

    public By txtPinTitle = By.id(ObjectElement.PINPageObject.txtPINPageTitle);

    public By txtPinDesc = By.id(ObjectElement.PINPageObject.txtPINInputDesc);

    public By btnSubmitLogin = By.id(ObjectElement.LoginPageObject.btnSubmitLogin);

    public By btnGoogleAccount = By.id(ObjectElement.LoginPageObject.btnGoogleAccount);

    public By btnBack = By.id(ObjectElement.LoginPageObject.btnBack);

    public String titlePage() {
        String titlePage = action.getText(txtTitlePages);
        try {
            return String.valueOf(titlePage);
        } catch (Exception e) {
            return null;
        }
    }

    public String welcomeTitle() {
        String welcomeAppSwitch = action.getText(txtWelcomeTitle);
        try {
            return String.valueOf(welcomeAppSwitch);
        } catch (Exception e) {
            return null;
        }
    }

    public String welcomeDesc() {
        String wDesc = action.getText(txtWelcomeDesc);
        try {
            return String.valueOf(wDesc);
        } catch (Exception e) {
            return null;
        }
    }

    public String langCenter() {
        String owTitle = action.getText(txtLangCenter);
        try {
            return String.valueOf(owTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public void checkValidationWelcomeText() {
        if (langCenter().equals("atau bisa pakai") && titlePage().equals(BaseData.Validation.VALIDATION_LOGIN_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_ID);
        } else if (langCenter().equals("or use") && titlePage().equals(BaseData.Validation.VALIDATION_LOGIN_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_EN);
        } else if (langCenter().equals("atau bisa pakai") && titlePage().equals(BaseData.Validation.VALIDATION_REGISTER_PAGE)) {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_ID);
        } else {
            Assert.assertEquals(welcomeTitle(), BaseData.LaunchPage.WELCOME_EN);
            Assert.assertEquals(welcomeDesc(), BaseData.LaunchPage.WELCOME_DESC_SIGN_UP_EN);
        }
    }

    public void checkUserProfile(String username) {
        String ProfileName = driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile)).getText();
        Assert.assertEquals(ProfileName, username);
    }

    public void clickButtonSubmitSignUp() {
        driver.findElement(By.id(ObjectElement.LoginPageObject.btnSubmitLogin)).click();
    }
}
