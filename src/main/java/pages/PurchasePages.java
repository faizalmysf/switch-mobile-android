package pages;

import operation.BaseHomepage;
import operation.BaseProduct;
import operation.BasePurchase;
import utilities.finders.ElementAction;

public class PurchasePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProduct baseProduct = new BaseProduct();
    BasePurchase basePurchase = new BasePurchase();
    ElementAction action = new ElementAction();

    public void testAddToCartPromoSuperBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        Thread.sleep(2000);
        baseProduct.clickDetailPromoSuperBundle();
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
    }

    public void testAddToCartPromoPowerBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        baseProduct.clickDetailPromoPowerBundle();
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        Thread.sleep(3000);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testAddToCartPromoStandardBundle(String productTitle, int increase, int decrease) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        baseProduct.clickDetailPromoStandardBundle();
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        Thread.sleep(3000);
        basePurchase.clickButtonDecreaseCountProduct(decrease);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testAddToCartPromoLiteBundle(String productTitle, int increase) throws InterruptedException {
        action.click(baseHomepage.btnBuyPlan);
        baseProduct.clickDetailPromoLiteBundle();
        action.checkerEqual(baseProduct.txtProductTitle, productTitle);
        basePurchase.clickButtonIncreaseCountProduct(increase);
        Thread.sleep(3000);
        action.click(basePurchase.btnAddToCart);
        action.click(basePurchase.btnConfirmBuy);
        action.click(basePurchase.btnChoosePayment);
        action.click(basePurchase.btnSeeDetailPurchase);
        action.click(basePurchase.btnCloseSeeDetailPurchase);
    }

    public void testConfirmPaymentGopay() {
        basePurchase.clickButtonChooseGoPay();
    }

    public void testConfirmPaymentDana() {
        basePurchase.clickButtonChooseDana();
    }

    public void testConfirmPaymentOVO() {
        basePurchase.clickButtonChooseOVO();
    }

    public void testConfirmPaymentCC() {
        basePurchase.clickButtonChooseCC();
    }

    public void testConfirmPermataVA() {
        basePurchase.clickButtonChoosePermataVA();
    }

    public void testConfirmDanamonVA() {
        basePurchase.clickButtonChooseDanamonVA();
    }

    public void testConfirmMandiriVA() {
        basePurchase.clickButtonChooseMandiriVA();
    }

    public void testConfirmAlfamart() {
        basePurchase.clickButtonChooseAlfamart();
    }

    public void testOrderSIM(String mainNumber) {
//        basePurchase.clickButtonLetsSwitch();
        basePurchase.clickChooseYourNumber(mainNumber);
    }
}
