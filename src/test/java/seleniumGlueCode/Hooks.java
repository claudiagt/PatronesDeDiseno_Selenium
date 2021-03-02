package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Se está ejecutando el caso número: " + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown () {
        System.out.println("El caso número " + numberOfCase + " se ejecutó correctamente.");
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
