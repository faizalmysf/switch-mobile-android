package pages;

import operation.BaseDeals;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class DealsPages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseDeals baseDeals = new BaseDeals();
    ProfilePages profilePages = new ProfilePages();
    ElementAction action = new ElementAction();

    public void testSeeAllSpecialDeals() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnSeeAllSpecialDeals2TOP);
        action.checkerEnabled(baseDeals.searchVoucher);
    }

    public void testCheckPointsValue() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
       action.waitUntiElementPresent(baseDeals.btnPoint);
        action.click(baseDeals.btnPoint);
        action.checkerEnabled(baseDeals.totalPoint);
    }

    public void testCheckRubyValue() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        Thread.sleep(2500);
        action.click(baseDeals.btnRuby);
        action.checkerEnabled(baseDeals.totalRuby);
    }

    public void testMarkWishlistProduct() throws InterruptedException {
        action.waitUntiElementPresent(baseHomepage.btnDeals);
        action.click(baseHomepage.btnDeals);
        action.waitUntiElementPresent(baseDeals.btnStarFavorit);
        action.click(baseDeals.btnStarFavorit);
        profilePages.testCheckWishlist();
        action.waitUntiElementPresent(baseDeals.btnStarWishlist);
        action.click(baseDeals.btnStarWishlist);
        action.waitUntiElementPresent(baseDeals.txtemptyMessage);
        action.checkerEnabled(baseDeals.txtemptyMessage);
//        final String Voucher_title= action.getText(baseDeals.voucherTitle);
//        action.checkTextCountains(Voucher_title);

    }

    public void testBuyProductWithRuby() throws InterruptedException {
        action.waitUntiElementPresent(baseHomepage.btnDeals);
        action.click(baseHomepage.btnDeals);
        action.waitUntiElementPresent(baseDeals.btnStarFavorit);
        String rOld = baseDeals.getRubyValue();
        action.click(baseDeals.btnDealsNotification);
        action.waitUntiElementPresent(baseDeals.txtFnB);
        action.click(baseDeals.txtFnB);
        String cOld = baseDeals.getCoupon();
        action.click(baseDeals.btnBack);
        action.waitUntiElementPresent(baseDeals.btnBuyVoucher);
        action.click(baseDeals.btnBuyVoucher);
        action.click(baseDeals.btnRedeemVoucher);
        action.click(baseDeals.btnRedeemVoucher);
        action.click(baseDeals.btnRedeemVoucher);
        action.waitUntiElementPresent(baseDeals.txtFnB);
        action.click(baseDeals.txtFnB);
        String cNew = baseDeals.getCoupon();
        action.checkerStringNotEqual(cOld, cNew);
        action.click(baseDeals.btnBack);
        String rNew =baseDeals.getRubyValue();
        action.checkerStringNotEqual(rOld, rNew);
        int finalAmount = Integer.parseInt(rOld) - Integer.parseInt(rNew);
        if (finalAmount == 1) {
            System.out.println("Ruby deducted perfectly");
        } else {
            System.out.println("Ruby deducted wrong");
        }
    }

    public void testBuyProductWithPoint() throws InterruptedException {
        action.waitUntiElementPresent(baseHomepage.btnDeals);
        action.click(baseHomepage.btnDeals);
        action.waitUntiElementPresent(baseDeals.btnStarFavorit);
        action.waitUntiElementPresent(baseDeals.getTxtPointValue);
        String pOld = baseDeals.getPointValue();
        action.click(baseDeals.btnDealsNotification);
        action.waitUntiElementPresent(baseDeals.txtShopping);
        action.click(baseDeals.txtShopping);
        String cOld = baseDeals.getCoupon();
        action.click(baseDeals.btnBack);
        action.scrollAndClick("Rahmat Deals Point");
        action.click(baseDeals.btnRedeemVoucher);
        action.click(baseDeals.btnRedeemVoucher);
        action.click(baseDeals.btnRedeemVoucher);
        action.waitUntiElementPresent(baseDeals.txtShopping);
        action.click(baseDeals.txtShopping);
        action.waitUntiElementPresent(baseDeals.couponCount);
        String cNew = baseDeals.getCoupon();
        action.checkerStringNotEqual(cOld, cNew);
        action.click(baseDeals.btnBack);
        String pNew = baseDeals.getPointValue();
        action.checkerStringNotEqual(pOld, pNew);
        int finalAmount = Integer.parseInt(pOld) - Integer.parseInt(pNew);
        if (finalAmount == 1) {
            System.out.println("Point deducted perfectly");
        } else {
            System.out.println("Point deducted wrong");
        }

    }
}
