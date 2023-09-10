package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty","json:target/cucumber-reports/Cucumber.json", "html:target/reports/login.html" }, // reporting purpose
monochrome = false, // console output
tags = "", // tags from feature file
features = { "src/test/resources/Features" }, // location of feature files
glue = { "stepDefinitions","applicationHooks" }) // location of step definition files

public class RunnerFile extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}