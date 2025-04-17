package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\cjaya\\eclipse-workspace1\\Cucumber_fb\\src\\test\\resources\\Feature_file\\FB_Login.Feature"
,glue ={"org.stepdefinition"}, plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json/"})

public class Runner_fb {

	
}





//plugin ="{\"json:target/cucumber.json\"}"),

//plugin ={"pretty", "html:target/cucumber-reports"}