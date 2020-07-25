package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinations"},
//monochrome = true,
//plugin = {"pretty","html:target/HtmlReports"})
//public class TestRunner {
//
//}

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinations"},
//monochrome = true,
//plugin = {"pretty","json:target/JSONReports/report.json"})
//public class TestRunner {
//
//}


//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinations"},
//monochrome = true,
//plugin = {"pretty","junit:target/JUnitReport/report.xml"},
//tags="@smokeTest")
//public class TestRunner {
//
//}

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinations"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReport/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports"},
tags="@smokeTest")
public class TestRunner {

}