package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition2.Jvm_Report;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\cjaya\\eclipse-workspace1\\Maven_googledriver\\src\\test\\resources\\Feature\\fb_multiple_users.Feature",
glue = "org.stepdefinition2",
plugin = {"html:Html Reports",
		"junit:Junit Report\\junit_xmlreport.xml",
		"json:Json report\\jsonreport.json"
})

public class Fb_runner {
	
	@AfterClass
	public static void ac() {
		Jvm_Report.jvmreport("C:\\Users\\cjaya\\eclipse-workspace1\\Maven_googledriver\\Json report\\jsonreport.json");

	}
	
	

}
