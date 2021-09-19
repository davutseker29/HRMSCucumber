package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failed.txt"
		, glue = "com/hrms/steps",
		monochrome = true,
		publish = true,
		plugin = { "pretty",

		}

)

public class FailedRunner {

}
