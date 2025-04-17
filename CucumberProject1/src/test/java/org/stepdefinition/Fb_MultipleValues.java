package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.pojo1.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_MultipleValues extends BaseClass{
	@Given("to launch chrome browser and hit the url")
	public void to_launch_chrome_browser_and_hit_the_url() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		launchUrl("https://www.facebook.com/");
	    maxwindow();
		
	}
	
	

@When("To Enter Valid username in  email field")
public void to_Enter_Valid_username_in_email_field() {
	
	PojoClass p = new PojoClass();
	WebElement txtemail = p.getTxtemail();
	fillTextBox(txtemail, "jayasree");
	
}

@When("To enter invalid Password in password field")
public void to_enter_invalid_Password_in_password_field() {
	
	PojoClass p = new PojoClass();
	WebElement txtpass = p.getTxtpass();
	fillTextBox(txtpass, "12345");
   
}

@When("To Click The Login buttin")
public void to_Click_The_Login_buttin() {
	PojoClass p = new PojoClass();
	
	WebElement buttonLogin = p.getButtonLogin();
	btnclick(buttonLogin);
 
}

@Then("To Close the  Chrome browser")
public void to_Close_the_Chrome_browser() {
	
	
	browserclose();
   
}


	
	
	
	
	
	
	
}
