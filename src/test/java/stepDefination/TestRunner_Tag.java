package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureTag", glue= {"stepDefination"},
monochrome = true, // Console output in readable format
plugin = {"pretty", "html:test-output", "json:Json-Report/report.json", "junit:Junit-Report/report.xml"},
dryRun = false, //Check any undefined/pending step is available or not
strict = true,
//tags   = {"@smoke"}  // 4 test executed
//tags   = {"@end2end and @smoke"}   // 0 test 	executed
//tags   = {"@end2end or @smoke"}  // 6 test executed
//tags   = {"@smoke and @regression"}  // 3 test executed
//tags     = {"(@smoke or @end2end) and @regression"}  // 3 test executed
//tags   = {" not @smoke"} // 3 test executed
//tags   = {" not @end2end or @smoke"}  // 5 test exected
//tags   = {" not (@smoke and @regression)"} // 4 test executed
tags   = {"@all"}  // Tag at feature level hence all test executed ie 10
//tags   = {"@inherit"} // Tag at scenario outline hence same scenario executed 3 times

//plugin = {"pretty", "html:test-output"},
//plugin = {"pretty", "json:Json-Report/report.json"}
//plugin = {"pretty", "junit:Junit-Report/report.xml"}

)
public class TestRunner_Tag {

}
	