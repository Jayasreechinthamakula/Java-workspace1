package org.pojo1;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass  extends BaseClass{

	
       public PojoClass() {
    	   PageFactory.initElements(driver,this);
	}	

	
	@FindBy(id="email")
	private WebElement txtemail; 
	
	@FindBy(id="pass")
	private WebElement txtpass; 
	
    @FindBys({
		@FindBy(xpath ="//button[@name='login']"),
		@FindBy(xpath = "//button[@type='submit']")
    })
	private WebElement buttonLogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(WebElement txtemail) {
		this.txtemail = txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public void setButtonLogin(WebElement buttonLogin) {
		this.buttonLogin = buttonLogin;
	}
	
}
