package com.apex.pom.ecommerce.test.Order;
import com.apex.pom.ecommerce.test.login.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.apex.pom.ecommerce.test.core.EcommerceBaseTest;

public class OrderTest extends EcommerceBaseTest implements OrderConstants {
	
	@Test(priority=2)
	public void orderTest() throws Exception
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickOnLogin("Mehta@rocking.com", "1234");
		OrderPage orderpage = new OrderPage(driver);
		orderpage.orderProcess();
		Assert.assertEquals(orderpage.getEcommerceTitle(), "PayPal Checkout - Please try again.");
		
	}

}
