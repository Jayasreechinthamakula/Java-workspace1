package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 {
	
	@BeforeClass
	private void bc() {
		System.out.println("AfterClass");

	}
	@AfterClass
	private void ac() {
		System.out.println("AfterClass");

	}
	
	@Test()
	private void tc1() {
		System.out.println("testcase 1");

	}
	@Test(priority = 0,invocationCount = 2)//to run multiple times
	private void tc2() {
		System.out.println("testcase 2");

	}
	@Test()
	private void tc3() {
		System.out.println("testcase 3");

	}


}
