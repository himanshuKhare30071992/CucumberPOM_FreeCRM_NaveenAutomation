package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features="C:/Users/HK-SONY/Selenium_Eclipse_Workspace/CucumberPOM_FreeCRM_NaveenAutomation//src/main/java/com/qa/features/freeCRM.feature",
			glue= {"com/qa/stepDefinitions"}, 
			dryRun=false,
			monochrome=true			
		)





public class TestRunner 
{

}
