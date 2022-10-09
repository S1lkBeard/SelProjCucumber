package tests.n4.base;

import n4.framework.managers.DriverManager;
import n4.framework.managers.InitManager;
import n4.framework.managers.PageManager;
import n4.framework.managers.PropManager;
import n4.framework.utils.PropsConsts;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

//public class BaseTests {
//
//    private DriverManager driverManager = DriverManager.getInstance();
//    private PropManager propManager = PropManager.getInstance();
//    protected PageManager pageManager = PageManager.getInstance();
//
//    @BeforeClass
//    public static void BeforeClass() {
//        InitManager.initFramework();
//    }
//
//    @Before
//    public void before() {
//        driverManager.getDriver().get(propManager.getProperty(PropsConsts.BASE_URL));
//    }
//
//    @AfterClass
//    public static void AfterClass() {
//        InitManager.quitFramework();
//    }
//}
