package n4.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import n4.framework.managers.DriverManager;
import n4.framework.managers.InitManager;
import n4.framework.managers.PropManager;
import n4.framework.utils.PropsConsts;

public class Hooks {

    private DriverManager driverManager = DriverManager.getInstance();
    private PropManager propManager = PropManager.getInstance();

    @Before
    public void before() {
        InitManager.initFramework();
        driverManager.getDriver().get(propManager.getProperty(PropsConsts.BASE_URL));
    }

    @After
    public void after() {
        InitManager.quitFramework();
    }
}
