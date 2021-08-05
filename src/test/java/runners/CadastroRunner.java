package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/java/feature/cadastro.feature",
					glue = {""},
					plugin =  { "pretty","html:reports" },
					monochrome = true,
					snippets = SnippetType.CAMELCASE,
					dryRun = false
)
public class CadastroRunner {

}
