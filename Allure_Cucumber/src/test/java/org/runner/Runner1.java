package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith((Cucumber.class))
@CucumberOptions(features ="C:\\Users\\cjaya\\eclipse-workspace1\\Allure_Cucumber\\src\\test\\resources\\Feature_file1\\Fb_login.Feature",
glue ="org.stepdefinition", plugin = { "pretty", "html:target/cucumber-html-reports",
        "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" })
public class Runner1 {

}
