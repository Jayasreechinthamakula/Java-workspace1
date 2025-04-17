package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo1.PojoAmazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSignin extends BaseClass {
	
	@Given("To Launch The Chrome Browser and Hit the Url")
	public void to_Launch_The_Chrome_Browser_and_Hit_the_Url() {
	    chromeBrowser();
	    launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104188%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1270270467178219151%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062082%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    maxwindow();
	}

	@When("To enter valid user in email field")
	public void to_enter_valid_user_in_email_field() {
	   PojoAmazon a = new PojoAmazon();
	   WebElement textemail = a.getTextemail();
	   fillTextBox(textemail,"cjayasree01@gmail.com");
	}

	@When("To click continue buttton")
	public void to_click_continue_buttton() {
		PojoAmazon a = new PojoAmazon();
		WebElement continueButton = a.getContinueButton();
		continueButton.click();
	}

	@When("To Enter Invalid password in password Field")
	public void to_Enter_Invalid_password_in_password_Field() {
		PojoAmazon a = new PojoAmazon();
		WebElement textpassword = a.getTextpassword();
	    fillTextBox(textpassword,"12345");
	    
	}

	@When("To click signin button")
	public void to_click_signin_button() {
		PojoAmazon a = new PojoAmazon();
		WebElement signinButton = a.getSigninButton();
		signinButton.click();
	   
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		browserclose();
	    
	}

}
