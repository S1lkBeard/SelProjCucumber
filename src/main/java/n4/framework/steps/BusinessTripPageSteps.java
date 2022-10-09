package n4.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import n4.framework.managers.PageManager;

public class BusinessTripPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("Создание командировки")
    public void clickBusinessTrip() {
        pageManager.getBusinessTripPage().clickBusinessTrip();
    }

    @И("Проверка наличия и корректности заголовка на странице командировок")
    public void checkHeader() {
        pageManager.getBusinessTripPage().checkHeader();
    }

    @И("Выбор подразделения")
    public void choiseDiv() {
        pageManager.getBusinessTripPage().choiseDiv();
    }

    @И("Выбор организации")
    public void choiseOrg() {
        pageManager.getBusinessTripPage().choiseOrg();
    }

    @И("Выбор чекбокса")
    public void choiseCheckbox() {
        pageManager.getBusinessTripPage().choiseCheckbox();
    }

    @И("Выбор городов отбытия и прибытия:")
    public void choiseCity(DataTable dataTable) {
        dataTable.asMap(String.class, String.class).forEach((value1, value2) ->
                pageManager.getBusinessTripPage().choiseCity((String) value1, (String) value2));
    }

    @И("Выбор дат отбытия и прибытия:")
    public void choiseDate(DataTable dataTable) {
        dataTable.asMap(String.class, String.class).forEach((value1, value2) ->
                pageManager.getBusinessTripPage().choiseDate((String) value1, (String) value2));
    }

    @И("Клик по кнопке 'Сохранить и выйти'")
    public void clickSaveAndExit() {
        pageManager.getBusinessTripPage().clickSaveAndExit();
    }

    @И("Проверка наличия и корректности отображения текста ошибки")
    public void checkErrorMsg() {
        pageManager.getBusinessTripPage().checkErrorMsg();
    }
}
