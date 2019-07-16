package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { ".\\src\\test\\Resources\\Featurefiles\\Signup.feature"}, 
        glue = {"stepdefinations","hooks"},
		plugin = {"html:target/cucumber-html-report","pretty", "json:target/cucumber-reports/Cucumber.json"},monochrome=true)



public class Signup extends AbstractTestNGCucumberTests{
	
	

}
