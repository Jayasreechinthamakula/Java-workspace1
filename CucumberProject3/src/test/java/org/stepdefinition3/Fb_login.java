package org.stepdefinition3;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo1.Amazon_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Fb_login extends BaseClass {
	@Given("To Launch Chromebrowser and Hit Url")
	public void to_Launch_Chromebrowser_and_Hit_Url() {
	   chromeBrowser();
	   launchUrl("https://www.facebook.com/");
	   maxwindow();
	}

	
	
	@Given("To Enter Invalid Email Or Username inTextfield")
	public void to_Enter_Invalid_Email_Or_Username_inTextfield() {
		Amazon_pojo a = new Amazon_pojo();
		WebElement textemail = a.getTextemail();
		fillTextBox(textemail,"java@gmail.com");
		
		
	}

	@Given("To Enter Invalid Password in passFild")
	public void to_Enter_Invalid_Password_in_passFild() {
		Amazon_pojo a = new Amazon_pojo();
		WebElement textpassword = a.getTextpassword();
		fillTextBox(textpassword,"12345678");
	}

	@Given("To click login button")
	public void to_click_login_button() {
		Amazon_pojo a = new Amazon_pojo();
		WebElement continueButton = a.getContinueButton();
		continueButton.click();
	}

	@Then("To Close Web Browser")
	public void to_Close_Web_Browser() {
		browserclose();
	    
	}



}
