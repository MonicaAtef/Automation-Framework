package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefintion.UserRegisteration;

@CucumberOptions(features="src/test/java/feature"
,glue={"stepDefintion"}
,plugin={"pretty","html:target/cucumber-html-report"})
public class TestRunner extends UserRegisteration{

}
