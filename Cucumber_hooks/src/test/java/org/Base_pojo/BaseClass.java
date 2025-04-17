package org.Base_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	
	//method
	public static void maxwindow() {
		driver.manage().window().maximize();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void browserclose() {
		driver.close();

	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void quite() {
       driver.quit();

	}
	public static void pageurl() {
		String currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
	}
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static void btnclick(WebElement ele) {
		ele.click();

	}

	
	
	
	

}


