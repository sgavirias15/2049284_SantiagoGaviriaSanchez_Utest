package co.com.bancolombia.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\create_account.feature",
        glue = "co/com/bancolombia/certification/utest/stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@ScenarioAccountSuccessful"
)

public class CreateAccount {
}
