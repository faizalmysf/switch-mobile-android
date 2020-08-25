package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.finders.ElementAction;

public class BaseDeals extends BaseTest {
    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();

    public By btnPoint = By.id(ObjectElement.DealsPageObject.btnPoint);

    public By txtPointValue = By.id(ObjectElement.DealsPageObject.txtPointValue);

    public By btnRuby = By.id(ObjectElement.DealsPageObject.btnRuby);

    public By txtRubyValue = By.id(ObjectElement.DealsPageObject.txtRubyValue);

    public By btnSeeAllSpecialDeals2TOP = By.id(ObjectElement.DealsPageObject.btnSeeAllSpecialDeals2TOP);

    public By searchVoucher = By.id(ObjectElement.DealsPageObject.searchVoucher);

    public By totalPoint = By.id(ObjectElement.DealsPageObject.totalPoint);

    public By totalRuby = By.id(ObjectElement.DealsPageObject.totalRuby);

    public By voucherTitle = By.id(ObjectElement.DealsPageObject.voucherTitle);

    public By btnStarFavorit = By.id(ObjectElement.DealsPageObject.btnStarFavorit);

    public By btnStarWishlist = By.id(ObjectElement.DealsPageObject.btnStarWishlist);

    public By txtemptyMessage = By.id(ObjectElement.DealsPageObject.txtemptyMessage);

    public By getTxtRubyValue = By.id(ObjectElement.DealsPageObject.getTxtRubyValue);

    public By getTxtPointValue = By.id(ObjectElement.DealsPageObject.getTxtPointValue);

    public By btnBuyVoucher = By.id(ObjectElement.DealsPageObject.btnBuyVoucher);

    public By btnRedeemVoucher = By.id(ObjectElement.DealsPageObject.btnRedeemVoucher);

    public By txtFnB = By.xpath(ObjectElement.DealsPageObject.txtFnB);

    public By txtShopping = By.xpath(ObjectElement.DealsPageObject.txtShopping);

    public By couponCount = By.id(ObjectElement.DealsPageObject.couponCount);

    public By btnDealsNotification = By.id(ObjectElement.DealsPageObject.btnDealsNotification);

    public By btnBack = By.id(ObjectElement.ReferralObject.btnBack);

    public By txtRahmatPoint = By.xpath(ObjectElement.DealsPageObject.txtRahmatPoint);


    public String voucherTitle() {
        String vTitle = action.getText(voucherTitle);
        try {
            return String.valueOf(vTitle);
        } catch (Exception e) {
            return null;
        }
    }

    public String getRubyValue() {
        String vRuby = action.getText(getTxtRubyValue);
        try {
            return String.valueOf(vRuby);
        } catch (Exception e) {
            return null;
        }
    }

    public String getPointValue() {
        String vPoint = action.getText(getTxtPointValue);
        try {
            return String.valueOf(vPoint);
        } catch (Exception e) {
            return null;
        }
    }

    public String getCoupon() {
        String vCoupon = action.getText(couponCount);
        try {
            return String.valueOf(vCoupon);
        } catch (Exception e) {
            return null;
        }
    }

}