package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Z_Jpet2/src/main/resources/vicky.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@jpet_test_cases_set1"},
		glue = {"com.steps"},
		monochrome = true	
		)
public class Jpet_application1_Runner {

}
