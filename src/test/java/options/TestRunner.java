package options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions", // package name where code is located.
        tags="@SanityTest or @SmokeTest or @BrowserTest",
//        dryRun = true,
//        monochrome = true,
        plugin = {"pretty", "html:target/testresults.html", "json:target/testresults.json", "junit:cukes.xml"}
)
public class TestRunner {
}
