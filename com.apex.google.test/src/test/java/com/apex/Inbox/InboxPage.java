package com.apex.Inbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.apex.test.core.ApexBasePage;

public class InboxPage extends ApexBasePage implements InboxConstants{

	public InboxPage(WebDriver driver)
	{this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
