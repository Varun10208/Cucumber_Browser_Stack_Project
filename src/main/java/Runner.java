import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/Feature_Files/loginPage.feature",
   //path of step definition file
   glue = "StepDefinitions",
   tags="@LoginPage"
   )
public class Runner{

}
