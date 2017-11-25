package com.apex.pom.ecommerce.test.Inbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.apex.pom.ecommerce.test.core.EcommerceBasePage;

public class InboxPage extends EcommerceBasePage implements InboxConstants{

	public InboxPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
