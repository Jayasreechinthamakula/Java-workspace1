package org.runner;

import org.junit.runner.RunWith;

 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
                                 //path of feature file
@CucumberOptions(features ="C:\\Users\\cjaya\\eclipse-workspace1\\CucumberProject1\\src\\test\\resources\\FeatureFile\\login.Feature",
glue = "org.stepdefinition",plugin ="{\"json:target/cucumber.json\"}")
        //path of step definition file       
public class TestRunner {

	
}
