package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Feature",
glue= {"StepDefinition"},
plugin= {"pretty","html:target/htmlreports.html"}, tags="@RegressionTest",
monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}





/*import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature",
glue = {"StepDefinition"}, monochrome=false,
plugin = {"junit:target/junitreports/junitreports.xml"})
public class TestRunner {

}*/




