package com.apex.pom.ecommerce.test.login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.pom.ecommerce.test.Inbox.InboxPage;
import com.apex.pom.ecommerce.test.core.EcommerceBaseTest;
import com.apex.pom.ecommerce.test.core.JxlUtility;

public class LoginTest extends EcommerceBaseTest implements LoginConstants {

	@DataProvider(name = "getData")
	public Object[][] getLoginData() {
		return JxlUtility.getData("ecommerce_ids.xls", "Sheet1", "ecommerce_ids");

	}

	@Test(dataProvider = "getData")
	public void sucessfulLogin(String emailId, String pwd) throws Exception {
		LoginPage loginpage = new LoginPage(driver);
		InboxPage inboxpage=loginpage.clickOnLogin(emailId, pwd);
		Assert.assertEquals(inboxpage.getTitle(), LOGGED_IN_TITLE);
		Assert.assertEquals(inboxpage.getUrl(), LOGGED_IN_URL);
		//System.out.println(loginpage.getTitle());
		//System.out.println(loginpage.getUrl());
	}
}
