package org.reports_generation;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon_1 extends BaseClass {
	
	@BeforeClass
	private void bc() {
		EdgeBrowser();
		launchUrl("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=16441649747088629660&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062008&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		

	}
	@AfterClass
	private void af() {
		browserclose();

	}
	@Test
	private void tc() {
	WebElement element = driver.findElement(By.xpath("//img[@alt='ACs']"));
	element.click();

	}


}
