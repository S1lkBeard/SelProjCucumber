package n4.framework.managers;

import n4.framework.pages.AuthPage;
import n4.framework.pages.BusinessTripPage;
import n4.framework.pages.StartPage;

public class PageManager {

    private static PageManager INSTANCE;

    private static PageManager pageManager;

    private AuthPage authPage;
    private StartPage startPage;
    private BusinessTripPage businessTripPage;

    private PageManager() {
    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    public AuthPage getAuthPage() {
        if (authPage == null) {
            authPage = new AuthPage();
        }
        return authPage;
    }

    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    public BusinessTripPage getBusinessTripPage() {
        if (businessTripPage == null) {
            businessTripPage = new BusinessTripPage();
        }
        return businessTripPage;
    }
}
