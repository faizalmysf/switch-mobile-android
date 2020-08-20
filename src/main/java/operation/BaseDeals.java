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


    public void buyProductWithRuby() throws InterruptedException {
        final String Ruby_amount = action.getText(getTxtRubyValue);
        action.click(btnDealsNotification);
        action.waitUntiElementPresent(txtFnB);
        action.click(txtFnB);
        final String Coupon_amount = action.getText(couponCount);
        action.click(btnBack);
        action.waitUntiElementPresent(btnBuyVoucher);
        action.click(btnBuyVoucher);
        action.click(btnRedeemVoucher);
        action.click(btnRedeemVoucher);
        action.click(btnRedeemVoucher);
        action.waitUntiElementPresent(txtFnB);
        action.click(txtFnB);
        final String Coupon_amountNEW = action.getText(couponCount);
        action.checkerStringNotEqual(Coupon_amount, Coupon_amountNEW);
        action.click(btnBack);
        final String Ruby_amountNEW = action.getText(getTxtRubyValue);
        action.checkerStringNotEqual(Ruby_amount, Ruby_amountNEW);
        int final_amount = Integer.parseInt(Ruby_amount) - Integer.parseInt(Ruby_amountNEW);
        if (final_amount == 1) {
            System.out.println("Ruby deducted perfectly");
        } else {
            System.out.println("Ruby deducted wrong");
        }
    }

    public void buyProductWithPoint() throws InterruptedException {
        action.waitUntiElementPresent(getTxtPointValue);
        final String Point_amount = action.getText(getTxtPointValue);
        action.click(btnDealsNotification);
        action.waitUntiElementPresent(txtShopping);
        action.click(txtShopping);
        final String Coupon_amount = action.getText(couponCount);
        action.click(btnBack);
        Thread.sleep(3000);
        action.scrollAndClick("Rahmat Deals Point");
        action.click(btnRedeemVoucher);
        action.click(btnRedeemVoucher);
        action.waitUntiElementPresent(btnRedeemVoucher);
        action.click(btnRedeemVoucher);
        action.waitUntiElementPresent(txtShopping);
        action.click(txtShopping);
        action.waitUntiElementPresent(couponCount);
        final String Coupon_amountNEW = action.getText(couponCount);
        action.checkerStringNotEqual(Coupon_amount, Coupon_amountNEW);
        action.click(btnBack);
        final String Ruby_pointNEW = action.getText(getTxtRubyValue);
        action.checkerStringNotEqual(Point_amount, Ruby_pointNEW);
        int final_amount = Integer.parseInt(Point_amount) - Integer.parseInt(Ruby_pointNEW);
        if (final_amount == 1) {
            System.out.println("Point deducted perfectly");
        } else {
            System.out.println("Point deducted wrong");
        }
    }

}