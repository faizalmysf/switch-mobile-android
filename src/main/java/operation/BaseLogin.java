package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.net.MalformedURLException;

public class BaseLogin extends BaseTest {

    public By btnSubmitLogin = By.id(ObjectElement.LoginPageObject.btnSubmitLogin);

    public By inputUsername = By.id(ObjectElement.LoginPageObject.inputUserName);

    public By inputPIN = By.id(ObjectElement.PINPageObject.inputPIN);

    public By btnProfile = By.id(ObjectElement.MenuPageObject.btnProfile);

    public By txtValidationTitle = By.id(ObjectElement.LoginPageObject.txtUserValidationTitle);

    public By txtValidationDesc = By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc);

    public By txtErrorInput = By.id(ObjectElement.LoginPageObject.txtErrorInputDesc);

    public By btnChangeEmail = By.id(ObjectElement.LoginPageObject.btnChangeEmail);

    public By btnSignUp2 = By.id(ObjectElement.LoginPageObject.btnSignUp2);

    public By txtVariousLoginDesc = By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc);

    public void checkValidationUnregisteredEmail() {
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_USERNAME_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
    }

    public void checkValidationRegisteredEmail() {
        String TextInfo = driver.findElement(By.id(ObjectElement.LoginPageObject.txtUserValidationTitle)).getText();
        String DescInfoValidation = driver.findElement(By.id(ObjectElement.LoginPageObject.txtVariousLoginDesc)).getText();
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_TITLE_EN, TextInfo);
        Assert.assertEquals(BaseData.Validation.VALIDATION_ALREADY_REGISTERED_DESC_EN, DescInfoValidation);
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnChangeEmail)));
        Assert.assertNotNull(driver.findElement(By.id(ObjectElement.LoginPageObject.btnSignUp2)));
    }

    public void checkInvalidSwitchNumber() {
        String validationTxt = driver.findElement(By.id(ObjectElement.LoginPageObject.txtErrorInputDesc)).getText();
        Assert.assertEquals(validationTxt, BaseData.Validation.VALIDATION_WRONG_SWITCH_NUMBER);
    }

    public void clickButtonSignUp() {
        driver.findElement(By.id(ObjectElement.LandingPageObject.btnSignUp)).click();
    }

}
