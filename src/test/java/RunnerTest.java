import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ACER on 2/12/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/sudhakar-html-report", "json:target/kayyala.json"},
        // features = {"src/main/resources"},
        tags = {"@invalidlogin"}
        //tags = {"@login"},
)
public class RunnerTest extends BaseTest {

}

