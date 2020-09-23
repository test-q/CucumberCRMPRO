package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue= {"stepDefination"},
monochrome = true,
plugin = {"pretty", "html:test-output", "json:Json-Report/report.json", "junit:Junit-Report/report.xml"},
dryRun = false,
strict = true

//plugin = {"pretty", "html:test-output"},
//plugin = {"pretty", "json:Json-Report/report.json"}
//plugin = {"pretty", "junit:Junit-Report/report.xml"}
)
public class TestRunner {

}
