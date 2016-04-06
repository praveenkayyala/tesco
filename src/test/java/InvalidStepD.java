import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ACER on 2/12/2016.
 */
public class InvalidStepD {

    public static WebDriver driver = BaseTest.driver;

    @Before
    public void before() {
        System.out.println();
        System.out.println("I am starting pre condition checks ......");
        driver.findElement(By.className("header-logo")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("^customer on navigate to the Login Page$")
    public void amnavigativepage() throws Throwable {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("demo.nopcommerce.com");
        driver.findElement(By.xpath("//*[@class='ico-login']")).click();
        System.out.println("this is my loginpage navigative");
    }

    @When("^am enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String Email, String Password) throws Throwable {
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Email);
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(Password);
    }

    @And("^am press on to the LOGIN Button$")
    public void iClickOnToTheLOGINButton() throws Throwable {
        driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
        System.out.println("i enter worng email and password");
    }

    @Then("^I should able to see error message \"([^\"]*)\"$")
    public void i_should_error_message(String Error) throws Throwable {
        Assert.assertTrue("Checking the error message shown "
                , driver.findElement(By.tagName("body")).getText().contains(Error));
        System.out.println("with email and password no customer account found");
        //driver.findElement((By.tagName("the ID of the element that contains Error")).Text.Contains("Error");
        // Assert.assertTrue("Verification Failed:  are not same.", (driver.findElement(By.xpath("//*[@class='validation-summary-errors']" )).getText().equalsIgnoreCase("Error")));    }
    }
}
