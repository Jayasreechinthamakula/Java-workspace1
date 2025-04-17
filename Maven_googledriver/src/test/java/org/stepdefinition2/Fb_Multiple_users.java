package org.stepdefinition2;

import org.base_pojo.BaseClass;
import org.base_pojo.Pojo_Fb;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_Multiple_users extends BaseClass{
	
	@Given("open Chrome Browser")
	public void open_Chrome_Browser() {
	    chromBrowser();
	    launchUrl("https://www.facebook.com/");
	}

	@Then("enter Invalid {string} UserName")
	public void enter_Invalid_UserName(String string) {
	    Pojo_Fb p = new Pojo_Fb();
	    WebElement txtemail = p.getTxtemail();
	    fillTextBox(txtemail, string);
	}

	@Then("enter Invalid {string} Password")
	public void enter_Invalid_Password(String string) {
		 Pojo_Fb p = new Pojo_Fb();
		 WebElement txtpass = p.getTxtpass();
		 fillTextBox(txtpass, string);
	}
	@When("click Login")
	public void click_Login() {
	        Pojo_Fb p = new Pojo_Fb();
	        WebElement buttonLogin = p.getButtonLogin();
	        btnclick(buttonLogin);
	}

	@Then("close Browser")
	public void close_Browser() {
	    //driver.close();
	}

}
