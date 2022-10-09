package n4.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import n4.framework.managers.PageManager;

public class AuthPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("^Заполнение полей логина и пароля:$")
    public void fillField(DataTable dataTable) {
        dataTable.asMap(String.class, String.class).forEach((key, value) ->
                pageManager.getAuthPage().fillField((String) key, (String) value));
    }

    @И("Клик на кнопку 'Войти'")
    public void clickField() {
        pageManager.getStartPage().clickField();
    }
}
