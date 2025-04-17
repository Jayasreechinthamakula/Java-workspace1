package org.stepdefinition;

import org.base_pojo.BaseClass;
import org.base_pojo.Pojo_Fb;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_login extends BaseClass {
	

@Given("open edge driver")
public void open_edge_driver() {
	chromBrowser();
	launchUrl("https://www.facebook.com/");
}

@When("enter user email")
public void enter_user_email() {
    Pojo_Fb p = new Pojo_Fb();
    WebElement txtemail = p.getTxtemail();
    fillTextBox(txtemail, "java@gmail.com");
    
}

@When("enter password")
public void enter_password() {
    Pojo_Fb p = new Pojo_Fb();
    WebElement txtpass = p.getTxtpass();
    fillTextBox(txtpass, "java123");
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
