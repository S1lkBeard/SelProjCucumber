package n4.framework.steps;

import io.cucumber.java.ru.И;
import n4.framework.managers.PageManager;

public class StartPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("Проверка наличия и корректности заголовка на стартовой странице")
    public void checkHeader() {
        pageManager.getStartPage().checkHeader();
    }

    @И("Выбор подменю 'Командировки' в меню 'Расходы и последующий переход'")
    public void clickField() {
        pageManager.getStartPage().clickField();
    }
}
