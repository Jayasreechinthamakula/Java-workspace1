package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\cjaya\\eclipse-workspace1\\CucumberProject2\\src\\test\\resources\\Feature",
glue = "org.stepdefinition2")

public class RunnerAmazon{

}
