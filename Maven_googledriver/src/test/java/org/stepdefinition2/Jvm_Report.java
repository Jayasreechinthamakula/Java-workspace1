package org.stepdefinition2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Jvm_Report {
	public static void jvmreport(String jsonpath) {
//		1=create class
//		2=add dependency cucumber report-4.11.2
		//>>>file location-jvm report
		File f = new File("C:\\Users\\cjaya\\eclipse-workspace1\\Maven_googledriver\\JVM report");
		//>>>add details to the report using Configuration class from  net.masterthought.cucumber.Configuration
		//method--
		Configuration c = new Configuration(f, jsonpath);
		c.addClassifications("browser name","chrome");
		c.addClassifications("chrome version", "124.0.6367.119");
		//>>>add json path in list
		List<String>  li = new ArrayList<>();
		li.add(jsonpath);
		//>>>report builder class
		//>>>generateReports()
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		

	}

}
