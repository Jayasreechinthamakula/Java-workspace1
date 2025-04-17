package org.stepdefinition;

import org.Base_pojo.BaseClass;
import org.Base_pojo.PojoClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Fb_login extends BaseClass{
	@Given("open Chrome Browser")
	public void open_Chrome_Browser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@Then("enter Invalid {string} UserName")
	public void enter_Invalid_UserName(String string) {
	  PojoClass p  =new PojoClass();
	  WebElement txtemail = p.getTxtemail();
	  fillTextBox(txtemail, string);
	  
	}

	@Then("enter Invalid {string} Password")
	public void enter_Invalid_Password(String string) {
		PojoClass p  =new PojoClass();
		WebElement txtpass = p.getTxtpass();
		fillTextBox(txtpass, string);
	}

	@Then("click Login")
	public void click_Login() {
		PojoClass p  =new PojoClass();
		WebElement buttonLogin = p.getButtonLogin();
		btnclick(buttonLogin);
	}

	@Then("close Browser")
	public void close_Browser() {
	 
	}

}
