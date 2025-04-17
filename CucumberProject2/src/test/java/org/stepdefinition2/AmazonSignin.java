package org.stepdefinition2;

import org.Base1.BaseClass2;
import org.openqa.selenium.WebElement;
import org.pojo.AmazonPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonSignin extends BaseClass2 {
	

@Given("To Launch Chrome and Hit Url")
public void to_Launch_Chrome_and_Hit_Url() {
    chromeBrowser();
	launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104188%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1401636764425141550%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062082%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	maxwindow();
    
}
	
	@Given("To Enter Valid UserName or Phone No")
	public void to_Enter_Valid_UserName_or_Phone_No() {
	    AmazonPojo a = new AmazonPojo();
	    WebElement textemail = a.getTextemail();
	    fillTextBox(textemail,"7799374544");
	}

	@Given("To click continue")
	public void to_click_continue() {
	   AmazonPojo a = new AmazonPojo();
	   WebElement continueButton = a.getContinueButton();
	   continueButton.click();
	}

	@Given("To enter invalid Password")
	public void to_enter_invalid_Password() {
	 AmazonPojo a = new AmazonPojo();
	 WebElement textpassword = a.getTextpassword();
	 fillTextBox(textpassword,"123456");
	}

	@Given("To click signin")
	public void to_click_signin() {
	    AmazonPojo a = new AmazonPojo();
	    WebElement signinButton = a.getSigninButton();
	    signinButton.click();
	}

	@Then("To Close Browser")
	public void to_Close_Browser() {
	    browserclose();
	}


}
