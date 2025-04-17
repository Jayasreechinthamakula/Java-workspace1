package org.stepdefinition2;

import org.Base1.BaseClass2;
import org.openqa.selenium.WebElement;
import org.pojo.FbPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageFb extends BaseClass2 {
	

@Given("To Launch Chrome and Hit Url")
public void to_Launch_Chrome_and_Hit_Url() {
	chromeBrowser();
	launchUrl("https://www.facebook.com/");
	maxwindow();
    
}

@Given("To Enter Invalid Email Or Username")
public void to_Enter_Invalid_Email_Or_Username() {
   FbPojo a2 = new FbPojo();
   WebElement txtemail = a2.getTxtemail();
   fillTextBox(txtemail,"abc.gmail.com");
}

@Given("To Enter Invalid Password")
public void to_Enter_Invalid_Password() {
    FbPojo a2 = new FbPojo();
    WebElement txtpass = a2.getTxtpass();
    fillTextBox(txtpass,"12345");
}

@Given("To click login")
public void to_click_login() {
    FbPojo a2 = new FbPojo();
    WebElement buttonLogin = a2.getButtonLogin();
    buttonLogin.click();
    
}

@Then("To Close Web Browser")
public void to_Close_Web_Browser() {
   browserclose();
}


}
