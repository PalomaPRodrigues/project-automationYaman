package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/login.feature", 
				 glue = {""},
                 plugin =  { "pretty" , "com.cucumber.listener.ExtentCucumberFormatter:target/reportTestesLogin.html"},
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false
)
public class LoginRunner {
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("./extension-config.xml"));
	
	 }

}
