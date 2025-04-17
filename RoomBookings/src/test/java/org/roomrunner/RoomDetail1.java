package org.roomrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\cjaya\\eclipse-workspace1\\RoomBookings\\src\\test\\resources\\RoomFeature\\roomdetail.Feature",
glue = "org.roomstepdefinition")
public class RoomDetail1 {
	

}
