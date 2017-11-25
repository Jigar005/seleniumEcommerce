package com.apex.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EcommerceOrderTest extends EcommerceBaseTest implements EcommerceOrderConstants {
	@Test(priority = 1)
	public void login() throws Exception {
		driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/div/ul/li[7]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("Mehta@rocking.com");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement
		(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/form/table/tbody/tr[5]/td/a/div"))
		.click();
	}

	@Test(priority = 2)
	public void order() throws Exception {
		// Click on link Product
		driver.findElement(By.xpath(PRODUCTMENU_XPATH)).click();
		;
		Thread.sleep(2000);
		// Product Dell Inspiron 19R view
		driver.findElement(By.xpath(DELL_19R_XPATH)).click();
		;
		Thread.sleep(2000);
		// Add to Cart
		driver.findElement(By
				.xpath(ADDCART_XPATH))
		.click();
		Thread.sleep(10000);
		// Check Out
		driver.findElement(By.className(CHECKOUT_CLASSNAME)).click();
		// WORKINGWHEN
		// ONEdriver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/a/div")).click();
		Thread.sleep(4000);
		// Continue
		driver.findElement(By
				.xpath(CONTINUE_XPATH))
		.click();
		Thread.sleep(4000);
		// Postal Option click radio button
		// driver.findElement(By.id("shipopt")).isSelected();
		// driver.findElement(By.id("shipopt")).click();
		driver.findElement(By
				.xpath(UPDATECONTINUE_XPATH))
		.click();
		// driver.findElement(By.cssSelector("input[id='shipopt']")).click();
		Thread.sleep(4000);
		// Click on continue to payment
		driver.findElement(By
				.xpath(PAYMENT_CONTINUE_XPATH))
		.click();
		Thread.sleep(4000);
		// Click on continue on payment page
		driver.findElement(By
				.xpath(CONTINUEONPAYMENT_XPATH))
		.click();
		Thread.sleep(4000);
		// Click on continue on discount code page
		driver.findElement(By
				.xpath(CONTINUE_DISCOUNTCODE_XPATH))
		.click();
		Thread.sleep(4000);
		// Click on secure payment
		driver.findElement(By.xpath(SECUREPAYMENT_XPATH)).click();

	}
}
