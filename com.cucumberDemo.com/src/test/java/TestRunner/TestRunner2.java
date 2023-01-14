package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//BackgroundFeature",
glue= {"StepDefinition"},
plugin= {"pretty","html:target/htmlreports2.html"}, 
monochrome = true)

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
