package com.apex.pom.ecommerce.test.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class EcommerceBaseTest {
	protected WebDriver driver = null;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = BrowserFactory.setup("Firefox");
		  //driver = new FirefoxDriver();
		
		  driver.get("http://ecommerce.saipratap.net/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	}

	@AfterMethod
	public void cleanUp() {
		  driver.close();
	}

}
