package com.apex.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apex.Inbox.InboxPage;
import com.apex.test.core.ApexBasePage;

public class LoginPage extends ApexBasePage implements LoginConstants {
	
	@FindBy(id=LoginConstants.EMAIL_ID_LOCATOR)
	WebElement emailIdElm;
	@FindBy(id=LoginConstants.NEXT_BTN_ID_LOCATOR)
	WebElement nextBtnElm;
	@FindBy(name=LoginConstants.PASSWOR_NAME_LOCATOR)
	WebElement passwordElm;
	@FindBy(id = LoginConstants.PASSWORD_NEXT_ID_LOCATOR)
	WebElement passwordNextElm;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public InboxPage clickOnLogin(String emailId, String password) throws Exception
	{	emailIdElm.sendKeys(emailId);
		Thread.sleep(4000);
		nextBtnElm.click();
		Thread.sleep(4000);
		passwordElm.sendKeys(password);
		Thread.sleep(4000);
		passwordNextElm.click();
		Thread.sleep(4000);
	 return new InboxPage(driver);
	 
	
	}
}
