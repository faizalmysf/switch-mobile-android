package pages;

import operation.BaseHistory;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class HistoryPages {

    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseHistory baseHistory = new BaseHistory();

    public void testCheckHistoryAllTrx() throws InterruptedException {
        action.click(baseHomepage.btnHistory);
        Thread.sleep(3000);
        baseHistory.clickButtonAll();
    }

    public void testCheckHistoryWaitingTrx() throws InterruptedException {
        action.click(baseHomepage.btnHistory);
        Thread.sleep(3000);
        baseHistory.clickButtonWaiting();
    }

    public void testCheckHistoryProcessedTrx() throws InterruptedException {
        action.click(baseHomepage.btnHistory);
        Thread.sleep(3000);
        baseHistory.clickButtonProcess();
    }

    public void testCheckHistoryFinishTrx() throws InterruptedException {
        action.click(baseHomepage.btnHistory);
        Thread.sleep(3000);
        baseHistory.clickButtonFinishTrx();
    }
}
