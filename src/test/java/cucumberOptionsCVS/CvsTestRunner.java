package cucumberOptionsCVS;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/cvs_feature",
		glue="stepDefinitionCVS", tags="@test",
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"} )

public class CvsTestRunner {

}
