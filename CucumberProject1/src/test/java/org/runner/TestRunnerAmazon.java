package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\cjaya\\eclipse-workspace1\\CucumberProject1\\src\\test\\java\\org\\stepdefinition\\AmazonSignin.java",
 glue = "org.stepdefinition")
public class TestRunnerAmazon {

}
