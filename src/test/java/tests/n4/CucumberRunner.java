package tests.n4;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"n4\\framework\\steps"},
        features = {"C:\\Users\\work\\Documents\\IBS\\Обучение\\07. Selenium\\SelProjCucumber\\src\\test\\resources"},
        tags = {"@all"}
)

public class CucumberRunner {

}