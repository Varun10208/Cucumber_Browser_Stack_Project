package runner;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/Feature_Files",
   glue = "Pages",
   tags="@LoginPage"
   )
public class Runner{

}
