package com.apex.pom.ecommerce.test.core;

import org.openqa.selenium.WebDriver;


public class EcommerceBasePage {
	protected WebDriver driver = null;

	public String getTitle() {
		return driver.getTitle();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

}
