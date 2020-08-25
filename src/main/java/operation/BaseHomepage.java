package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseHomepage extends BaseTest {

    public By icUserProfile = By.id(ObjectElement.MenuPageObject.txtUserProfile);

    public By btnHome = By.id(ObjectElement.MenuPageObject.btnHome);

    public By btnDeals = By.id(ObjectElement.MenuPageObject.btnDeals);

    public By btnQuest = By.id(ObjectElement.MenuPageObject.btnQuest);

    public By btnHistory = By.id(ObjectElement.MenuPageObject.btnHistory);

    public By btnProfile = By.id(ObjectElement.MenuPageObject.btnProfile);

    public By txtUserProfile = By.id(ObjectElement.MenuPageObject.txtUserProfile);

    public By btnNotification = By.id(ObjectElement.MenuPageObject.btnNotification);

    public By addPopUp = By.id(ObjectElement.MenuPageObject.addPopUp);

    public By btnClosePp = By.id(ObjectElement.MenuPageObject.btnCloseGuestPp);

    public By popUpLocation = By.id(ObjectElement.MenuPageObject.popUpLocation);

    public By buttonConfirmPopup = By.id(ObjectElement.MenuPageObject.buttonConfirmPopup);

    public By planBox = By.id(ObjectElement.MenuPageObject.planBox);

    public By btnBuyPlan = By.id(ObjectElement.MenuPageObject.btnBuyProduct);

    public By btnCloseGuestPp = By.id(ObjectElement.MenuPageObject.btnCloseGuestPp);

    public By btnLetsSwitch = By.id(ObjectElement.MenuPageObject.btnLetsSwitch);
}
