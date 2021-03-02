package runner.browser_manager;

import java.sql.DriverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new FireFoxDrivermanager();
                break;

            default:
                System.out.println("Invalid browser selected");
                break;
        }

    }
}
