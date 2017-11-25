package com.apex.pom.ecommerce.test.core;
import org.openqa.selenium.WebDriver;


public class EcommerceBasePage {
	protected WebDriver driver =null;
	

	public String getEcommerceTitle()
	{
		return driver.getTitle();
	}
	public String getEcommerceCurrentUrl()
	{
		return driver.getCurrentUrl();
	}

}
