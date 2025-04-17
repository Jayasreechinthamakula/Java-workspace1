package org.stepdefinition;

import org.Base_pojo.BaseClass;
import org.Base_pojo.PojoAmazon;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_login extends BaseClass{
	

@Given("open chrome browser")
public void open_chrome_browser() {
    chromeBrowser();
    launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16968249923816764072%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062008%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}

@When("enter email in username field")
public void enter_email_in_username_field() {
   PojoAmazon p = new PojoAmazon();
   WebElement textemail = p.getTextemail();
   fillTextBox(textemail,"jaya@gmail.com");
}

@When("click continue Button")
public void click_continue_Button() {
	 PojoAmazon p = new PojoAmazon(); 
	 WebElement continueButton = p.getContinueButton();
	 btnclick(continueButton);
}

@When("Enter password")
public void enter_password() {
	 PojoAmazon p = new PojoAmazon();
	 WebElement textpassword = p.getTextpassword();
	 fillTextBox(textpassword,"123456");
}

@When("click signin Button")
public void click_signin_Button() {
	 PojoAmazon p = new PojoAmazon();
	 WebElement signinButton = p.getSigninButton();
	 btnclick(signinButton);
}

@Then("close browser")
public void close_browser() {
   
}

}
