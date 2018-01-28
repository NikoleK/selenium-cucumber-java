package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "cucumber.steps",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberTestRunner {

}
