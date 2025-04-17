package org.roomstepdefinition;

import org.roomhelper.BaseClassRoom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RoomHome  extends BaseClassRoom{
	
	@Given("open the chrome Browser")
	public void open_the_chrome_Browser() {
	  chromeBrowser();
	  launchUrl("https://personal-a8obpdzf.outsystemscloud.com/BookingsNew/Home?_ts=638436811936475237");
	  maxwindow();
	}

	@Then("select home tab")
	public void select_home_tab() {
	    
	}


}
