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
        action.click(baseHomepage.btnDeals);
        Thread.sleep(2500);
        action.click(baseDeals.btnStarFavorit);
        final String Voucher_title= action.getText(baseDeals.voucherTitle);
        profilePages.testCheckWishlist();
        action.checkTextCountains(Voucher_title);
        action.click(baseDeals.btnStarWishlist);
        action.checkerEnabled(baseDeals.txtemptyMessage);
    }

    public void testBuyProductWithRuby() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        baseDeals.buyProductWithRuby();
    }

    public void testBuyProductWithPoint() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        baseDeals.buyProductWithPoint();
    }
}
