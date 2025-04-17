package org.pojo1;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAmazon extends BaseClass {
	public PojoAmazon() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//input[@type='email']")
	private WebElement textemail;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Textpassword;
	
	
	
	public WebElement getTextemail() {
		return textemail;
	}

	public void setTextemail(WebElement textemail) {
		this.textemail = textemail;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	public WebElement getTextpassword() {
		return Textpassword;
	}

	public void setTextpassword(WebElement textpassword) {
		Textpassword = textpassword;
	}

	public WebElement getSigninButton() {
		return signinButton;
	}

	public void setSigninButton(WebElement signinButton) {
		this.signinButton = signinButton;
	}
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signinButton;
}
