package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", // specify which feature file to run
		// in our case we do say to run all features inside features package
		glue = "com/hrms/steps", // where we can find implementation code for gherkin steps?
		// we specify just package
		dryRun = true, // if set to true it will quickly scan that all gherkin steps have
						// implementation code
						// if set to true no actual execution will happen
		monochrome = true, tags = "@report",
//		strict = true,
		publish = true, plugin = { "pretty",
				"html:target/cucumber-default-reports",
				"json:target/cucumber.json",
				"rerun:target/failed.txt"

		}

)

public class SingleTestRunner {

}
