package com.apex.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {
	protected WebDriver driver = null;
	@BeforeMethod
	public void setUp() {
		  driver = new FirefoxDriver();
		  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
	}

	@AfterMethod
	public void cleanUp() {
		  driver.close();
	}
}
