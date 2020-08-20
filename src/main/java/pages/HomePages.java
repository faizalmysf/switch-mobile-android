package pages;

import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class HomePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();

    public void testUserCanMoveToMainMenuPage() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        action.checkerEnabled(baseHomepage.btnDeals);
        Thread.sleep(2500);
        action.click(baseHomepage.btnQuest);
        Thread.sleep(2500);
        action.click(baseHomepage.btnHistory);
        Thread.sleep(2500);
        action.click(baseHomepage.btnProfile);
        Thread.sleep(2500);
        action.click(baseHomepage.btnHome);
        Thread.sleep(2500);
        action.click(baseHomepage.btnNotification);
    }

    public void testUserUnableMoveToAllMenuExceptMainMenu() throws InterruptedException{
        baseHomepage.clickButtonDeals();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonQuest();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonHistory();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonProfile();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonHome();
        Thread.sleep(2500);
        baseHomepage.clickButtonNotification();
        baseHomepage.clickButtonCloseGuestPp();
    }
}
