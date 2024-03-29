package co.com.pragma.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/switch_screen.feature",
        glue = "co.com.pragma.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SwitchScreenRunner {
}
