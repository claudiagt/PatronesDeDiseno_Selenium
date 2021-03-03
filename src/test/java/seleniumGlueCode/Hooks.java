package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se está ejecutando el caso número: " + numberOfCase);

        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);

        driver = driverManager.getDriver();

        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown () {
        System.out.println("El caso número " + numberOfCase + " se ejecutó correctamente.");
        driverManager.quitDriver();
    }

//    public static ChromeDriver getDriver() {
//        return driver;
//    }
}
