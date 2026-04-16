package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/temp",
            glue = {"temp","stepdefinitions"},
            plugin = {"pretty","html:target/temp-report.html"}

    )
    public class TempRunner {
    }

