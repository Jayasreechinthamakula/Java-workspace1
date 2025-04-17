package org.stepdefinition;

import org.base.BaseClass;
import org.base.Pojo_Fb;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass{
	
	@Given("open edge browser")
	public void open_edge_browser() {
		EdgeBrowser();
		launchUrl("https://www.facebook.com/");
	    
	}

	@When("enter  invalid user email")
	public void enter_invalid_user_email() {
		Pojo_Fb p= new Pojo_Fb();
		  WebElement txtemail = p.getTxtemail();
		  fillTextBox(txtemail,"jaya@gmail.com");
	}

	@When("enter  invalid password")
	public void enter_invalid_password() {
		Pojo_Fb p = new Pojo_Fb();
		  WebElement txtpass = p.getTxtpass();
		  fillTextBox(txtpass,"123456");
	}

	@When("click Login")
	public void click_Login() {
		 Pojo_Fb p = new Pojo_Fb();
		    WebElement buttonLogin = p.getButtonLogin();
		    btnclick(buttonLogin);
	}

	@Then("close Browser")
	public void close_Browser() {
	   close_Browser();
	}


}
