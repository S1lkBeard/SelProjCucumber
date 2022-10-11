package n4.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import n4.framework.managers.PageManager;

import java.util.List;
import java.util.Map;

public class AuthPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("^Заполнение полей логина и пароля:$")
    public void fillField(DataTable mapFieldsAndValue) {
        mapFieldsAndValue.asMap(String.class, String.class).forEach((key, value) ->
                pageManager.getAuthPage().fillField((String) key, (String) value));
    }

    @И("Клик на кнопку 'Войти'")
    public void clickField() {
        pageManager.getAuthPage().clickField();
    }
}
