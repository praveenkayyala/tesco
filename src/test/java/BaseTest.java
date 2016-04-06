import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ACER on 2/12/2016.
 */
public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public static void start()
    {
        System.out.println("Starting browser "+Main.browser);
        driver = new FirefoxDriver();

        System.out.println("Opening the home page"+Main.homeURL);

        driver.get(Main.homeURL);

        System.out.println("Checking the home page is shown");



    }


    @AfterClass
    public static void stop()
    {
        System.out.println("this is driver closing in after class");
       // driver.quit();
        driver.close();
    }


}
