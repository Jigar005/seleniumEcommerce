package com.apex.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EcommerceLoginTest_Dp extends EcommerceBaseTest implements EcommerceLoginConstant{
	// Correct id and password successful login
	@Test(priority = 1)
	public void loginSuccess() throws Exception {
		driver.findElement(By.xpath(ACCOUNT_LOGIN_PAGE_LINK)).click();
		Thread.sleep(4000);
		driver.findElement(By.name(EMAIL_BOX_NAME)).sendKeys("Mehta@rocking.com");
		Thread.sleep(4000);
		driver.findElement(By.name(PASSWORD_BOX_NAME)).sendKeys("1234");
		driver.findElement(By
				.xpath(LOGIN_BUTTON_XPATH))
		.click();
		Thread.sleep(10000);
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(
				driver.getCurrentUrl().contains("http://ecommerce.saipratap.net/thankyoumessage.php?msg=login"));
		driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/ul/li[10]/a")).click();
		Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		Assert.assertTrue(driver.getCurrentUrl().contains("http://ecommerce.saipratap.net/index.php"));
	}
	
	@DataProvider (name = "getData")
public Object[][] getDataMethod()
{
		return getData("google_ids.xls","Sheet1" ,"GoogleIds" );
//		String[][] ids =
//			{
//					{"user1","password1"},
//					{"user2","password2"},
//					{"user3","password3"},
//					{"user4","password4"}
//			};
}
	// Wrong password unsuccessful login
	@Test(priority = 2, dataProvider = "getData")
	public void loginUnsuccess(String emailId, String pwd) throws Exception {
		Thread.sleep(4000);
		driver.findElement(By.xpath(ACCOUNT_LOGIN_PAGE_LINK)).click();
		Thread.sleep(4000);
		driver.findElement(By.name(EMAIL_BOX_NAME)).sendKeys(emailId);
		Thread.sleep(4000);
		driver.findElement(By.name(PASSWORD_BOX_NAME)).sendKeys(pwd);
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div")).click();
		// Assert.assertTrue(driver.getTitle().contains("Ez Shop Online"));
		// Assert.assertTrue(driver.getCurrentUrl().contains("http://ecommerce.saipratap.net/index.php"));
	}
}
